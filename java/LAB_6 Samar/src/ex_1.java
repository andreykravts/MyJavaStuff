import java.util.Scanner; 
public class ex_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		{
			int a=2, b=6, c=13;
			double x=2.3, y=4, z=1.5;
			char c1,c2,c3 = 'A';
			c1=c2=c3+=1;
			System.out.println ("c1="+c1+", c2= "+c2+", c3= "+c3);
			a+=b*=c%=4;
			System.out.println ("c1="+c1+", c2= "+c2+", c3= "+c3);
			c2+=c3='E'-'A';
			System.out.println ("c1="+c1+", c2= "+c2+", c3= "+(int)c3);
			x=z*=a - ++y;
			System.out.println ("x="+x+", y= "+y+", z= "+z);
			a=2; b=6; c=13;
			x = (double) (c/3)+0.8;
			a = (int)((double) (c/3)+0.8);
			y = (double) c/3+0.8;
			b = (int)((double) c/3+0.8);
			z = c/3 +0.8;
			System.out.println ("a="+a+" , b= "+b+", c= "+c);
			System.out.println ("x="+x+", y= "+y+", z= "+z);
			 }
	}
}
