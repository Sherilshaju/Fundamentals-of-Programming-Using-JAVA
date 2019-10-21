package Decisionmaking;
import java.util.Scanner;

public class Fallthru2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the month ");
		String n=s.nextLine();
			switch(n) {
			case "january":
			case "march":
			case "may":
			case "july":
			case "august":
				System.out.println("31 days");
			break;
			case "april":
			case "june":
			case "september":
			case "november":
			case "december":
				System.out.println("30 days");
			break;
			case "february":
				System.out.println("28 or 29 days");
			break;
			default:
				System.out.println("invalid month");
				break;
				
			}
		}

	

	}


