import java.util.Scanner;

class Yoda{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String c = sc.nextLine();
	String x = sc.nextLine();
	int c1=0;
	int x1=0;	

	if(c.length() <= x.length()){
	    for(int i= 0 ; i < x.length()-c.length() ; i++){
		c = "0"+ c;
	    }
	    
	}
        else if(c.length() > x.length()){
            for(int i= 0 ; i < x.length()-c.length() ; i++){
                c = "0"+ c;
	    }
	    
        }
	for (int i = 0; i<c.length(); i++){
	    if (intAt(c, i) < intAt(x, i)){
		c = bytt(c, i);
		c1++;
	    }
	    else if(intAt(x, i) < intAt(c, i)){
		x = bytt (x, i);
		x1++;
	    }
	}
        if (c1 == c.length()-1){
            System.out.println("YODA");
	}
        else{
            for(int i = 0; i < c.length(); i++)
                if (intAt(c, i)== 0 && i-1 != 0){

                }
                else{
                    System.out.println(x.substring(i, x.length()));
                }
	}
	if (x1 == x.length()-1){
	    System.out.println("YODA");
	}
	else{
	    for(int i = 0; i < x.length(); i++)
		if (intAt(x, i)== 0 && i-1!= 0){
		    
		} 
		else{
		    System.out.println(x.substring(i, x.length()));
		}
	}
	
	
    }
    public static int intAt(String s, int index)
    {
	String q = s + "0";
	int r = Integer.parseInt(s.substring(index, index+1));
	return r;
    }
    public static String bytt(String myName, int index){
	String newName = myName.substring(0,index)+'0'+myName.substring(index+1);
	return newName;
    }
    
}