import java.util.Scanner; 

public class ex4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a,b;
		System.out.println("A?");
		a = input.nextInt();
		System.out.println("B?");
		b = input.nextInt();
		if(b!=0 && a!=0)
		{
			double x = -b/a;
			System.out.println(x);
		}
		else if(b==0 && a == 0) 
		{
			System.out.println("x = all results");
		}
		else 
		{System.out.println("x = didnt have right way");}
	}
}