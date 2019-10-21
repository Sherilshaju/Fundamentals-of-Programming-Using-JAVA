package Controlstructures;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("enter n");
	int n=s.nextInt();
	//int i=s.nextInt();
	int a=0;
	int b=1;
	System.out.printf("%d%d",a,b);
	for(int i=2;i<n;i++) {
		int c=a+b;
		System.out.printf("%d",c);
		a=b;
		b=c;
		
	}
	}

}
