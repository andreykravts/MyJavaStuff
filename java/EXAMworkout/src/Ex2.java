import java.util.Scanner;
public class Ex2 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter a number: ");
int num=sc.nextInt();
boolean flag= (num > 29 && num < 71)||(num < -29 && num > -71);//****
System.out.println("the dig's is equal="+flag);
}
}
