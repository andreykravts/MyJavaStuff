package lesson;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		/*int number;
		for(number = 5; number>0;) {
			System.out.println(" number = "+number);
			number--;
		}
		System.out.println(" final number = "+number);*/
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
		int  mult = 1;
		boolean f= true;
		if(y<0) {
			f=false;
			y=-y;
		}
		for(int i = 1; i<=y; i++) {
			
			mult*=x;
		}
		if(f)
		System.out.println(" final number = "+mult);
		else
			System.out.println(" final number = "+1/mult);
	}
}
