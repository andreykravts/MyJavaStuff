

package semester2_lesson_2_letsGo;
import java.util.Scanner;
public class nextto_class {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a = 0,num = 0,sum = 0;
		a = sc.nextInt();
		while(a>sum) {
			sum = sc.nextInt();
			sum+=num;
		}
		System.out.println("SUM"+sum);
	}

}
