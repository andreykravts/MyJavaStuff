

import java.util.Scanner;
public class ex6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int x = 0, y =0, i =0, mult = 1, sum = 0;
        while(i < 10){
        System.out.println("please enter x :");
        x = sc.nextInt();
        System.out.println("please enter y :");
        y = sc.nextInt();
        mult = x*y;
        i++;
        System.out.println("A multiply is :"+mult);
        sum +=(x+y); 
        }
        if(sum>100)
        System.out.println("sum is much bigger then 100");
        else
        System.out.println("sum is less then 100");

	}
}
