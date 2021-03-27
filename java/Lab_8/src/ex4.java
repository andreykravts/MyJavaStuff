import java.util.Scanner;
public class ex4 {
public static void main (String[] args)
{
Scanner input = new Scanner(System.in);
System.out.println("enter a first char!");
char ch1 = input.next().charAt(0);
System.out.println("enter a second char!");
char ch2 = input.next().charAt(0);
System.out.println("enter a therd char!");
char ch3 = input.next().charAt(0);

if((ch1 % 2 == 0 || ch1 %1 == 0) && (ch2 % 2 ==0 || ch2 %1 == 0) && (ch3 % 2 ==0 || ch3 %1 == 0)) 
{
	System.out.println("Thats numbers! : " +ch1+" "+ch2 +" "+ch3);
	System.out.println( ch1+" "+ch3 +" "+ch2);
	System.out.println( ch1+" "+ch2 +" "+ch3);
	System.out.println( ch3+" "+ch2 +" "+ch1);
	
	int a = Character.getNumericValue(ch1);
	int b = Character.getNumericValue(ch2);
	int c = Character.getNumericValue(ch3);
	int sum =a+b+c;
	System.out.println("The sum of the digits is : " +sum);
}
else {
	System.out.println("Error");
}
}
}