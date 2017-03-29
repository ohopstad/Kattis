class Cetvrta{
    public static void main(String[]args){
	java.util.Scanner sc = new java.util.Scanner(System.in);

	int[] one = {sc.nextInt(),sc.nextInt()}, two = {sc.nextInt(),sc.nextInt()}, three = {sc.nextInt(),sc.nextInt()}, four = {0,0};
	for(int i=0;i<2;i++){
	    if(one[i]==two[i])four[i]=three[i];
	    else if (two[i]==three[i])four[i]=one[i];
	    else four[i]=two[i];
	}
	System.out.println(four[0]+" "+four[1]);
    }    
}