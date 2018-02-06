import java.util.Scanner;
class Twostones{
    public static void main(String[]args){
	int in = Integer.parseInt(new Scanner(System.in).nextLine());
	if(in % 2 == 0)System.out.println("Bob");
	else System.out.println("Alice");
    }
}