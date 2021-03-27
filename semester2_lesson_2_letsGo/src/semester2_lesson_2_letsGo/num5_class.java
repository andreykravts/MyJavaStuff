package semester2_lesson_2_letsGo;



import java.util.Scanner;
public class num5_class {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = 0,dig,sumdigs=0,i=0;
		boolean flag = true;// all numbers divided by 5
		while(i<15) {
		num = sc.nextInt();
		if(num%5!=0)
			flag = false; // not all numbers divided by 5
		i++;
		}
		if(flag)
			System.out.println("all numbers divided by 5");
		else 
			System.out.println("not all numbers divided by 5");
		}
	}
