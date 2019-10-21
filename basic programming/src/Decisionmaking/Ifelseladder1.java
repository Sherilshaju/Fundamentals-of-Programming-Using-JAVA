package Decisionmaking;
import java.util.Scanner;
public class Ifelseladder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("enter the mark");
	int mark=s.nextInt();
	if(mark>=90&&mark<=100)
	{
		System.out.println("excellent");
	}
	else if(mark>=80&&mark<=90)
	{
		System.out.println("very good");
	}
	else if(mark>=70&&mark<=80)
	{
		System.out.println("good");
	}
	else
	{
		System.out.println("improve");
	}
	}

}
