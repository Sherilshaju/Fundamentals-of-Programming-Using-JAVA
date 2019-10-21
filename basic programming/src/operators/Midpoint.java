package operators;
import java.util.Scanner;
public class Midpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("enter the x coordinate of point 1");
	int x1=s.nextInt();
	System.out.println("enter the y coordinate of point 1");
	int y1=s.nextInt();
	System.out.println("enter the x coordinate of point 2");
	int x2=s.nextInt();
	System.out.println("enter the y coordinate of point 2");
	int y2=s.nextInt();
	int x=(x1+x2)/2;
	int y=(y1+y2)/2;
	System.out.printf("x and y coordinates are %d,%d",x,y);
	
	}

}
