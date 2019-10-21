package Controlstructures;
import java.util.Scanner;
public class Fibonacci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("enter n");
	int n=s.nextInt();
	int a=0;
	int b=1;
	int i=0,d=0,c;
	for( i=0;i<n;i++) {
	    c=a+b;
		if(c==n)
		{
			d++;
		}
		a=b;
		b=c;
	}
	if(d!=0)
	{
	System.out.println("present");
	}
	else
	{
		System.out.println("absent");
	}
	
	
	

	}}
