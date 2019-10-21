package Arrays;
import java.util.Scanner;
public class Arraymax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	int m=0;
	System.out.println("enter the size");
	int size=s.nextInt();
	int[]a=new int[size];
	System.out.println("enter the array elements");
	for(int i=0;i<size;i++) {
		a[i]=s.nextInt();
	}
	for(int i=0;i<size;i++) {
		if(a[i]>=m) {
			m=a[i];
		}
	}
	
	System.out.printf("largest element is:%d",m);
	
	
	
	
	
	}

}
