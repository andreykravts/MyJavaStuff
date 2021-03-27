package lesson;
import java.util.Scanner;
public class lab_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		//sc.useDelimiter("");
//		int up=0, down=10;
//		while(++up<10 || --down>0)
//		 System.out.println (up+" ,"+down);

//		
//
//			int i = 0, sum = 0;
//			while (i <= 5)
//			{
//				++i;
//				sum += i; // 1+2+3+4+5 = 15   // 1+2+3+4+5+6 =21
//				
//			
//			
//			}
//			 System.out.println ("sum = "+ sum);
//			 System.out.println(i);
//					
		
		
//		int i = 1, sum = 1;
//		while (i < 10)
//		{
//			++i;
//			sum *= i; // 1*2*3*4*5 = 15   // 1+2+3+4+5+6 =21
//			System.out.println(sum);
//		//10!=3628800
//		
//		}
//		 System.out.println ("sum = "+ sum);
//		 System.out.println(i);
		
//		int i = 1;double sum = 0;
//		while (i <= 10)
//		{
//			
//			sum += (double) 1.0/i;
//			//System.out.println(sum);
//			++i;
//		
//		}
//		 System.out.println ("sum = "+ sum);
//		 System.out.println(i);
//		

//		int i = 1; double sum = 1;
//		while (i <= 10)
//		{
//			
//			sum *= (double) 1.0/i;
//			//System.out.println(sum);
//			++i;
//		
//		}
//		 System.out.println ("sum = "+ sum);
//		 System.out.println(i);
	
//		int num=0,  i=1; double sum=0, avg = 0;
//		while(i<=10) {
//			System.out.println("enter the numbers :");
//			num=sc.nextInt();
//			sum+=num;
//			i++;
//		}
//		avg=(sum/10);
//		System.out.println(sum);
//		System.out.println("AVG "+avg);
		

//	int numStud=0,  i=1; 
//	double sum=0, avg = 0, grade ;
//	System.out.println("num student :");
//	numStud=sc.nextInt();
//		while(i<=numStud) {
//		grade = sc.nextDouble();
//		sum+=grade;
//		
//		i++;
//	}
//		if(numStud>0) {
//		avg= sum / numStud;
//		System.out.println("AVG "+avg);
//		}else {
//			System.out.println("error cant divide by zero!");
//		}
		

//		int x=0;
//		 System.out.println ("Begin");
//		while(++x<10)
//		 System.out.println (x+" ^ 2 = "+x*x);
//		 System.out.println ("End");
//
//		
		int x,y,mult,i=1,sum=0;
		while(i<=3) {
			
		x=sc.nextInt();
		y=sc.nextInt();
		mult = x*y;
		sum+=(x+y);
		i++;
		
		System.out.println(sum);
		}
		if(sum>100)
		System.out.println("More than 100");
		
		
		
		
		
		
	}

}
