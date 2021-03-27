package lessonWithSamar040121;

import java.util.Scanner; 

public class q6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x,y;
		x = input.nextInt();
				y =  input.nextInt();
		int sum = x + y;
		switch(sum)
		{
			case 3 : System.out.println("True"); 
			switch(x) {
			case 0: System.out.println("false");break;
			case 1: System.out.println("true");break;
			}
			break;
			
			case 0 : System.out.println("good");
					 System.out.println("luck");
			break;
				default : System.out.println("sum is" + (x+y));
				break;
		}
			
	}
}