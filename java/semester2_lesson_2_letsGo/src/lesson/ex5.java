package lesson;
import java.util.Scanner;
public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int shops = 3;
		int stylepen = 5;
		int price = 0;
		int sumPrice = 0;
		int MAXsumPrice = 0;
		int price1 = 0;
		for (int j = 1; j<=shops; j++) {
		if(	MAXsumPrice<price1) {
			MAXsumPrice=price1;
			System.out.println("MaxPrice is "+MAXsumPrice);
		}
		for(int i = 1; i<=stylepen; i++) {
		price = sc.nextInt();
		sumPrice+=price;
	
		}
		price1=sumPrice;
		
			sumPrice=0;
		
		
		System.out.println("Shop num "+j+"sum of price pens is "+sumPrice);
		}
		/*
		 * Scanner sc=new Scanner(System.in);
		int stor; //counter out for
		int pen;//counter in for
		double price,sum,max=0,maxi=0;
		for(stor=1;stor<=3;stor++)
		{
			for(pen=1,sum=0;pen<=5;pen++)
			{
				System.out.print("enter the price "+pen+" pen in stor "+stor+" : ");
				price=sc.nextDouble();
				sum+=price;
			}
			if(sum>max)
			{
				max=sum;
				maxi=stor;
			}
		}
		System.out.println("the max price "+max);

		 * */
	}

}
