
package semester2_lesson_2_letsGo;
import java.util.Scanner;
public class first_class {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int lenght = 0;
		int num = sc.nextInt();
		lenght = num;
		int counter = 0;
		int maxNum=0;
		int numOrder = 0;
		for(int i = 1; i<=lenght; i++)
		{
			num = sc.nextInt();
			if(num>0) {
				
				counter++;
			}
			if(num>maxNum) {
				maxNum = num;
				numOrder = counter;
			}
			
		}
		System.out.println("the num of positive numbers is : "+counter);
		System.out.println("the Max num is : "+maxNum+ "num of number  in the order is : "+numOrder);
		
	}
}
