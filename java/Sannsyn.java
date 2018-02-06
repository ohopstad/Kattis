import java.util.Scanner;

class Sannsyn{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	String[] in = sc.nextLine().split(" ");
	double n = Double.parseDouble(in[0]);
	double p = Double.parseDouble(in[1]);

	double q = 0;
	double z = 0;
	double g = 0;
	double x = 0;
	for(double i = 0; i<=n; i++){
	    q = fillern(n, n-1, p-1, i);
	    z = fillern(n, n, p, i);
	    x = fillern(1, n, p, i);
	    x = q * x;
	    if (x>g ){
		g = x;
	    }
	}
	System.out.println(g);
    
    }
    static double ex(double i){
	double g = 1;
	for (double c = i; c > 1;c--){
	    g *= c;
	}
	return g;
    }
    static double fillern(double t, double n, double p, double i){
	double x = ((ex(n+t)-ex(n))/ex(i)) - ((ex(n+i) - ex(n+i-p))/ex(p));
	return x;
    }
}