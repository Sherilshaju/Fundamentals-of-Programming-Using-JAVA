package Decisionmaking;
import java.util.Scanner;
public class Nestedswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	//String food=s.nextLine();
	System.out.println("1)meals\n2)cool drinks\n3)snacks");
	int a=s.nextInt();
	char food=s.next().charAt(0);
	switch(a) {
		case 1:
			switch(food) {
			//char f=s.next().charAt(0);
				case 'n':
					System.out.println("chicken biriyani\n,chicken 65");
					break;
				case 'v':
					System.out.println("paneer biriyani,mushroom");
					break;
			}
		break;
		case 2:
			
			switch (food){
				case's':
				System.out.println("chocolate,vanilla");
				break;
				case 'j':
				System.out.println("mango,pineapple,lime");
				break;
			}
		break;
		case 3:
			
			switch(food) {
				case 'f':
				System.out.println("vada,samosa,bajji");
				break;
				case 'b':
				System.out.println("puffs,cakes,sandwitch");
		break;
		
		}
	}
	
	
	}

}
