import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int sum = 0;
		int i = 1;
		while(i<=3) {
			num = input.nextInt();
			sum += num;
			System.out.println(num);
			i++;
		}
		System.out.println("The avrage = "+ sum/3);
		
	}

}
