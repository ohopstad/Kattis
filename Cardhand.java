import java.util.Scanner;
class Cardhand{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int num = Integer.parseInt(sc.nextLine());
	String[] c = new String[num];
	c = sc.nextLine().split(" ");
	while(!sorted){
	    for(int i = 1; i<num; i++){
		
	    }
	}
    }
    static check()
    static intAt(String one){
	int two = one.matches(".*\\d+.*");
	if(two == null){
	    char three = one.substring(0,1);
	    if (three == 'T') two = 10;
	    else if (three =='J') two = 11;
	    else if(three == 'Q') two = 12;
	    else if(three == 'K') two = 13;
	    else if (three == 'A') two = 14;
    }
	return two;
}