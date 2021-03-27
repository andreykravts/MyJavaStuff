

package semester2_lesson_2_letsGo;
import java.util.Scanner;
public class next_class {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x, y;
		x=sc.nextInt();
		y=sc.nextInt();
		
		while(x != 0 || y!=0) {
		System.out.println((Math.min(x, y)+" "+Math.max(x, y)));
			x=sc.nextInt();
			y=sc.nextInt();
			
			
		}
	}
}
