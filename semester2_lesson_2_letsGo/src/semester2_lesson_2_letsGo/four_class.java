
package semester2_lesson_2_letsGo;
import java.util.Scanner;
public class four_class {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,y,z, avg = 0;
	int min=1,max=100,range = max - min + 1, j =0;
	
		//Automate
			System.out.println("Please enter a x :");
			for(j = 0; j<max; j++) {
			x = (int) (Math.random()*range)+min;
			System.out.println("Please enter a y :");
			y = (int) (Math.random()*range)+min;
			System.out.println("Please enter a z :");
			z = (int) (Math.random()*range)+min;
		
			avg = (x+z+y)/3;
			System.out.println("AVG : "+avg);
			if(x == avg) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
			
		}
	}

}
