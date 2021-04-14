

import java.util.Scanner;
public class ex3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        double i = 0, sum = 0, num = 0;
            while(i<10)
            {
                num = sc.nextDouble();
                sum+=num;
                i++;
            }
            System.out.println("AVG = "+ (sum/i));
	}
}
