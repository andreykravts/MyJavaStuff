
package semester2_lesson_2_letsGo;
import java.util.Scanner;
public class seven_class {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age = 0,maxAge=0, minAge=0 , count = 0, sum = 0;
		System.out.println("enter a number : ");
		age = sc.nextInt();
		maxAge=age;
		minAge=age;
		while(age!=0)
		{
		
			if(age>maxAge) {
				
				maxAge = age;
			    
			    }
			if(age<minAge)
				{
				minAge = age;
			    
			    }
			sum+=age;
			count++;
			System.out.println("enter a number : ");
			age = sc.nextInt();
			
			
			
		}
		if(count!=0) {
		System.out.println("maxAge"+maxAge+" MinAge is :"+minAge);
		System.out.println("Avg"+sum/count);
		}
	}
}
