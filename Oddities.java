import java.util.Scanner;

    class Oddities{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] num = new int[Integer.parseInt(sc.nextLine())];
	String[] oe = new String[num.length];
	for(int i=0; i<num.length;i++){
	    num[i] = Integer.parseInt(sc.nextLine());
	    if(num[i] % 2 == 0)
		oe[i] = " is even";
	     else
		 oe[i] = " is odd";
	}
	for(int i = 0; i<num.length;i++)
	    System.out.println(num[i]+oe[i]);
    } 
}