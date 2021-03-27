import java.util.Scanner; 

public class ex2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,c;
		a= input.nextInt();
		b= input.nextInt();
		c= input.nextInt();
		if(a==b  && b==c)
			System.out.println("All equal");
		else if(a==b  || b==c || c==a)
			System.out.println("only two numbers is equal");
		else 
			System.out.println("Three numbers are not equal");

	}
}