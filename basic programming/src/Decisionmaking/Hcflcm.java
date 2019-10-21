package Decisionmaking;
import java.util.Scanner;
public class Hcflcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    System.out.println("enter two numbers");
    int gcd = 0;
    int a=s.nextInt();
    int b=s.nextInt();
    int min=(a<b)?a:b;
    for(int i=min;i>0;i--)
    {
    	if(a%i==0&&b%i==0)
    	{
    		gcd=i;
    		break;
    	}
    }
    System.out.printf("HCF is %d",gcd);
	}

}
