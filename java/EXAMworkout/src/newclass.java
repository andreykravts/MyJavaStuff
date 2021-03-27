import java.util.Scanner;
public class newclass {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter a number: ");
int num=sc.nextInt();
boolean flag= num % 111 == 0;//****
System.out.println("the dig's is equal="+flag);
}
}