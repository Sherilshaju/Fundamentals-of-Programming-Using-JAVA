package Decisionmaking;
import java.util.Scanner;
public class Ifelseexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    System.out.println("enter the name");
    String NAME=s.nextLine();
    System.out.println("enter the password");
    String PASSWORD=s.nextLine();
    if(NAME.equals("sheril")&& PASSWORD.equals("hello"))
    {
    	System.out.println("login successfull");
    }
    else
    {
        System.out.println("login error");
    }
    
	}

}
