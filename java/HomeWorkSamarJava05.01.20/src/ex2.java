import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter is your code : (About six chars and one number of two digits)");
		char a = input.next().charAt(0);
		char b = input.next().charAt(0);
		char c = input.next().charAt(0);
		char d = input.next().charAt(0);
		char e = input.next().charAt(0);
		char f = input.next().charAt(0);
		int num = input.nextInt();
		
		int charSum = a + b + c+ d + e +f;
		//394
		int dig100,dig10;
		dig100 = charSum/100;//100 digit//3
		System.out.println(dig100);
		dig10 = (charSum/10)%10;//10 digit//9
		System.out.println(dig10);
		
		int dignum10 = num/10;
		System.out.println(dignum10);// 10 digit// 9
		int dignum1= num%10;
		System.out.println(dignum1);// 1  digit// 3
		if(dignum10 == dig10 && dignum1 == dig100) {
			System.out.println("Welcome! AABCAB");
		}else {
			System.out.println("Erroe code");
		}
		
		

	}

}
