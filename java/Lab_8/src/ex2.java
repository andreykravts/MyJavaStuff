import java.util.Scanner;
public class ex2 {
public static void main (String[] args)
{
Scanner input = new Scanner(System.in);

//double x=11;
double x = input.nextDouble();
//222
// false || TRUE 
// 222<10 || 223 > 11
//x = 223.03
if (x<10 || ++x>11)  
	// false || TRUE 
	// 11<10 || 12 > 11
System.out.println ("Test is TRUE, x= "+x); // x = 12.0
else
System.out.println ("Test is FALSE, x="+x);
}
}
