package operators;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner S=new Scanner(System.in);
	System.out.println("enter two numbers");
		int a=S.nextInt();
		int b=S.nextInt();
	System.out.printf("\nsum is %d",a+b);
	System.out.printf("\ndiff is %d",a-b);
	System.out.printf("\nproduct is %d",a*b);
	System.out.printf("\ndivisor is %d",a/b);
	System.out.printf("\nremainder is %d",a%b);
	
	}

}
