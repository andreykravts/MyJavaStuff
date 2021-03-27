import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 char a,b,c;
		 System.out.println("Please enter a three digits : ");
		 a = input.next().charAt(0);
		 b = input.next().charAt(0);
		 c = input.next().charAt(0);
		 //Checking
		 while(a < '0'|| a >'9'|b < '0'|| b >'9'||c < '0'|| c >'9')
		 {
			 System.out.println("Error try again : only digits");
			 a = input.next().charAt(0);
			 b = input.next().charAt(0);
			 c = input.next().charAt(0);
		 
		 }
		 int A,B,C;
		 A = Character.getNumericValue(a); // or do a - '0' = numASCII - 48 = 50 - 48 = 2
		 B = Character.getNumericValue(b);
		 C = Character.getNumericValue(c);
		 A = a - '0';
		 A*=100;
		 B*=10;
		 int num = A+B+C;
		 System.out.println(num);
		 if(num%2==1 && num>200)
			 System.out.println("True");
		 else
			 System.out.println("False");
		 
		 
		 
	}

}
