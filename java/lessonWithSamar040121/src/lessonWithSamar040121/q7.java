package lessonWithSamar040121;

import java.util.Scanner; 

public class q7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a first number");
		int num1 = input.nextInt();
		System.out.println("Please enter a char of the + or - or % or or * or /");
		char ch = input.next().charAt(0);
		System.out.println("Please enter a second number");
		int num2 = input.nextInt();
		
		switch(ch) {
		case '+': System.out.println(num1 + " "+ch + " " +num2 +" " + " "+"="+ " "+(num1+num2));
			break;
		case '-':System.out.println( num1 + " "+ch + " " +num2 +" " + " "+"="+ " "+(num1-num2));
			break;
		case '*':System.out.println( num1 + " "+ch + " " +num2 +" " + " "+"="+ " "+(num1*num2));
			break;
		case '%':System.out.println( ((num2 == 0)?"Error: You're can't divide by the ZERO" :num1 + " "+ch + " " +num2 +" " + " "+"="+ " "+(num1%num2)));
			break;
		case '/':System.out.println( ((num2 == 0)?"Error: You're can't divide by the ZERO" :num1 + " "+ch + " " +num2 +" " + " "+"="+ " "+(num1/num2)));
			break;
			default:System.out.println("This is out of programm.");
			break;
			
		}
			
	}
}