package lessonWithSamar040121;

import java.util.Scanner; 

public class q5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char ch = input.next().charAt(0);
		switch(ch)
		{
			case 'y' : System.out.println("enter another character");
			ch = input.next().charAt(0);
			break;
			case 'n' : 
				System.out.println("good bye!");
				break;
				default : System.out.println("ilegal char");
				break;
		}
			
	}
}