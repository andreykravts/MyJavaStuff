import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Greatings! ");
		System.out.println("Please enter a number of tickets that you want to buy : ");
		int numOfTheTikets = input.nextInt();
		int SummaryPayment = 0;
		//Area calculating
		System.out.println("Please choose the Area of the Hall: ");
		System.out.println("Please enter 1 for Hall");
		System.out.println("Please enter 2 for Gallery");
		int Area = input.nextInt();
		//Area logic
		switch(Area) {
		case 1: 
			//number of the row
			System.out.println("Plese enter a number of the row that you wanna take : ");
			int numOfTheRow = input.nextInt(); 
			//Calculation logic
			if(numOfTheRow >= 1 && numOfTheRow <= 10) {
				SummaryPayment = 45*numOfTheTikets;
			}else if(numOfTheRow >= 11 && numOfTheRow <= 25) {
				SummaryPayment = 35*numOfTheTikets;
			}else if(numOfTheRow >= 26 && numOfTheRow <= 32) {
				SummaryPayment = 30*numOfTheTikets;
			}else {
				System.out.println("Error");
			}
			break;
		case 2: 
			//number of the row
			System.out.println("Plese enter a number of the row that you wanna take : ");
			numOfTheRow = input.nextInt(); 
			//Calculation logic
			if(numOfTheRow >= 1 && numOfTheRow <= 5) {
				SummaryPayment = 40*numOfTheTikets;
			}else if(numOfTheRow >= 6 && numOfTheRow <= 12) {
				SummaryPayment = 45*numOfTheTikets;
			}else {
				System.out.println("Error");
			}
			break;
			default:
				break;
		}
		
		//a discount
		if(numOfTheTikets > 5) {
			SummaryPayment *= 0.9;
			System.out.println(" Total payment for pursuase is : "+ " "+ SummaryPayment+" NIS" );
		}
	}

}
