package OOPs;
import java.util.Scanner;
public class Aopn {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter number 1");
	int a=s.nextInt();
	System.out.println("enter number 2");
    int b=s.nextInt();
	System.out.println("1) add\n2) sub\n3)prod\n4)div\n5)mod");
	int n=s.nextInt();
	Operation c=new Operation(a,b); 
	switch(n)
	{
	case 1:
		Operation.add(a,b);
		break;
	case 2:
		Operation.sub(a,b);
		break;
	case 3:
		Operation.mult(a,b);
		break;
	case 4:
		Operation.div(a,b);
		break;
	case 5:
		Operation.mod(a,b);
		break;
	}
	}
	}
	class Operation{
		int a,b;
		public Operation(int a,int b) {
			a=a;
			b=b;
		}
	public static void add( int a,int b) {
		System.out.printf("sum is %d",a+b);
	}
	public static void sub(int a,int b) {
		System.out.printf("diff is %d",a-b);
	}
	public static void mult(int a,int b) {
		System.out.printf("prod is %d",a*b);
	}
	public static void div(int a,int b) {
		System.out.printf("quotient is %d",a/b);
	}
	public static void mod(int a,int b) {
		System.out.printf("remainder is %d",a%b);
		
	}
	
	}


	