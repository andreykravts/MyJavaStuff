import java.util.Scanner;
public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int num=sc.nextInt();
		boolean flag= (num > 29 && num < 71) || (num < -29 && num > -71);//****
		System.out.println("the dig's is equal="+flag);

	}

}
