import java.util.Scanner;

class fizzbuzz{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	String[] in = sc. nextLine().split(" ");
	sc.close();
	for(int i = 1; i<=Integer.parseInt(in[2]);i++){
	    if(i%Integer.parseInt(in[0])==0){
		if(i%Integer.parseInt(in[1])==0)
		    System.out.println("Fizzbuzz");
		else System.out.println("Fizz");
		
	    }
	    else if(i%Integer.parseInt(in[1])==0)
		System.out.println("Buzz");
	    else System.out.println(i);
		
	} 
	
    }


}