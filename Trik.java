import java.util.Scanner;

class Trik{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String in = sc.nextLine();
	int ball = 1;
	for(int i = 0;i < in.length();i++){
	    if(in.charAt(i) == 'A'){
		if(ball == 1)
		    ball = 2;
		else if (ball == 2)
		    ball = 1;
		
	    }
            else if(in.charAt(i) == 'B'){
		if(ball == 2)
		    ball = 3;
		else if(ball == 3)
		    ball = 2;
		
	    }
            else if(in.charAt(i) == 'C'){
		if (ball == 1)
		    ball = 3;
		else if (ball == 3)
		    ball = 1;
	    }
	}
	System.out.println(ball);
    }
}