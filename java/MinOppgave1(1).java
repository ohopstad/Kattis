// Java Document
import java.util.Scanner;
import java.util.Random;

class TullmedOppgave1 {
	public static void main (String args []){
	    Scanner in;
	    in = new Scanner(System.in);
	    long tid = System.currentTimeMillis();
	    Reaksjon();
	    Random rand = new Random() ;
	    String alphabet = "abcdefghijklmnopqrstuvwxyz";
	    String B = "" + alphabet.charAt(rand.nextInt(alphabet.length()));
	    String usr = in.nextLine();
	    long ferdig = System.currentTimeMillis();
	    
	    if(usr.equals(B)){
		System.out.println("Grattulerer!!! spis kake og vaer stolt! :D");
		System.out.println("Du brukte " + (ferdig - tid) + " ms");
		return;
	    }
	    else{
		System.out.println("oioi, feil!");
	    }
	    usr = in.nextLine();
	    ferdig = System.currentTimeMillis();
	    
	    if(usr.equals(B)){
		System.out.println("Grattulerer!!! spis kake og vaer stolt! :D");
		System.out.println("Du brukte " + (ferdig - tid) + " ms");
		return;
	    }
	    else{
		System.out.println("oioi, feil!");
	    }
	    usr = in.nextLine();
	    ferdig = System.currentTimeMillis();
	    
	    if(usr.equals(B)){
		System.out.println("Grattulerer!!! spis kake og vaer stolt! :D");
		System.out.println("Du brukte " + (ferdig - tid) + " ms");
		return;
	    }
	    else{
		System.out.println("oioi, feil!");
		System.out.println("Du tapte etter " + (ferdig - tid) + " ms");
	    }

	}
    static void Reaksjon (){
	System.out.println("FORT!");
     System.out.println("Trykk på rett bokstav! du har tre forsøk.");
    }
}