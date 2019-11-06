package OOPs;
import java.util.Scanner;
public class Car {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the name");
    String str=s.next();
    Carnew c=new Carnew(str);
    Carnew.a();
    Carnew.b();
    Carnew.m();
    Carnew.display(str);
	}
}
    
    class Carnew{
    	String str;
    	public Carnew(String str) {
    		str=str;

	}
		
		public static void m() {
			System.out.println("welcome car m");
			System.out.println("welcome car m model 789");
			
			
		}
		public static void b() {
			System.out.println("welcome car b");
			System.out.println("welcome car b model 456");
			
			
		}
		public static void a() 
		{
		System.out.println("welcome car a");
		System.out.println(" car a model 123");
		}
		public static void display(String str) {
			System.out.println(str);
			

			
		}

}
