package lessonWithSamar040121;

import java.util.Scanner; 

public class q8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a basic price");
		int PriceBasic = input.nextInt();
		System.out.println("please enter a number of the stage you're ask");
		int floor = input.nextInt();
		System.out.println("Please enter a price add");
		int PriceADD = input.nextInt();
		switch(floor) {
		case 1 : 
			PriceBasic = PriceBasic - 1500;
			break;
		case 2 : 
		case 3 : 
		case 4 : 
		case 5 : PriceBasic = PriceBasic*(floor-1);
			break;
		case 6 : 
		case 7 : 
				PriceBasic=PriceBasic*3 ;
			break;
			default: System.out.println("Error");
				break;
		}
		System.out.println("The total price of the flat is : "+PriceBasic);
		
		}
			
	}
