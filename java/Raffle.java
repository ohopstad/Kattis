import java.util.Scanner;
class Raffle{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String[] in = sc.nextLine().split(" ");
	double n = Double.parseDouble(in[0]), p=Double.parseDouble(in[1]);

	//chance to win with 1 ballot.
	double chance = p / (n+1);
	//now to the fun stuff::
      	for(double m = 1, ny=1 ; (ny = (m+1)*(n+m+1-p)/(m*(n+m+1))) >= 1; m++ ){
	    chance *= ny;
	}
	
	//	System.out.format("%.8e\n",chance);
	System.out.println(chance);
    }
}