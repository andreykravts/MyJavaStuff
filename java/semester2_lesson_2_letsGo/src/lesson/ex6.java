package lesson;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=1;
		Scanner sc = new Scanner(System.in);
		do {
			int num = sc.nextInt();
			if(num%2==0 || num%3==0) {
			counter++;
			System.out.println(num);
		}
		}while(counter<=20);
	}

}
