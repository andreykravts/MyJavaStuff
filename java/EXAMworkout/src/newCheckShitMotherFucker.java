
import java.util.Scanner;

public class newCheckShitMotherFucker {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int m, n1, n2;
		boolean f=false;
		System.out.println ("enter two numbers");
		double num1= input.nextDouble();
		double num2= input.nextDouble();
		m=(int) (num1+num2);
		n1=(int) num1;
		n2=(int) num2;
		while (num1*num2 != 0)
		{
		f=true;
		if (num1+num2< m)
		{
		m=(int) (num1+num2);
		n1=(int) num1;
		n2=(int) num2;
		}
		System.out.println ("enter two numbers");
		num1= input.nextDouble() ;
		num2= input.nextDouble() ;
		}
		if( f)
		System.out.println ( "n1 ="+n1+" n2="+ n2+" m= "+m);
		else
		System.out.println (" no numbers");

	}

}
