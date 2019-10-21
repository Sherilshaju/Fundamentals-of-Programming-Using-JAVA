package operators;
import java.util.Scanner;
public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("enter two numbers");
	int a=s.nextInt();
	int b=s.nextInt();
	int c=a|b;
	System.out.printf("sum is\n%d",c);
	}

}
