
package semester2_lesson_2_letsGo;
import java.util.Scanner;
public class third_class {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,y,z,numOfNumbers = 100, i = 0, avg = 0;

		while(i<numOfNumbers) {

			//manual
			System.out.println("Please enter a x :");
			x = sc.nextInt();
			System.out.println("Please enter a y :");
			y = sc.nextInt();
			System.out.println("Please enter a z :");
			z = sc.nextInt();
			
			avg = (x+z+y)/3;
			System.out.println("AVG : "+avg);
			if(x == avg) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
			
			
			
			i++;
		}
	}

}
