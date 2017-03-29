import java.util.Scanner;

class easiest{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String in ;
	int org;
	int sum;
	int[] svar = new int[1000000];
	int i = 0;
	boolean done = true; 
	int y = 0;

	while(done){
	    in = sc.nextLine();
	    if(!in.equals("0")){ 
		org = summe(in);
		svar[i] = finn(org, Integer.parseInt(in));
		y++;
		i++;
	    }
	    else done = false;
	}
	for(int g = 0; g<y;g++)
	    System.out.println(svar[g]);

    }
    static int summe(String i){
	int x = 0;
	for (int l = 1 ; l<=i.length(); l++){
	    x += Integer.parseInt(i.substring(l-1, l));
	}
	return x;
    }
    static int finn(int k, int g ){
	int x = 0;
	int i = 11;
	while(x == 0){
	    if (summe(""+i * g) == k)
		return i;
	    i++;
	}
	return x;
    }
}