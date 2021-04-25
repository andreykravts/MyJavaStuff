
import java.util.Scanner;

public class newprogramm {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
			char ch1 = sc.next().charAt(0);
			char ch2 = sc.next().charAt(0);
			char ch3 = sc.next().charAt(0);
			int a = (ch1 - '0');
			int b = (ch2 - '0');
			int c = (ch3 - '0');
		    System.out.println(a+""+b+""+c);
			int number = a*100+ b*10+c;
			if(number %2 != 0 && number > 200)
		System.out.println("true");
			else
		System.out.println("false");

	
	

	}

}
