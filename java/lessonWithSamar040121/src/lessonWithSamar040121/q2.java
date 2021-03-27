package lessonWithSamar040121;

import java.util.Scanner; 

public class q2 {
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
		default : System.out.println("not 1-4");
		}
		if(num == 1) {System.out.println("one");}
		else if(num == 2) {System.out.println("two");}
		
		else if(num == 3) {System.out.println("three");}
		
		else if(num == 4) {System.out.println("four");}
		
		else {System.out.println("not 1-4");}
			
	}
}