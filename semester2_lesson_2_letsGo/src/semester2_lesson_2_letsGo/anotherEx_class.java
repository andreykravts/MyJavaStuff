package semester2_lesson_2_letsGo;



import java.util.Scanner;
public class anotherEx_class {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = 0,dig,sumdigs=0;
		num = sc.nextInt();
		while(num!=0) {
			dig = num%10; // taka dig 
			System.out.println("dig"+dig); // print dig
			num/=10;// drop printed dig
			sumdigs +=dig; // make sum of digs
		}
		System.out.println(sumdigs);
		}
	}

