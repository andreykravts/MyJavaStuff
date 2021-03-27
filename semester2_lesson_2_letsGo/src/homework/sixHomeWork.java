
package homework;
import java.util.Scanner;

public class sixHomeWork {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter(" ");
		int  ca,ce,co,cu,ci;
		ca=ce=ci=co=cu=0;
		boolean flag = true;
		char ch;
		do {
			ch = sc.next().charAt(0);
			switch(ch) {
			case 'a':
			case 'A': ca++; break;
			case 'e':
			case 'E': ce++; break;
			case 'i':
			case 'I': ci++; break;
			case 'o':
			case 'O': co++; break;
			case 'u':
			case 'U': cu++; break;
			default : break;
			}
			
			
		}
		while(ch!='.');
		
		
		System.out.println("amount a = "+ca);
		System.out.println("amount a = "+ce);
		System.out.println("amount a = "+ci);
		System.out.println("amount a = "+co);
		System.out.println("amount a = "+cu);
	}
	
}//hi there.
