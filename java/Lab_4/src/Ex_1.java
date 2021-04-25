import java.util.Scanner;
public class Ex_1 {

	public static void main(String[] args) {
		/*-------------------------------------------------------------*/
		//LAB_04_1
		/*
		Scanner input = new Scanner(System.in);
		double Radius;
		System.out.println("Please enter a num of the Radius : ");
		Radius = input.nextDouble();
		System.out.println("Your Radius is :" + Radius);
		double Diametr=0;
		double 	AreaOfFoursquare=0;
		Diametr = 2 * Radius;
		System.out.println("Your קוטר  is : " + Diametr);
		AreaOfFoursquare = 2*Math.pow(Radius, 2);
		System.out.println(" Area of the FourSquare in the Circle is : "+ AreaOfFoursquare);
		double AreaOfFoursquareOutsideTheCircle = 0;
		AreaOfFoursquareOutsideTheCircle = 4* Math.pow(Radius, 2);
		System.out.println(" Area of the FourSquare outside of the Circle is : "+ AreaOfFoursquareOutsideTheCircle);
		*/
		//AreaOfCircle = Math.PI*Math.pow(Radius, 2);
		//System.out.println("AreaOfCircle is : "+ AreaOfCircle);
		/*-------------------------------------------------------------*/
		//LAB_04_2
		/* 
		int number = 7;
		 System.out.println ("Number = "+ number);
		 number += 8+6;// number = number + 8+6;
		 System.out.println ("Number = "+ number);
		 number += 3;// number = number + 3;
		 
		 System.out.println ("Number = "+ number);
		 System.out.println ("Number = "+ (++number));// number = 1+ number; Here we see result of operation :(++number)
		 System.out.println ("Number = "+ number++);//number = number + 1; Here we didnt se result of operation number++ because of we didnt have ()
		 System.out.println ("Number = "+ number); // Here we will see result of upline.
		*/
		// If we will change place of two last lines
		
		/*
		 int number = 7;	
		System.out.println ("Number = "+ number);
		 number += 8+6;// number = number + 8+6;
		 System.out.println ("Number = "+ number);
		 number += 3;// number = number + 3;
		 
		 System.out.println ("Number = "+ number);
		 System.out.println ("Number = "+ (++number));// number = 1+ number; Here we see result of operation :(++number)
		 System.out.println ("Number = "+ number); // Here we have just print of upline.
		 System.out.println ("Number = "+ number++);//Here we have just print of upline. But we cant see result of number++. Because of number++ Didnt have ()outside.
		 // we put here 
		//System.out.println ("Number = "+ number); //we will see result of upline
		*/
		 /*-------------------------------------------------------------*/
	//LAB_04_3
		/*
		int a = 1, b = 2, c = 3, d = 4;
		System.out.println ("a = "+a+ ", b = "+b +", c = "+c+ ", d = "+ d); // a = 1 b=2 c =3 d=4
		System.out.println ("a++ = "+ a++);// a =1
		System.out.println ("++b = "+( ++b));//b=3
		System.out.println ("c-- = "+ c--);//c =3
		System.out.println ("--d = "+ --d); //d=3
		System.out.println ("a = "+a+ ", b = "+b +", c = "+c+ ", d = "+ d);
		a=4;
		 b=2;
		 c=3;
		 c+=a;
		 b*=c;
		System.out.println ("a = "+a+ ", b = "+b +", c = "+c +", d = "+ d); // a = 4 b =14 // c = 7 d = 
*/
		/*-------------------------------------------------------------*/
		//LAB_04_4
		/*
			int x, y, w, result;
			x=7; y=5; // x = 7 y = 5
			w=result=3; // w = 3 result = 3
			result=(y+ --x); // result = 11;
			System.out.println ("result= "+ result +" x="+x); //result = 11 x =6
			result+=(y++ -x)*(--w*2)/8; //result = (11 - 5) * (2 * 2)/8   //result = 11
			 System.out.println ("result= "+ result +" x="+x +" w="+ w +" y="+ y);// result = 11 x = 6 w = 2 y = 6 
			 */
		/*-------------------------------------------------------------*/
		//LAB_04_5
		/**/
		/*
		Scanner input = new Scanner(System.in);
		int num,a,b,c;
		num = input.nextInt();
		c = num%10;// אחדות
		b= num/10%10; //עשרות
		a= num/10/10; // מאות
				System.out.println("a= "+a+"b= "+b+"c= "+c);
		if(a<b) {
			if(b<c) {
				System.out.println("yes1");
			}
		}
		*/
		/*-------------------------------------------------------------*/
		//LAB_04_6
		/*
		Scanner input = new Scanner(System.in);
		int num,a,b,c;
		num = input.nextInt();
		c = num%10;// אחדות
		b= num/10%10; //עשרות
		a= num/10/10; // מאות
				System.out.println("a= "+a+"b= "+b+"c= "+c);
		if(a==0 || b == 0 || c==0) {
			System.out.println("yes you have a zero here");
		}else {
			System.out.println("no you are didnt have zero here");
		}
		*/
		
		
		
	}

}
