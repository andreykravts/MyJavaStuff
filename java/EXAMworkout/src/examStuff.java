
public class examStuff {
public static void main(String[] args) {

int i1,i2,i3;
double d1,d2;
float f1;
boolean b1,b2;
f1=(float)(d1=d2=3);
i1=(int) (d1/2);
i2=(int)d1++/2;
f1+=i1;
d2*=i2/3;
System.out.println("i1=" + i1+" ,i2="+ i2+" ,d1="+ ++d1+" ,d2=" +d2+ " ,f1=" + f1);
i1=(i2=3%7+6/4*6%4-(i3=5));
b1= 48>'0' && i1++>8;
b2= 33 == '!' || ++i2 == 9;
System.out.println("i1="+ i1+3 +" ,i2="+(i2+3)+" ,i3="+ i3-- +" ,b1=" + b1+",b2="+b2);
d1=(i1=6-9*7%2+5)/(i2=8-4);
d2=i1/(f1=8-4);
System.out.println("i1="+ i1+" ,i2="+i2 +" ,f1=" + (int)f1+" ,d1="+d1+" ,d2=" +(d2+=1.6) );
i1=i2=69;
d1=(i1*=(i2++)/10-7)+10.6*18%10;
d2=i2/5-9;
b1=d1>0 || d2++>0;
b2=i1-3>0 && --i2-3>5;
System.out.println("i1="+i1+" ,i2="+i2 +" ,d1=" + d1 + " ,d2="+ d2 + " ,b1="+ !b1 +",b2=" + b2 );
}
}



