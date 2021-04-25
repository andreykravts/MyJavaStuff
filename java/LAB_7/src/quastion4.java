import java.util.Scanner; 
public class quastion4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num<1000 && num >99) {
			System.out.println("The number have 3 digits, that int.");
			int a,b,c;
			a =num/100;
			b =(num%100)/10;
			c = num%10;
			int sumABC = a + b + c;
			if( sumABC == 9) 
			{
				System.out.println("That number can be divided by 9");
			}
			else
			{
				b =(sumABC%100)/10;
				c = sumABC%10;
				System.out.println(((b+c)==9)? "this number can be divided by 9" : "this number CANT be divided by 9");
				
			}
		}
		System.out.println("check with num%9==0");
		boolean check= num%9==0;
		System.out.println("result of the check : "+check);
		
		
		}}