import java.math.BigDecimal;
import java.util.Scanner;
public class Ex_1 {

	public static void main(String[] args) {
		//LAB_03_1
		/*
		int a,b;
		a=3;
		b=a+4;
		System.out.println ("a=" + a);
		System.out.println ("b=" + b);
		//a=3
		//b=7
		 */
		/*--------------------------------------------------------------*/
		
		/*
		int a,b;
		a=3;
		b=a*2;
		System.out.println ("a=" + a);
		System.out.println ("b=" + b);
		//a=3
		//b=6
		*/
		/*
		 * //LAB_03_3
		int a, b;
		a=3;
		b=55;
		System.out.println ("a= " + a +" b= " + b);
		a=b;//a = 55
		b=a;//b= 55 a = 55
		System.out.println ("a= " + a +" b= " + b);
		*/
		/*
		//MY IDEA OF HOW TO DO IT  *
		int a,b,c = 0;
		
		a=3;
		b=55;
		
		System.out.println ("a= " + a +" b= " + b);
		c=a;
		a=b;
		b=c; 
		System.out.println ("a= " + a +" b= " + b);
		*/
		/*--------------------------------------------------------------*/
		//LAB_03_3
		/*
		Scanner input = new Scanner(System.in);
		int a;
		System.out.println("What is your age?");
		a = input.nextInt();
		System.out.println(a+ " years So Young!!!!");
		
		//What is your age?
		//24
		//24 years So Young!!!!
		*/
		
		
		/*--------------------------------------------------------------*/
		//LAB_3_4
		/*A
		Scanner input = new Scanner(System.in);
		 char character;
		int integer;
		float decimal;
		double longnumber;
		character = 'A';
		
		integer = 5;

		decimal = 7.3f;
		
		longnumber = 291347.45;
		*/
		/*B
		Scanner input = new Scanner(System.in);
		 char character;
		int integer;
		float decimal;
		double longnumber;
		character = 'A';
		System.out.println ("character = " + character );
		integer = 5;
		System.out.println ("integer = " + integer );
		decimal = 7.3f;
		System.out.println ("decimal = " + decimal );
		longnumber = 291347.45;
		System.out.println ("longnumber = " + longnumber );
		*/
		/*C
		Scanner input = new Scanner(System.in);
		 char character;
		int integer;
		float decimal;
		double longnumber;
		character = 'A';
		integer = 5;
		decimal = 7.3f;
		longnumber = 291347.45;
		System.out.println ("character = " + character + "integer = " + integer + "decimal = " + decimal + "longnumber = " + longnumber);
		*/
		/*D
		Scanner input = new Scanner(System.in);
		 char character;
		int integer;
		float decimal;
		double longnumber;
		System.out.println("Please eenter a char : ");
		character = input.next().charAt(0);
		System.out.println("Pease enter a integer : ");
		integer = input.nextInt();
		System.out.println("Please enter a decimal (float) : ");
		decimal = input.nextFloat();
		System.out.println("Pleae enter a longnumber (double)");
		longnumber = input.nextDouble();
		System.out.println ("character = " + character + "integer = " + integer + "decimal = " + decimal + "longnumber = " + longnumber);
		*/
		
		/*--------------------------------------------------------------*/
		//LAB_3_5
		
		/*A
		Scanner input = new Scanner(System.in);
		int a, b, sum;
		sum = 0; //*
		System.out.println ("Input two integers");
		 a = input.nextInt();
		 b = input.nextInt();
		 sum = a + b;
		System.out.println (a + "+" + b + "=" + sum);
		//Input two integers
		// a + b = sum
		//1 + 2 = 3
		*/
		/*
		Scanner input = new Scanner(System.in);
		int a, b, sum;
		sum = 0; //*
		System.out.println ("Input two integers");
		 a = input.nextInt();
		 b = input.nextInt();
		 sum = a + b;
		System.out.println (a + "+" + b + "=" + sum);
		// the line with * very important if we didt use that line we will have problems
		*/
		/*--------------------------------------------------------------*/
		//LAB_3_6
			/*A
		Scanner input = new Scanner(System.in);
		 double num1, num2;
		System.out.println ("Enter the first number");
		 num1 = input.nextDouble ();
		System.out.println ("Enter the second number");
		 num2 = input.nextDouble();
		System.out.println ("the numbers: " + num2 + " " + num1 ); 
		*/
		/*--------------------------------------------------------------*/
		//LAB_3_7
		/*
		Scanner input = new Scanner(System.in);
		double Age;
		double BornYear = 0;
		double year = 2020;
		System.out.println("Please enter your Age :");
		Age = input.nextDouble();
		System.out.println("Your Age is a : " + Age);
		BornYear = year - Age;
		System.out.println("You was born in : " + BornYear);
		*/
		
		
		
		
	}

}
