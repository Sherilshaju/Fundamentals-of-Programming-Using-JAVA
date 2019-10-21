package operators;
import java.util.Scanner;
public class Arith1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	int a=n%10;
	int b=a*a;
	int c=n/100;
	int d=c*a;
	System.out.printf("%d%d",b,d);
	System.out.printf("\n%d",b*d);
	
	
	}

}
