package semester2_lesson_2_letsGo;


import java.util.Scanner;
public class next1_class {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = 0,i=0;
		boolean flag = true;
		while(i<10) {
			num = sc.nextInt();
			i++;
			if(num%i!=0)
				flag = false;
			
		}
		if(flag)
			System.out.println("all numbers divided by i");
		else 
			System.out.println("not all numbers divided by i");
}
}
