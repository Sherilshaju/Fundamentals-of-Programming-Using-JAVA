package operators;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner S=new Scanner(System.in);
	System.out.println("enter two numbers to swap");
	int m=S.nextInt();
	int n=S.nextInt();
	int temp=n;
	n=m;
	m=temp;
	System.out.printf("swapped 1st num is%d",m);
	System.out.printf("\nswapped 2nd num is%d",n);
	
	
	
	}

}
