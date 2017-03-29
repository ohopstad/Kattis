import java.util.Scanner;

class Bijele{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String [] t = sc.nextLine().split(" ");
	int[] in = new int[6];
	for(int i = 0; i<6;i++)
	    in[i] = Integer.parseInt(t[i]);
	int[] out = {1, 1, 2, 2, 2, 8};


	for (int i= 0 ; i<out.length; i++)
	    out[i] = out[i]-in[i];
	    

	System.out.println(out[0]+" "+out[1]+" "+out[2]+" "+out[3]+" "+out[4]+" "+out[5]);
    }
}