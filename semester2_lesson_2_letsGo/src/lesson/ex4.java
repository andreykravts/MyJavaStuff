package lesson;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numDays = sc.nextInt();// num days work
		int numOFfuel=0;
		int sumFuel = 0;
		int sumFuelMounth=0;
		for(int i=1; i<numDays; i++ ) {
		
		for(int j =1; j<20; j++) {
			 numOFfuel = sc.nextInt();
			sumFuel+=numOFfuel;
			
		}
		System.out.println("The day "+i+"Sumfuel is "+ sumFuel);
		sumFuelMounth += sumFuel;
		}
		System.out.println("Total fuel is "+sumFuelMounth);
	}

}
