package Controlstructures;
import java.util.Scanner;
public class Natural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("enter 2 numbers");
	int a=s.nextInt();
	int b=s.nextInt();
	int c=0,i;
	for(i=a;i<=b;i++) {
		c=c+i;
	}
	System.out.println(c);
	}

}
