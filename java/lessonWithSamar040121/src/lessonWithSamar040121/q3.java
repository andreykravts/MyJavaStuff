package lessonWithSamar040121;

import java.util.Scanner; 

public class q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		switch(month)
		{
			case 2 :
				System.out.println("28 days");
				break;
			case 4 : System.out.println("30 days");
			case 6 :
			case 9 :
			case 11 :
			break;
			case 1:System.out.println("31 days");
			case 3:
			case 5:
			case 7:
			case 8:
			case 12:
				break;
				default : System.out.println("ilegal month");
				break;
		}
			
	}
}