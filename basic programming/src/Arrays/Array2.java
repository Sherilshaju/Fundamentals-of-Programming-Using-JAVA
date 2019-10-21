package Arrays;
import java.util.Scanner;
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size");
	int sum=0;int c=0;int sum1=0;int d=0;
    int size=s.nextInt();
    int[]a=new int[size];
    int[]b=new int[size];
    for(int i=0;i<size;i++)
    {
    	System.out.println("enter 1st array elements");
    	a[i]=s.nextInt();
    }
    	for(int i=0;i<size;i++) 
    	{
    	if(a[i]%2==0) {
    		System.out.println(a[i]);
    		sum=sum+a[i];
    		c++;
    	}	
    	}
    	for(int i=0;i<size;i++)
    	{
    		if(a[i]%2!=0) {
    		System.out.println(a[i]);
    		sum1=sum1+a[i];
    		d++;
    	}}
    	float e=sum/c;
    	float o=sum1/d;
    	System.out.println(e);
    	System.out.println(o);
    }
    /*for(int i=0;i<size;i++)
    {
    	System.out.println("enter 2nd array elements");
    	b[i]=s.nextInt();
    	if(b[i]%2==0) {
    		sum=sum+b[i];
    		c++;
    		
    	}
    	else {
    		sum1=sum1+a[i];
    		d++;
    	}
    	float e=sum/c;
    	float o=sum/d;
    }*/

	}


