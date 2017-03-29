import java.util.Scanner;
import java.util.ArrayList;

class Simonsays{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int i = Integer.parseInt(sc.nextLine());
	ArrayList <String> in = new ArrayList <String>();
	for(int c= 0; c<i ; c++){
	    for (String s : sc.nextLine().split(" "))
	    in.add(s);
	}
	for (int c=0; c<in.size(); c++){
	    if(in.get(c).equals("Simon") && in.get(c+1).equals("says")){
		for(int u = c+2; u<in.size() && !in.get(u).equals("Simon"); u++){
		    System.out.print(in.get(u) + " ");
		}
		System.out.println(" ");
	    }
	}
    }
}