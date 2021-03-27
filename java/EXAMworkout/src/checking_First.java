
import java.util.Scanner;

public class checking_First {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
		
		int i1= 0, i2=0, i3, i4;
		float f1=3, f2;
		boolean b1;
		b1 = 2.5 +3> 2 || ++i1==1;
		i1 +=(int)( f1 + 5.8);
		i2 =(int)( -3 % 2 +4.3 / 2);
		f2 = (float) (22 / 10) * (int)2.1;
		System.out.println(b1+" " +i1+" "+i2+" "+ f2);
		i1 = i3 = 5;
		i2=1;
		b1= !(6>3) && i1++>7 || i3--==2;
		i2 *= 3+2-1/7-1%17;
		System.out.println(i1+" "+i2+" "+i3+" "+b1);
		i1=(int)(f1=8.5f);
		i2=i1++ + -7%9 + ++i1;
		b1=i1>102 || (++i2)>2 && --f1<9;
		System.out.println(i1+" "+i2+" "+b1);
		
	}

}
