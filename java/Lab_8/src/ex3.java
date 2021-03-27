import java.util.Scanner;
public class ex3 {
public static void main (String[] args)
{
Scanner input = new Scanner(System.in);
double price = 0;

System.out.println("Press I For Israel otherwise other country");
char ch = input.next().charAt(0);
if(ch == 'I') {
	//Israel	
	System.out.println("Please enter a weight of the box : ");
	double WeightBox = input.nextDouble();
	if(WeightBox <= 2.0)
	{
		price = 5*0.5*WeightBox;
		System.out.println("Price above littleBox : "+price);
	}else if(WeightBox>2.0 && WeightBox <= 5.0) {
	price = 7*0.5*WeightBox;
	System.out.println("Price above MiddleBox : "+price);
	}else if(WeightBox>5.0) {
			price = 10*0.5*WeightBox;
			System.out.println("Price above BigBox : "+price);
		}
	}
else {
	//outside
	System.out.println("Please enter a weight of the box : ");
	double WeightBox = input.nextDouble();
	if(WeightBox <= 2.0)
	{
		price = 5*0.5*WeightBox+7;
		System.out.println("Price above littleBox : "+price);
	}else if(WeightBox>2.0 && WeightBox <= 5.0) {
	price = 7*0.5*WeightBox+7;
	System.out.println("Price above MiddleBox : "+price);
	}else if(WeightBox>5.0) {
			price = 10*0.5*WeightBox+7;
			System.out.println("Price above BigBox : "+price);
		}
	}
}
}
