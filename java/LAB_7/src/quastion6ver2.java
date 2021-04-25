import java.util.Scanner; 
public class quastion6ver2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,c;
		System.out.println("Please enter a three numbers : ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		//min
		int ab = Math.min(a, b);
		int min = Math.min(ab, c);
		
		//max
		 ab = Math.max(a, b);
		int max = Math.max(ab, c);
		
		//mid
		 if(( a> min)&&( a<max)) 
		 {
			 System.out.println(min+" " +a+" " +max);
		 }
		 else if(( b> min)&&( b<max)) 
		 {
			 System.out.println(min+" " +b+" " +max);
		 }
		 else  if(( c> min)&&( c<max)) 
		 {
			 System.out.println(min+" " +c+" " +max);
		 }
		 
	}
	}