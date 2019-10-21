package Arrays;
import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    System.out.println("enter the size");
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
    	System.out.println("enter 2nd array elements");
    	b[i]=s.nextInt();	
    }
    for(int i=0;i<size;i++){
    	System.out.println(a[i]+b[i]);
    		
    }
	}

}
