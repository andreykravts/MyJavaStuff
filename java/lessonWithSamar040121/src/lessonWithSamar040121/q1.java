package lessonWithSamar040121;

import java.util.Scanner; 

public class q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 3;
		System.out.println((x==3)? "hello" : "ok");
		int y = input.nextInt();
		int a = y/100; 
		System.out.println(a);
		int b = (y/10)%10;
		System.out.println(b);
		int c =  y%10;
		System.out.println(c);
		System.out.println((a==b || b==c || a==c)? "here two equal digits" : "digits are not equel");
		System.out.println((y%10!=(y/10)%10 && y%10!=y/100 && (y/10)%10 != y/100)? "ok": "not ok");
		System.out.println((a!=b && b!=c && a!=c)?  "digits are not equel": "here two equal digits");
	}
}