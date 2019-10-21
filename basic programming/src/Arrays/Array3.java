package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Array3 {

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
    Arrays.sort(a);
    System.out.printf("second largest number is:%d",a[size-2]);
	}
}
