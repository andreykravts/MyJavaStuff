import java.util.Scanner;
public class newCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int	num = sc.nextInt();
		while(num>1000 || num<0) {
			System.out.println("Please try again");
		num = sc.nextInt();
			}
		System.out.println(num);
		int x = num/100;
		int y = (num/10)%10;
		int z = (num%10)%10;
		System.out.println(x+" "+y+" "+z);
		int minus = (x-y)-z;
		boolean bool = (!(minus%2==0)&&(minus<0));
			System.out.println(bool);

	}

}
