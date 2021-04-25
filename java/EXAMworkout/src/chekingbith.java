
import java.util.Scanner;

public class chekingbith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			 Scanner input = new Scanner (System.in);
			int num, i; 
			Boolean flag ;
			num = input.nextInt();
			flag = true ;
			System.out.println (""+num);
			while (num >= 10) {
			 if (num%100/10 > num%10)
			flag = flag;
			 else flag = false;
			 num /= 10;
			 System.out.println(num);
			}
			System.out.println ((!flag ? "no" : "yes"));
			System.out.println(flag);
			}
			
	}


