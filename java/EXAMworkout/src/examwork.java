
public class examwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1,i2,i3;
		double d1,d2,d3;
		boolean b1,b2;
		i1=57;
		i2=i1%10*10+i1/10;
		i3=i2%10*10+i2/10;
		d1=(double)i1/2;
		d2=(double)(i1/2);
		d3=i1/2.0;
		System.out.println("i2="+i2+" ,i3="+i3 +" ,d1="+d1+" ,d2="+ ++d2 + ",d3="+ (d3+=2));
		b1=('a'-'d'<'a'-'r' || (i1=4)<8);
		b2=(b1 && (i2=i1++)>9);
		System.out.println("i1="+i1+" ,i2="+i2 +" ,b1="+b1+" ,b2="+b2);
		d1=d2=i1=i2=9;
		i3=(i1*=3-4/5+8%3)+(int)(d1+=i2-9/3%2);
		System.out.println(i1);
		b1=(--d2>9 && (i2=i3)>17.3);
		System.out.println("i1="+i1+" ,i2="+i2 +" ,i3="+i3+" ,d1="+d1+" ,d2="+ d2 + ",b1="+ !b1 );
		i1=i2=i3=256;
		d1=(i1%=i2/5)+1.1*3+14/3;
		d2=i2--/2%17;
		b1=(d1>-8 || i3++>8);
		System.out.println("i1="+i1+" ,i2="+i2 +" ,i3="+i3+" ,d1="+d1+" ,d2="+ d2 + ",b1="+ !b1 );

	}

}
