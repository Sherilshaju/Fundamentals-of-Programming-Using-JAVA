package Decisionmaking;
import java.util.Scanner;
public class Stringvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    System.out.println("enter the size");
    int n=s.nextInt();
    System.out.println("enter the strings");
    String arr[]=new String[n];
    int i;
    for( i=0;i<n;i++)
    {
    	arr[i]=s.next();
    }
    for( i=0;i<=n;i++)
    {
    	char c =arr[i].charAt(0);
    
    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
    {
    	System.out.println(arr[i]);
    	
    }
    }
	}
}



