package lesson;

import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=1;
		Scanner sc = new Scanner(System.in);
		char ch = 0; 
		int counterPlace = 1;
		do {
			System.out.println("enter char");
			ch = sc.next().charAt(0);
			if(ch == 'W') {
				counter=counterPlace;
				System.out.println(" place W is : "+counter);
			}else {
				System.out.println("Didnt have W");
			}
			counterPlace++;
		}while(counterPlace <=5);
		
		
		
		}
	}
