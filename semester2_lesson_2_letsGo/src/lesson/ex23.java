package lesson;

import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int n = 0;
		n=sc.nextInt();
		double x = 0;
		x=sc.nextDouble();
		double sum=0;
		for(int i = 1; i<=n;i++) {
			
		sum+=i*Math.pow(x, (i-1));
		System.out.println(sum);
		}

	}

}
