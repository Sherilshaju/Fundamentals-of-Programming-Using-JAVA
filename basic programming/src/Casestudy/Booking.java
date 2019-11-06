package Casestudy;
import java.util.Scanner;
public class Booking {
	public static int booked[]=new int[25];
	static void book() {
		String ac;
		String c;
		String cable;
		String wifi;
		String laundry;
        Scanner s=new Scanner(System.in);
        int total,b=0,m,d,e,f,i=1;
        System.out.println("Booking");
        System.out.println("Please choose the services required");
    	System.out.println("AC/non-AC(AC/nAC)");
    	ac=s.next();
    	if(ac.equals("Ac")==true)
    	{
    		b=1000;
    	}
    	else
    	{
    		b=700;
    	}
    	System.out.println("Cot(Single/Double)");
    	c=s.nextLine();
    	if(c.equals("single")==true)
    	{
    	m=0;	
    	}
    	else
    	{
    		m=350;
    	}
    	System.out.println("With cable connection/without cable connection(C/nC)");
    	cable=s.nextLine();
    	if(cable.equals("C")==true)
    	{
    		d=50;
    	}
    	else
    	{
    		d=0;
    	}
    	System.out.println("Wi-Fi needed or not(W/nW)");
    	wifi=s.nextLine();
	
	if(wifi.equals("W")==true)
	{
		e=200;
	}
	else
	{
		e=0;
	}
	System.out.println("Laundry service needed or not(L/nL)");
	laundry=s.nextLine();
	if(laundry.equals("L")==true)
	{
		f=100;
	}
	else
	{
        f=0;
	}
	
	
	total=b+m+d+e+f;
	System.out.printf("The total charge is Rs.",total);
	System.out.println("The services chosen are");
	if(b==1000)
	{
		System.out.println("AC");
	}
	else
	{
		System.out.println("non-AC");
	}
	if(m==350)
	{
		System.out.println("double");
	}
	else
	{
		System.out.println("single");
	}
	if(d==50)
	{
		System.out.println("with cable connection");
	}
	else
	{
		System.out.println("without cable connection");
	}
	if(e==200)
	{
		System.out.println("with wifi");
	}
	else
	{
		System.out.println("without wifi");
	}
	if(f==100)
	{
		System.out.println("laundry");
	}
	else
	{
		System.out.println("without laundry");
	}
	System.out.println("do u want to proceed(yes/no)");
	String proceed=s.next();
	if (proceed.contentEquals("yes")==true)
	{
		booked[i]=1;
		System.out.println("thankyou your room number is"+i);
		i=i++;
	}
	}
}
	