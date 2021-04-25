import java.util.Scanner; 

public class ex3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean a = true,b= false;
		if(a && !b)
			if(a || b)
				System.out.println(b);
				else
					System.out.println(!a);
		System.out.println(b);


	}
}