import java.util.Scanner; 
public class quastion6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,c, minNum = 0,midNum = 0, maxNum = 0;
		System.out.println("Please enter a three numbers : ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		if(a < b && a < c) {
			System.out.println("small number : "+a);
			minNum = a;	
			if(b < c) {
				midNum = b;
				System.out.println("midNum is : "+b);
				maxNum = c;
				System.out.println("maxNum is : "+c);
		}
			else
				if(c< b) {
					midNum = c;
					System.out.println("midNum is : "+c);
					maxNum = b;
					System.out.println("maxNum is : "+b);}
		}
		else
			
		if(b < a && b < c) {
			System.out.println("small number : "+b);
			minNum = b;
			if(a< c) {
				midNum = a;
				System.out.println("midNum is : "+a);
				maxNum = c;
				System.out.println("maxNum is : "+c);}
			else
				if(c< a) {
					midNum = c;
					System.out.println("midNum is : "+c);
					maxNum = a;
					System.out.println("maxNum is : "+a);}
		}
		else
			
		if(c < b && c < a) {
			System.out.println("small number : "+c);
			minNum = c;
			if(b< a) {
				midNum = b;
				System.out.println("midNum is : "+b);
				maxNum = a;
				System.out.println("maxNum is : "+a);}
			else
				if(a< b) {
					midNum = a;
					System.out.println("midNum is : "+a);
					maxNum = b;
					System.out.println("maxNum is : "+b);}
			}
		else {System.out.println("Your numbers are equal");}
		System.out.println(minNum +" "+ midNum +" "+ maxNum);
}
}