
import java.util.Scanner;
public class  checking{
 public static void main (String[] args) {
 Scanner input = new Scanner (System.in);
int num, i; 
boolean flag ;
num = input.nextInt() ;
flag = true ;
System.out.println (" "+num);
while (num >= 10) {
 if (num%100/10 > num%10) {
flag = flag;
System.out.println(flag);}
 else flag = false;
 num/= 10;
 System.out.println(num);
}
System.out.println(""+(!flag ? "no" : "yes"));
}
}
