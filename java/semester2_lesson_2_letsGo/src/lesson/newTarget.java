package lesson;
import java.util.Scanner;
public class newTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		sc.useDelimiter("");
		int  ca ,word = 0;
		ca=0;
		boolean flag = true;
		char ch;
		do {
			ch = sc.next().charAt(0);
			if(ch=='a' || ch=='A') {
				flag = true;
			}else if(ch==' '|| ch=='.')  {
				if(flag)
					ca++;
				flag = false;
			}
				
		}
		while(ch!='.');
		
		
		System.out.println("amount a in the last word = "+ca);


	}

}
