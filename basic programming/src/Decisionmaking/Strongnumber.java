package Decisionmaking;
import java.util.Scanner;
public class Strongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number");
	int n=s.nextInt();
	int num=n,sum=0,i=1;
	int fact;
	while(n!=0) {
	    fact=1;
		int r=n%10;
		for (i=1;i<=r;i++)
		{
			fact=fact*i;
		}
			sum=sum+fact;
		
		n=n/10;
		
		}
	if(sum==num) {
		System.out.println("strong number");
	}
	else {
		System.out.println("not strong number");
	}
	}

}
