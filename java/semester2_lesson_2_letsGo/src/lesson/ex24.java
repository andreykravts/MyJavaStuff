package lesson;

import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner input = new Scanner(System.in);
		int mone=0;
		float num, avg,sum=0; // ERROR num
		System.out.println ("Enter a number. The last one will be 0");
		int num = input.nextInt();
		while (num!=0)
		 {
		 mone++;
		 sum+=num;
		 System.out.println ("Enter a number. The last one will be 0");
		num = input.nextInt();
		 }
		avg=sum/mone;
		System.out.println ("the average is "+ avg);
		// infinity!!!
		 * */
		 
		
		Scanner input = new Scanner(System.in);
		int mone=0;
		float avg = 0,sum=0; // ERROR num
		System.out.println ("Enter a number. The last one will be 0");
		int num = input.nextInt();
		while (num!=0)
		 {
		 mone++;
		 sum+=num;
		 System.out.println ("Enter a number. The last one will be 0");
		num = input.nextInt();
		 }
		if(mone!=0)
		avg=sum/mone;
		System.out.println ("the average is "+ avg); // enter a 0
		// infinity!!!
	}

}
