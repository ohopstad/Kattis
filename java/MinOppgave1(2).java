// Java Document
import java.util.Scanner;
import java.io.*;

class MinOppgave1 {
	public static void main (String args []){
		//handleliste med mulighet for å krysse ut
    Scanner in = new Scanner(System.in);
    //Erklering av variabler
	char x;
	String a;
    String b;
    String c;
    String d;
    String e;
    boolean A = false;
    boolean B = false;
    boolean C = false;
    boolean D = false;
    boolean E = false;
    System.out.println("skriv inn vare/oppgave 1 av 5");
    a = in.nextLine();
    System.out.println("skriv inn vare/oppgave 2 av 5");
    b = in.nextLine();
    System.out.println("skriv inn vare/oppgave 3 av 5");
    c = in.nextLine();
    System.out.println("skriv inn vare/oppgave 4 av 5");
    d = in.nextLine();
    System.out.println("skriv inn vare/oppgave 5 av 5");
    e = in.nextLine();
    system.out.println("skriv nå inn bokstaven for den første varen du har kjøpt,");
    system.out.println("eller oppgaven du har gjort.");
    x = in.nextLine();
    if(x.equals("a")){ 
		A = true;
		x= in.nextLine();
    	if(x.exuals("b"){
			B=true;
			x = in.nextLine();
    		if(x.equals("c"){
				C=true;
				x = in.nextLine();
    			if(x.equals("d"){
					D=true;
					x = in.nextLine();
    				if(x.equals("e"){E=true;}
    				else{ System.out.println("vennligst velg e");
					}
				}
    			else if(x.equals("e"){
					E=true;
					x = in.nextLine();
    				if(x.equals("d"){D=true;}
    				else{ System.out.println("vennligst velg d");
					}
				}
    			else{ System.out.println("vennligst velg d eller e");
				}
			}
    		else if(x.equals("d"){
				D=true;
				x = in.nextLine();
    			else if(x.equals("c"){
					C=true;
					x = in.nextLine();
    				if(x.equals("e"){E=true;}
    				else{ System.out.println("vennligst velg e");
					}
				}
    			else if(x.equals("e"){
					E=true;
					x = in.nextLine();
    				if(x.equals("c"){C=true;}
    				else{ System.out.println("vennligst velg c");
					}
				}
    			else{ System.out.println("vennligst velg c eller e");
				}
			}
		}
    	else if(x.equals("c"){
			C=true;
			x = in.nextLine();
    		else if(x.exuals("b"){
				B=true;
				x = in.nextLine();
    			if(x.equals("d"){
					D=true;
					x = in.nextLine();
					if(x.equals("e"){E=true;}
    				else{ System.out.println("vennligst velg e");
					}
				}
    			else if(x.equals("e"){
					E=true;
					x = in.nextLine();
					if(x.equals("d"){D=true;}
					else{ System.out.println("vennligst velg d");
					}
				}
    			else{ System.out.println("vennligst velg d eller e");
				}
    		else if(x.equals("d"){D=true;}
    		else if(x.equals("e"){E=true;}
    		else{ System.out.println("vennligst velg a, b, c, d eller e");
			}
		}
		
   
	}
}