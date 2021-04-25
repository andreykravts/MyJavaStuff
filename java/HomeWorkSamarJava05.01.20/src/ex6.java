import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//Menu
		System.out.println("Please enter a char for start : ");
		System.out.println("Enter a for AVG. ");
		System.out.println("Enter S for SUM. ");
		System.out.println("Enter M for Divide. ");
		System.out.println("Enter P to see a name of the author. ");
		//input
		char ch = input.next().charAt(0);
		System.out.println("Please enter a four natural numbers : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		
		//Logic
		switch(ch) {
		case 'a': 
			//Calculation
			double AVG = (double)(num1 + num2 + num3 + num4)/4;
			//Output
			System.out.println("AVG of these numbers is : "+AVG);
			break;
		case 'S': 
			//Calculation
			int SUM = num1 + num2 + num3 + num4;
			//Output
			System.out.println("SUM of these numbers is : "+SUM);
			break;
		case 'M': 
			if(num2 %2==0) {
				//Calculation
				int Mult = num1 * num2 * num3 * num4;
				//Output
				System.out.println("Multiply of these numbers is : "+Mult);
			}else {
				//Calculation
				int Div3to4 = num3 / num4;
				//Output
				System.out.println("The result of the dividing num3 on num4 is : "+Div3to4);
				
			}
			break;
		case 'P': 
			System.out.println("Copyright: Andrey Kravtsov");
			break;
			default : 
				//Output
				System.out.println("Error");
				break;
		}
		
		
		
	}

}
