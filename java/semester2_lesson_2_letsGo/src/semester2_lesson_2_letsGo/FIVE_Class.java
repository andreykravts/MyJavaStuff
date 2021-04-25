
package semester2_lesson_2_letsGo;
import java.util.Scanner;
public class FIVE_Class {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = 0,sum = 0;
		System.out.println("enter a number : ");
		num = sc.nextInt();
		while(num!=0) //while(num>=0)
		{
			sum+=num;
			System.out.println("enter a number : ");
			num = sc.nextInt();
		}
		System.out.println("the sum is "+sum);
	}
}
