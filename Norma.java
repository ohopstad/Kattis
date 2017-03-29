class Norma{
    public static void main(String[]args){
	java.util.Scanner sc = new java.util.Scanner(System.in);
	int[] in = new int[Integer.parseInt(sc.nextLine())];
	for (int i = 0;i<in.length;i++)in[i] = Integer.parseInt(sc.nextLine());
	float x = java.util.Arrays.stream(in).min().getAsInt()*java.util.Arrays.stream(in).max().getAsInt()*in.length;
	System.out.println(x);
    }

}