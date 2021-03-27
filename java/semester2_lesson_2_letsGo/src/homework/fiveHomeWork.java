
package homework;
import java.util.Scanner;

public class fiveHomeWork {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int counter = 0;
		boolean flag = true;
		char ch;
		do{
			ch = sc.next().charAt(0);
		if(ch == '.')
			flag = false;
		if(ch == 'u'|| ch == 'o'||ch =='i'||ch =='e'||ch == 'a')
			counter++;
		}
		while(flag==true);
		System.out.println(counter);
	}
	
}//hi there.
