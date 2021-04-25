import java.util.Scanner; 
public class quastion5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		
		int dec = input.nextInt();
		int jan = input.nextInt();
		int feb = input.nextInt();
		int mar = input.nextInt();
		
		int AVGyear= (dec+jan+feb+mar)/12;// avg amount of the rain yearly
		
		//A
		
		System.out.println((dec > AVGyear)? "More of AVG yearly ": (dec == AVGyear)?"Dec equal AVGyear":"Less of AVG yearly ");
		System.out.println((jan > AVGyear)? "More of AVG yearly ": (jan == AVGyear)?"Jan equal AVGyear":"Less of AVG yearly ");
		System.out.println((feb > AVGyear)? "More of AVG yearly ": (feb == AVGyear)?"Feb equal AVGyear":"Less of AVG yearly ");
		System.out.println((mar > AVGyear)? "More of AVG yearly ": (mar == AVGyear)?"Mar equal AVGyear":"Less of AVG yearly ");
		
		//B
		System.out.println(((AVGyear*12)>600)? "Rainy year":"Year aren't rainy");
		//C
		int a =Math.max(dec, jan);
		int b = Math.max(a, feb);
		int c = Math.max(b, mar);
		
		if (c == jan)
			System.out.println("Januar " + c);
		else
		if (c == dec)
			System.out.println("December " + c);
		else
		if (c == feb)
			System.out.println("Februar " + c);
		else
		if (c == mar)
			System.out.println("Marth " + c);
		//D
		a =Math.min(dec, jan);
		b = Math.min(a, feb);
		c = Math.min(b, mar);
		
		if (c == jan)
			System.out.println("Januar " + c);
		else
		if (c == dec)
			System.out.println("December " + c);
		else
		if (c == feb)
			System.out.println("Februar " + c);
		else
		if (c == mar)
			System.out.println("Marth " + c);
		
	}
	}