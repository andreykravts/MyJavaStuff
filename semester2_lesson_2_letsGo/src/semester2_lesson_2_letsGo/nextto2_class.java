

package semester2_lesson_2_letsGo;
import java.util.Scanner;
public class nextto2_class {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a = 0,num = 0,sum = 0,b=0,count=0;
		a = sc.nextInt();
		while(a<0) {
			System.out.println("Please try again we need one positive! :");
		a = sc.nextInt();}
		b = sc.nextInt();
		while(b<0) {
			System.out.println("Please try again we need one positive! :");
		b = sc.nextInt();}
		
		while(a>sum || b == count) {
			sum = sc.nextInt();
			
			sum+=num;
			count++;
		}
		System.out.println("SUM"+sum);
	}

}
