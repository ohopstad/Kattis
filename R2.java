/*
The number S
 is called the mean of two numbers R1
 and R2
 if S
 is equal to (R1+R2)/2
. Mirko’s birthday present for Slavko was two integers R1
 and R2
. Slavko promptly calculated their mean which also happened to be an integer but then lost R2
! Help Slavko restore R2
.

*/
import java.util.Scanner;
public class R2{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int R1 = sc.nextInt(), 
	    S = sc.nextInt();

	// (R1 + R2) / 2 = S -> 2*S - R1 = R2

	System.out.println((2 * S) - R1);
    }
}