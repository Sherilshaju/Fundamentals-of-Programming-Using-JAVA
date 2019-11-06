package Controlstructures;

import java.util.Scanner;

public class Strrev {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str=s.next();
	int i=0;
	for(char c:str.toCharArray()) {
		i++;
	}
		for(int j=i;j<=0;j--)
		{
			System.out.println(c);
		}
		
	}

}
