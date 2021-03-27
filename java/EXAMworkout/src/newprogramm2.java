
import java.util.Scanner;

public class newprogramm2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int First,second;
		boolean flag =  true;
		First = sc.nextInt();
		second = sc.nextInt();
		//check second
		if(second > 9 || second<0)
		{
			flag  = false;
			while(flag == false) {
				System.out.println("Try second again");
				second = sc.nextInt();
				if(second < 9 || second <0)
					flag  = true;
				}
			}
		else {
			System.out.println("Second is ok");
		}
		//check first
		if(First > 999 || First<100)
		{
			flag  = false;
			while(flag == false) {
				System.out.println("try first AGAYN");
				First = sc.nextInt();
				if(First < 999 || First>100)
					flag  = true;
		}
		}else{
			System.out.println("First is ok");
		}
		
		int a,b,c;
				a = First/100; // 100
				b =(First/10)%10; // 10
				c = First%100;//1
				
				if(second == a || second == b || second == c )
					System.out.println("true");
				else
					System.out.println("false");
				
				
				
				if((second == a && second == b )|| (second == c && second == a) || (second == b && second == c) )
					System.out.println("true two times");
				else
					if(second == a || second == b || second == c )
						System.out.println("true one time");
					else
						System.out.println("false");
					
	}
}
