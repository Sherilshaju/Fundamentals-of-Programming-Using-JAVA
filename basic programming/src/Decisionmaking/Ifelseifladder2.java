package Decisionmaking;
import java.util.Scanner;
public class Ifelseifladder2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    System.out.println("enter 3 numbers");
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
    if(a>b)
    {
    	System.out.printf("%d is the greatest number:",a);
    
    }
    else if(b>c)
    {
    	System.out.printf("%d is the greatest number",b);
    }
    else
    {
    	System.out.printf("%d is the greatest number",c);
    }
	}

}
