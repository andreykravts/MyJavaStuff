import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int a,b,c;
		 int num = (int)(Math.random()*(999-100+1))+100;
		 if(num<1000 && num>100) {
		int i = 1;
		int sum=0, counter=0;
		
		while(i<10) {
			i++;
		
		a = num/100;
		b = (num/10)%10;
		c = num%10;
		System.out.println(a+""+b+""+c);
		if(a%2==0 &&b%2==0&&c%2==0)  {
			System.out.println("True");
			sum+=num;
			counter++;
		}else if (a%2==1 &&b%2==1 &&c%2==1){
			System.out.println("False");
		}
		num = (int)(Math.random()*(999-100+1))+100;
		
		}
		if(counter !=0)
		System.out.println("Avg is : "+((float)sum/counter));
		 }

	}

}
