import java.util.Scanner;

class pot{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String a = sc.nextLine(), b;
	int one = Integer.parseInt(a), two, three, x= 0;
	int[] sum = new int[10];
	for(int i = 0; i < one ; i++){
	    a = sc.nextLine();
	    three = Integer.parseInt(a.substring(a.length()-1));
	    two = Integer.parseInt(a.substring(0,a.length()-1));
	    x += Math.pow(two, three);
	}
	System.out.println(x);
    }

}