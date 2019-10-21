package Arrays;

import java.util.Scanner;

public class Arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	     int n=s.nextInt();
	     //int sum=0;
	     int i;
	     //float median=0;
	     int[] a=new int[n];
	     for(i=0;i<n;i++)
	     {
	       a[i]=s.nextInt();
	     }
	     for(i=0;i<n;i++)
	     {
	    	 if(a[i+1]>a[i]) {
	    		 a[i]=a[i+1];
	    	 }
	     }
	     System.out.println(a[i]);
	}

}
