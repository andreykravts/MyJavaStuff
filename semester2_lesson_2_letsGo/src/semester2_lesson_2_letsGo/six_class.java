
package semester2_lesson_2_letsGo;
import java.util.Scanner;
public class six_class {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = 0,sum = 0,counter = 0;
		System.out.println("enter a number : ");
		num = sc.nextInt();
		while(num>100) //while(num!=100)?
		{
			sum+=num;
			System.out.println("enter a number : ");
			num = sc.nextInt();
			counter++;
			
		}
		System.out.println("the sum is "+sum);
		if(counter!=0)
		System.out.println("AVG of sum is : "+(sum)/counter);
	}
}
