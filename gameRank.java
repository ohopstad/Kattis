import java.util.Scanner;

class game{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] star = {0,5,5,5,5,5,5,5,5,5,5,4,4,4,4,4,3,3,3,3,3,2,2,2,2,2};
	String in = sc.nextLine();
	int rank = 25;
	int stars = 0;
	int wins = 0;
       
	for (int m = 0; m<in.length();m++){
	    if (in.charAt(m) == 'W'){
		stars++;
		wins++;		
		if(wins>2 && rank>5) stars++;
	    }
	    else if(in.charAt(m) == 'L'){
		if (rank<=20) stars--;
		wins = 0;
	    }
	    if(stars > star[rank] && rank != 0){
		stars = stars - star[rank];
		rank--;	      
	    }
	    else if(stars<0){
		if(rank != 0 && rank != 20 && rank != 25){
		    rank ++;
		    stars = star[rank] + stars;
		}
		else if (rank == 20 || rank == 25)
		    stars = 0;
	    }
	}
	if(rank>0) System.out.println(rank);
	else System.out.println("Legend");
    }
}