package semester2_lesson_2_letsGo;


import java.util.Scanner;
public class new_class {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = 0,i=0;
		boolean flag = true;
		while(i<15) {
			num = sc.nextInt();
			i++;
			if(i%2!=0) {//here we take these numbers on place odd
			if(num%2!=0) // here we check that these numbers can be divide on 2
				flag = false; // that check is negative check dont forget it!
			}
		}
		if(flag)
			System.out.println("all numbers on plase odd divided by 2");
		else 
			System.out.println("not all numbers on plase odd divided by 2");
}
}
