import java.util.Scanner;

class stockbroker{
    public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	double peng = 100, stock = 0;
	int pres = 0;
	boolean up = false;
	for(int i = Integer.parseInt(sc.nextLine()) - 1, prev = Integer.parseInt(sc.nextLine()); --i >= 0; prev = pres){
	    pres = Integer.parseInt(sc.nextLine());
	    if (up && pres < prev){
		peng += stock * prev;
		stock = 0;
		up = false;
	    }
	    if (!up && pres > prev) {
		stock = Math.min(peng/prev, 100000L);
		peng -= stock * prev;
		up = true;
	    }
	} 
	    
	System.out.println(peng + stock * pres);
    }
}