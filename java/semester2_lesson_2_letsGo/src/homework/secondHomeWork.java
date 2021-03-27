package homework;
import java.util.Scanner;

public class secondHomeWork {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i = 1, num=0, tmp=0;
		boolean flag = true;
	
		while(i<15) {
			if(num>=tmp) {
				tmp=num;
			flag = true;
			}
			else {
				flag= false;
			}
				
			
			num = sc.nextInt();
			i++;
		}
		if(flag)
			System.out.println("grow");
		else
			System.out.println("didnt grow");
		
	}
}
