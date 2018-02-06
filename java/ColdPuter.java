import java.util.Scanner;


class ColdPuter{
    public static void main(String[]args){
	Scanner scan = new Scanner(System.in);
	int x = Integer.parseInt(scan.nextLine());
	int num = 0;
	String[] arr = scan.nextLine().split(" ");
	for(int i = 0; i< arr.length ; i++){
	    if(Integer.parseInt(arr[i])<0){
		num++;
	    }
	}
	System.out.println(num);
	
    }
}