import java.util.Scanner; 

public class ex1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a price and weight : ");
		int price=input.nextInt();
		int weight=input.nextInt();
		if(price < 100 && weight< 50) 
		{
			System.out.println("David is going buy this one");
		}
		else {
			System.out.println("David isnt going buy your stuff");
		}
		


	}
}