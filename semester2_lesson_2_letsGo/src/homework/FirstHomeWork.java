package homework;
import java.util.Scanner;

public class FirstHomeWork {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,dig;
		boolean flag = true;
		num = sc.nextInt();
		while(num<=0) {
			System.out.println("try again");
			num = sc.nextInt();
		}
		
		while(num>0 && flag) {
			
			dig=num%10;
			if(dig%2==0) {
				System.out.println("Yes");
			}
			else {
				flag = false;
				System.out.println("No");}
			num/=10;
		}
	}
}
