import java.util.Scanner;

class Compass{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int ein = Integer.parseInt(sc.nextLine()), to = Integer.parseInt(sc.nextLine()), x = -180;
	int tre = ein - to, fire = tre + 360;

	if (fire > 360) fire -= 720;

	if(Math.abs(tre) < Math.abs(fire)) x = tre;
	else if (Math.abs(tre) > Math.abs(fire)) x = fire;

	System.out.println(-x);
    }
}