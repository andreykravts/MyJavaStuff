import java.util.Scanner;
public class Easy {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter a number: ");
int num=sc.nextInt();

while(num>999&&num<100) {
	System.out.println("enter a number: ");
	num=sc.nextInt();
}

int a,b,c,sub=0;
a=num/100;
b=num/10%10;
c=num%100;
sub = a - b - c;
if(sub<0 && sub%2!=0) {
	System.out.println("True");
}else {
	System.out.println("False");
}

}

}
