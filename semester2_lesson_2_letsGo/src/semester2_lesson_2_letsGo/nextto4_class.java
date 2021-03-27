

package semester2_lesson_2_letsGo;
import java.util.Scanner;
public class nextto4_class {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum = 0,x,y,result=0;
		x=sc.nextInt();//1
		y=sc.nextInt();//2
		System.out.print(x);
		System.out.print(y);
		sum = x + y;//3
		
		while(sum<2000) {
			result = x + y; // 3
			System.out.println(" "+result);
			sum+=result; // 3 + 1 + 2
			x=sum; // 1
			y=result; // 2
		}
		
	}

}
