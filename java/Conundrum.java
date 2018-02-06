class Conundrum{
    public static void main(String[]args){
	java.util.Scanner sc = new java.util.Scanner(System.in);
	String in = sc.nextLine();
	int d = in.length();
	for (int i = 1; i<in.length()-1;i+=3){
	    if(in.charAt(i-1)=='P')d--;
	    if(in.charAt(i)=='E')d--;
	    if(in.charAt(i+1)=='R')d--;
	}
	System.out.println(d);
    }
}