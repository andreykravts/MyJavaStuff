import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a three natural numbers : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		System.out.println("Here is our menu : ");
		System.out.println("Please press 1 to see Max number :  ");
		System.out.println("Please press 2 to see Min number :  ");
		System.out.println("Please press 3 to see Sum of these numbers :  ");
		System.out.println("Please press 4 to see the result of these multiply numbers :  ");
		int UserChoose = input.nextInt();
		switch(UserChoose) {
		case 1 : 
			//Max result
			UserChoose = Math.max(num1, num2);
			UserChoose = Math.max(UserChoose, num3);
			System.out.println(UserChoose);
			break;
		case 2 : 
			//Min result 
			UserChoose = Math.min(num1, num2);
			UserChoose = Math.min(UserChoose, num3);
			System.out.println(UserChoose);
			break;
		case 3 : 
			UserChoose = num1 +num2 + num3;
			System.out.println(UserChoose);
			break;
		case 4 : 
			UserChoose = num1 * num2 * num3;
			System.out.println(UserChoose);
			break;
			default : 
				System.out.println("Sorry! We didnt have other option!");
				break;
		}
		
	}

}
