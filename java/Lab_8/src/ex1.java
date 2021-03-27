import java.util.Scanner;
public class ex1 {
public static void main (String[] args)
{
Scanner input = new Scanner(System.in);
double x,y,z,l, min,max,sum,avg;
x = input.nextDouble();
y = input.nextDouble();
z = input.nextDouble();
l = input.nextDouble();

sum = x + y + z + l;
//min = Math.min(Math.min(x,y), Math.min(z,l)) ;

if(Math.min(x,y) < Math.min(z,l)) {
	min = Math.min(x,y);
}else {
	min = Math.min(z,l);
}

//max = Math.max(Math.max(x,y), Math.max(z,l)) ;
if(Math.max(x,y) > Math.max(z,l)) {
	max = Math.max(x,y);
}else {
	max = Math.max(z,l);
}

avg = sum /4;


System.out.println("AVG = "+ avg +" "+"Max : " + max  +" "+"MIN : " + min  +" "+"sum = "+sum);




}
}