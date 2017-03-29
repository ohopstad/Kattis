class Cetvrta{
    public static void main(String[]args){
	java.util.Scanner sc = new java.util.Scanner(System.in);
	String[] on=sc.nextLine().split(" "),tw=sc.nextLine().split(" "),thre=sc.nextLine().split(" ");
	int[] one = processLine(on), two=processLine(tw), three=processLine(thre), four={0,0};

	if (lang(one, two) >= lang(two, three) && lang(one, two)>=lang(three, one)) four = point(one, two, three);
	else if (lang(one, two) < lang(two, three) && lang(two, three)>lang(three, one))four=point(three,two,one);
	else four=point(one,three,two);

	System.out.println(four[0]+" "+four[1]);
    }
    static double lang(int[] x, int[] y){
	return Math.abs(Math.sqrt(Math.pow(x[0]+ y[0], 2)+ Math.pow(x[1]+y[1], 2)));
    }
    static int[] point(int[] x, int[] y, int[] z){
	int i[] = {(x[0]+y[0]-z[0]),(x[1]+y[1]-z[1])};
	return i;
    }
    static int[] processLine(String[] strings) {
	int[] intarray=new int[strings.length];
	int i=0;
	for(String str:strings){
	    intarray[i]=Integer.parseInt(str);
	    i++;
	}
	return intarray;
    }
}