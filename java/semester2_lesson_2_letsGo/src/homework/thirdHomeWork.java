
package homework;
import java.util.Scanner;

public class thirdHomeWork {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int x = 0, y = 0, i = 0;
			x = sc.nextInt();
			y = sc.nextInt();
			i = sc.nextInt();
			System.out.println(x);
			System.out.println(y);
			while(i>0) {
				x=x+y;
				y=x+y;
				System.out.println(x);
				System.out.println(y);
				i--;
			}
		}
	}

