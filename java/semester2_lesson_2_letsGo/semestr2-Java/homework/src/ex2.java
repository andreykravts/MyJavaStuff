

import java.util.Scanner;
public class ex2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        double i = 1, sum = 1;
            while(i<=10){
            sum*=1/i;
            i++;
            }
            
            System.out.println("sum = "+sum);
	}
}
