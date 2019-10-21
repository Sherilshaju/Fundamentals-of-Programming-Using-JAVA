package Decisionmaking;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    System.out.println("enter the year");
    int n=s.nextInt();
    if(n%4==0) 
    {
    	if(n%100==0) 
    	{
    		if(n%400==0) {
    		
    			System.out.println("leap year");
    		    }
    	    else {
       	        System.out.println("not leap year");
    	 }       }
    	else
    	{
    		System.out.println("leap year");
        }
    }
    else {
    	 System.out.println("not leap year");
    }
	}

}
