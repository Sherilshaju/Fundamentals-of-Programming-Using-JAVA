package Strings;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    int i,j,k;
    char ch;
    int count=0;
    String str=s.next();
    int l=str.length();
    for(i=0;i<l;i++)
    {
     ch=str.charAt(i);
    if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    {
    	count=count+1;
    
    for(j=0;j<count;j++)
    {
    	System.out.print("*");
    }
    System.out.print(ch);
     for(k=0;k<count;k++)
    {
    	System.out.print("*");
    }
    }
    else
    {
    	System.out.print(ch);
    
    }
	}

}
}
