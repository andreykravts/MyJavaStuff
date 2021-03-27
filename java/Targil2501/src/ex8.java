import java.util.Scanner;
public class ex8 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int d;
		 int num = (int)(Math.random()*(999-100+1))+100;
		 d= num%2;
		 num/=10;
		 while(num!=0) {
			 if(num%2!=d) {
				 System.out.println("false");
				 num=-10;
			 }
			 num/=10;
		 }
		 if(num!=-1) {
			 System.out.println("True");
		 }

	}

}
