import java.util.Scanner;
class everywhere{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int a = Integer.parseInt(sc.nextLine());
	int b;
	String[] c = new String[100];
	String d;
	int num = 0;
	for (int i=0 ; i<a;i++){
	    b = Integer.parseInt(sc.nextLine());
	    for(int j = 0; j<b;j++){
		d=sc.nextLine();
		for (int l = 0; l<=j;l++){
		    if(l<j){
			if (d.equals(c[l])) l=j;
			else;
		    }
		    else num++;
		}
	    }
	    System.out.println(num);
	    num = 0;
	    c = new String[100];
	}
    }
}