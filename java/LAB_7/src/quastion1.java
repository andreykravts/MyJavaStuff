import java.util.Scanner; 
public class quastion1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println ("ENTER INTEGER NUMBER : ");
		int num = input.nextInt();
		
		if ( num> 10 && num > 0)
		System.out.println ("over 10");
		else if(num >= 0 && num < 10)
			System.out.println ("less than 10 but more than 0");
		else System.out.println ("negative number");
	}
}