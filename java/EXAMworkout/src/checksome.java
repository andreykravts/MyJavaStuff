import java.util.Scanner;
public class checksome {

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
		
		boolean bool = ((x%2==0)&&(y%2==0)&&(z%2==0))||(!(x%2==0)&&!(y%2==0)&&!(z%2==0));
			System.out.println(bool);

	}

}
