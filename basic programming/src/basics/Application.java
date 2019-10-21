package basics;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    System.out.println("enter string1");
    String a=s.nextLine();
    System.out.println("enter number1");
    int m=s.nextInt();
    System.out.println("enter string2");
    s.nextLine();
    String b=s.nextLine();
    s.nextLine();
    System.out.println("enter number2");
    int n=s.nextInt();
    s.nextLine();
    System.out.printf("%-15s %03d\n",a,m);
    System.out.printf("%-15s %03d\n",b,n);
	}

}
