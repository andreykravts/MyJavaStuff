
import java.util.Scanner;

public class random {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int counter = 1;
		System.out.println(counter);
		int Random = (int) (Math.random()*((999 - 100)+1));
		System.out.println(Random);
		if(((Random/100 % 2 == 0)&&(((Random/10)%10) % 2 == 0)&&((Random%100) % 2 == 0))||((Random/100 % 2 != 0)&&(((Random/10)%10) % 2 != 0)&&((Random%100) % 2 != 0)))
			System.out.println("True");
		else
			System.out.println("false");
		
		for(int i = 1; i<10; i++ ) {
			counter++;
			System.out.println(counter);
			Random = (int) (Math.random()*((999 - 100)+1));
			System.out.println(Random);
			if(((Random/100 % 2 == 0)&&(((Random/10)%10) % 2 == 0)&&((Random%100) % 2 == 0))||((Random/100 % 2 != 0)&&(((Random/10)%10) % 2 != 0)&&((Random%100) % 2 != 0)))
				System.out.println("True");
			else
				System.out.println("false");
		}

	}

}
