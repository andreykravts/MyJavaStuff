package lessonWithSamar040121;

import java.util.Scanner; 

public class q4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch(num)
		{
			case 1 : System.out.println("one");
			break;
			case 2 : System.out.println("two");
			break;
			case 3 : System.out.println("three");
			break;
			case 4 : System.out.println("four");
			break;
			case 5 : System.out.println("five");
			break;
			case 6 : System.out.println("six");
			break;
				default : System.out.println("ilegal num");
				break;
		}
			
	}
}