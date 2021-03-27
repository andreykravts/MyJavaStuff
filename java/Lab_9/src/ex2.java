import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number day");
		int x = input.nextInt();
		switch(x) {
		case 1 :
			System.out.println("Monday");
			break;
		case 2 :
			System.out.println("Tuasday");
			break;
		case 3 :
			System.out.println("Wensdday");
			break;
		case 4 :
			System.out.println("Thusday");
			break;
		case 5 :
			System.out.println("Friday");
			break;
		case 6 :
			System.out.println("Satturday");
			break;
		case 7 :
			System.out.println("Sunday");
			break;
			default:
				System.out.println("That one didnt exist");
				break;
		}
	}
	}