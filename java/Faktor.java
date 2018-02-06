import java.util.Scanner;

public class Faktor{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int articles = sc.nextInt(), 
	    impact = sc.nextInt() -1;

	// impact = citations / articles
	// citations = impact * articles

	System.out.println(articles * impact +1);
    }
}