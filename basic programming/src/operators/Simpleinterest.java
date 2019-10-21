package operators;
import java.util.Scanner;
public class Simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("enter the amount");
	int p=s.nextInt();
	System.out.println("enter the period in years");
	int n=s.nextInt();
	System.out.println("enter the rate of interest");
	float r=s.nextFloat();
	float a=p*n*r;
	float b=a/100;
	System.out.printf("%.02f",b);
	
	}

}
