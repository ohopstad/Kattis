import java.util.Scanner;

class Modulo{
    
    public static void main (String[] args){
	int[] arr = new int[10];
	int num = 0;
	Scanner sc = new Scanner(System.in);
	for(int i=0; i<10; i++){
	    arr[i] = Integer.parseInt(sc.nextLine()) % 42;
	    for(int j=i-1; j>=0; j--){
		if(i==0){
		    num++;
		}
		else if(arr[j] == arr[i]){
		    j=-1;
		}
		else{
		    num++;
		}
	    }
	}
	System.out.println(num);
    }
}