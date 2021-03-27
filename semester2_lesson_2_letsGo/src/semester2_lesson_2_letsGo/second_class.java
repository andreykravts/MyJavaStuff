
package semester2_lesson_2_letsGo;
import java.util.Scanner;
public class second_class {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int x,y,numOfIteration = 10, i = 1, sum = 0;
		
		while(i<numOfIteration) {
			System.out.println("Please enter a x :");
		x = sc.nextInt();
		System.out.println("Please enter a y :");
		y = sc.nextInt();
		
		sum += x*y;
		i++;
		System.out.println("Sum of x*y : "+sum);
		}
		if(sum>100)
			System.out.println("Math.sqrt  "+Math.sqrt(sum));
		else
			System.out.println("Math.abs   "+Math.abs(sum));
			
	}

}
