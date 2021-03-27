import java.util.Scanner; 
public class quastion4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		System.out.println("Please enter is the first number : ");
		num1 = input.nextInt();
		System.out.println("Please enter is the second number : ");
		num2 = input.nextInt();
		//A
		boolean result = ((num1/100)==3 &&(num2/100)==3 ) ;
		System.out.println("these two numbers starts with digit 3 is: "+ result);
		//B
		result = num1%2!=0 || num2%2!=0;
		System.out.println("One of these two nimbers is cant be divided by two : "+result);
		//C
		//num1 % 10;// 123 3
		//(num1%100)/10//123 2
		result = (((num1%100)/10 + num1 % 10) > 10) && (((num2%100)/10 + num2 % 10) > 10); //123 2
		System.out.println("The sum  of the two digits in the end of the numbers is more than 10 is :"+result);
		//D
		result = Math.pow(num1, 2)>20 && Math.pow(num2, 2)>20;
		System.out.println("The two nombers to the power of 2 more than 20 is :"+result);
		//E
		result = (num1%num2==0);
		System.out.println("We can divide first number by second? The answer is : "+result);
		//F
		result = (num1 - num2) < 20 && (num1 - num2) > 0;
		System.out.println("The difference between two num ber isnt more than 20? The answer is :"+result);
	}
}