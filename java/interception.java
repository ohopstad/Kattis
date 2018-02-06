import java.io.*;
import java.util.*;

public class God {
    private final int ingenH, c1, c2;
    private final boolean[] tatt; // tatt[x] = true if talk tatt by "endpoint solution"
    private final ArrayList<Talk> prat;
    private final List<List<Talk>> pratMye;
    private int[] sttop, staart, overlapp, nesteV, venstre, opt;
    private int sirkel;

    public God(int ingenH, ArrayList<Talk> prat, int c1, int c2) {
        this.ingenH = ingenH;
        this.prat = prat;
        this.c1 = c1;
        this.c2 = c2;
        this.tatt = new boolean[prat.size()+1];
        this.pratMye = new ArrayList<>(prat.size()+1);
        for (int i = 0; i <= ingenH; i++) pratMye.add(new ArrayList<>());

        sirkel = c2-c1+2;
        sttop = new int[sirkel + 1];
        staart = new int[sirkel + 1];
        overlapp = new int[sirkel + 1];
        nesteV = new int[sirkel + 1];
        venstre = new int[sirkel + 1];
        opt = new int[sirkel + 1];
    }

    public static class Pair {
        public int a,b;
        public Pair(int a, int b) { this.a = a; this.b = b; }

        @Override
        public String toString() {
            return String.format("<%d,%d>", a, b);
        }
    }

    public static class Talk {
        public int a,b,c,ix; // a < b
        public boolean isSameSide() { return c < 0; }
        public Talk(int a, int b, int c, int ix) {
            this.a = Math.min(a,b);
            this.b = Math.max(a,b);
            this.c = c;
            this.ix = ix;
        }
    }

    public void solveEndpoint(int ep, int c, int step, List<Pair> devices) {
        ArrayList<Talk> active = new ArrayList<>();
        byte[] started = new byte[this.prat.size()];
        for (int i = ep;; i+=step) {
            for (Talk talk : pratMye.get(i)) {
                if (started[talk.ix] == 1) {
                    devices.add(new Pair(i-step, i));
                    for (Talk at : active) {
                        tatt[at.ix] = true;
                        started[at.ix] = 2;
                    }
                    active.clear();
                }
            }
            if (i == c) break;
            for (Talk talk : pratMye.get(i)) {
                if (started[talk.ix] == 0) {
                    started[talk.ix] = 1;
                    active.add(talk);
                }
            }
        }

    }

    private boolean isUpperLeft(int h) { return h % 2 == 1 && h < c1; }
    private boolean isLowerLeft(int h) { return h % 2 == 0 && h < c1+1; }
    private boolean isUpperRight(int h) { return h % 2 == 1 && h > c2; }
    private boolean isLowerRight(int h) { return h % 2 == 0 && h > c2+1; }

    private int withinBounds(int h) {
        // Converts a house position to the closest position in middle area
        if (isUpperLeft(h)) return c1;
        if (isLowerLeft(h)) return c1+1;
        if (isUpperRight(h)) return c2;
        if (isLowerRight(h)) return c2+1;
        return h;
    }

    private int convert(int h) {
        // Converts a house position in the middle area to the circular enumeration
        // starting at c1 (0) to c2 to c2+1 to c1+1 and back.
        assert h % 2 == 0 || (h >= c1 && h <= c2);
        assert h % 2 == 1 || (h >= c1+1 && h <= c2+1);
        return h % 2 == 1 ? (h - c1) / 2 : c2 - c1 + 1 - (h - c1 - 1) / 2;
    }

    private int deconvert(int c) {
        // Converts in the other direction
        return c <= (c2 - c1) / 2 ? c1 + c * 2 : (c2 - c1 + 1 - c) * 2 + c1 + 1;
    }

    private List<Pair> solve() {
        for (Talk talk : prat) {
            pratMye.get(talk.a).add(talk);
            pratMye.get(talk.b).add(talk);
        }

        ArrayList<Pair> solution = new ArrayList<>();
        solveEndpoint(1, c1, 2, solution);
        solveEndpoint(2, c1+1, 2, solution);
        solveEndpoint(ingenH -1, c2, -2, solution);
        solveEndpoint(ingenH, c2+1, -2, solution);

        ArrayList<Pair> bestSubSolution = null;
        ArrayList<Pair> circular = new ArrayList<>(prat.size());

        for (int mask = 0; mask < 16; mask++) {
	    if (mask > 15) continue;
            ArrayList<Pair> subSolution = new ArrayList<>(bestSubSolution == null ? 16 : bestSubSolution.size() + 5);
            circular.clear();
            if ((mask & 1) > 0) subSolution.add(new Pair(c1 - 2, c1));
            if ((mask & 2) > 0) subSolution.add(new Pair(c1 - 1, c1 + 1));
            if ((mask & 4) > 0) subSolution.add(new Pair(c2, c2 + 2));
            if ((mask & 8) > 0) subSolution.add(new Pair(c2 + 1, c2 + 3));

            for (Talk talk : prat) {
                if (tatt[talk.ix]) continue;
                if ((mask & 1) > 0 && (isUpperLeft(talk.a) ^ isUpperLeft(talk.b))) continue;
                if ((mask & 2) > 0 && (isLowerLeft(talk.a) ^ isLowerLeft(talk.b))) continue;
                if ((mask & 4) > 0 && (isUpperRight(talk.b) ^ isUpperRight(talk.a))) continue;
                if ((mask & 8) > 0 && (isLowerRight(talk.b) ^ isLowerRight(talk.a))) continue;

                int a = convert(withinBounds(talk.a)), b = convert(withinBounds(talk.b));
                if ((talk.isSameSide() && talk.a % 2 == 1) || (!talk.isSameSide() && (talk.a % 2 == 1 ^ talk.c == c1))) {
                    circular.add(new Pair(a, b));
                } else {
                    circular.add(new Pair(b, a));
                }
            }

            List<Integer> circularSolution = solveCircular(circular);

            if (bestSubSolution == null || circularSolution.size() + subSolution.size() < bestSubSolution.size()) {
                for (int node : circularSolution) {
                    subSolution.add(new Pair(deconvert(node), deconvert((node + 1) % sirkel)));
                }
                bestSubSolution = subSolution;
            }
        }

        solution.addAll(bestSubSolution);

        return solution;
    }

    private List<Integer> solveCircular(ArrayList<Pair> segments) {
        if (segments.size() == 0) return new ArrayList<>();

        for (int i = 0; i <= sirkel; i++) {
            sttop[i] = -1;
            staart[i] = -1;
            overlapp[i] = Integer.MAX_VALUE;
        }
        boolean onlyOverlapping = true;
        for (Pair segment : segments) {
            if (segment.b == 0) segment.b = sirkel; // Don't treat these as overlapping intervals
            // Only consider non-overlapping segments
            if (segment.b > segment.a) {
                // If either of these are set, a shorter segment that this one overlaps is covering it
                if (segment.a > staart[segment.b] &&
                        (sttop[segment.a] < 0 || segment.b < sttop[segment.a])) {
                    staart[segment.b] = segment.a;
                    sttop[segment.a] = segment.b;
                    onlyOverlapping = false;
                }
            } else {
                if (segment.b < overlapp[segment.a]) {
                    overlapp[segment.a] = segment.b;
                }
            }
        }

        if (onlyOverlapping) {
            return Arrays.asList(0);
        }

        int lm = -1;
        for (int i = 0; i <= sirkel; i++) {
            if (staart[i] >= 0) {
                lm = Math.max(lm, staart[i]);
            }
            nesteV[i] = lm;
            if (nesteV[i] < 0) {
                venstre[i] = -1;
                opt[i] = 0;
            } else if (venstre[nesteV[i]] >= 0) {
                venstre[i] = venstre[nesteV[i]];
                opt[i] = opt[nesteV[i]] + 1;
            } else {
                venstre[i] = nesteV[i];
                opt[i] = 1;
            }
        }
        int overlapMinsttop = Integer.MAX_VALUE;
        int rightMost = nesteV[sirkel];
        boolean extraNeeded = true;

        for (int i = sirkel-1; i >= nesteV[sirkel]; i--) {
            if (opt[i] + 1 == opt[sirkel]) {
                int left = venstre[i] < 0 ? i : venstre[i];
                if (overlapMinsttop > left) {
                    rightMost = i;
                    extraNeeded = false;
                    break;
                }
            }

            overlapMinsttop = Math.min(overlapMinsttop, overlapp[i]);
        }


        ArrayList<Integer> sol = new ArrayList<>(opt[sirkel] + 1);
        int cur = rightMost;
        while (cur >= 0) {
            sol.add(cur);
            cur = nesteV[cur];
        }
        if (extraNeeded) {
            sol.add(0);
        }
        return sol;
    }

    public static void main(String[] args) throws FileNotFoundException {
//        long tm = System.currentTimeMillis();
//        Kattio io = new Kattio(new FileInputStream("surveillance.in"), System.out);
        Kattio io = new Kattio(System.in, System.out);
//        Kattio io = new Kattio(new FileInputStream("/Users/yarin/src/ncpc-2016/problems/surveillance/data/secret/07a.planted.in"),
//                new FileOutputStream("/Users/yarin/src/ncpc-2016/problems/surveillance/data/secret/07a.planted.out"));
        int n = io.getInt(), m = io.getInt(), c1 = io.getInt(), c2 = io.getInt();
        ArrayList<Talk> prat = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int a = io.getInt(), b = io.getInt();
            if (a%2 != b%2) {
                int c = io.getInt();
                prat.add(new Talk(a,b,c,i));
            } else {
                prat.add(new Talk(a,b,-1,i));
            }
        }

        List<Pair> solution = new God(n, prat, c1, c2).solve();

        io.println(solution.size());
        for (Pair device : solution) {
            io.println(device.a + " " + device.b);
        }

        io.close();
//        System.err.println("Time: " + (System.currentTimeMillis() - tm) + " ms");
    }


    private static class Kattio extends PrintWriter {
        Kattio(InputStream i, OutputStream o) {
            super(new BufferedOutputStream(o));
            r = new BufferedReader(new InputStreamReader(i));
        }

        public int getInt() {
            return Integer.parseInt(nextToken());
        }

        private BufferedReader r;
        private String line;
        private StringTokenizer st;
        private String token;

        private String peekToken() {
            if (token == null)
                try {
                    while (st == null || !st.hasMoreTokens()) {
                        line = r.readLine();
                        if (line == null) return null;
                        st = new StringTokenizer(line);
                    }
                    token = st.nextToken();
                } catch (IOException e) {
                }
            return token;
        }

        private String nextToken() {
            String ans = peekToken();
            token = null;
            return ans;
        }
    }
}
