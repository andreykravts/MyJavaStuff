import java.util.Scanner;
public class ex5 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int a,b;
		 System.out.println("Three digits num");
		 a = input.nextInt();
		 System.out.println("One digit num ");
		 b = input.nextInt();
		 int x,y,z;
		 x = a/100;
		 y = a/10%10;
		 z = a%10;
		 System.out.println(x+""+y+""+z);
		 System.out.println(b == x || b == y|| b==z )  ;
		 System.out.println((b == x && b != y&& b!=z )||(b != x && b == y&& b!=z )||(b != x && b != y&& b==z ));
		 System.out.println((b == x && b != y&& b==z )||(b == x && b == y&& b!=z )||(b != x && b == y&& b==z ));
		 

	}

}
