
import java.util.Scanner;
public class QuadrantSelection{

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int[] xy = {sc.nextInt(), sc.nextInt()};

	if(xy[0] > 0){
	    if(xy[1] > 0){
		System.out.println(1);
	    }
	    else{
		System.out.println(4);
	    }
	}
	else{
	    if(xy[1] > 0){
		System.out.println(2);
	    }
	    else{
		System.out.println(3);
	    }
	}
    }
}