import java.util.Scanner;
public class t {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Please enteer a number of the 4 digits!");
int num, numADD, multiply, sumDigs=0, countDigs = 0, x = 0;
num = sc.nextInt();
while(num > 9999 || num <1000) // we make check for num 4 digs
{
System.out.println("Please try again!");
num = sc.nextInt(); 
}
numADD = sc.nextInt();//whatever number
multiply = num*numADD; // we are multiply these numbers
System.out.println(multiply); // we need to know that number for check

x += multiply; 
// we can't use multiply in our operation for count how much
//digits multiply has, because if we will do it we can't use multiply for operation
//2 where we try to find sum of digits of the multiply

//This operation we need to find how much digits in the number. 
while(x!=0) {
	x/=10;
	countDigs++;
	
}
System.out.println("Num of the digs"+countDigs);
int hundred =0,modulo = 10;
hundred = (int)( Math.pow(10, countDigs));
//here we need 10 power count of the digits
//Why? Because we need to find the first digit in the multiply
//by : multiply divide by 10 power count of the digits!
System.out.println(hundred);
//this is operation two. Here we try to find sum of digs. 
if(multiply!=0) {
	sumDigs+=(multiply/hundred); 
	//in the beginning we didn't need modulo because we try to find the first digit.
	System.out.println(sumDigs);
	hundred/=10;
	// here we need to move above next digit - so we need to divide this "hundred" by 10
	while(hundred>=1) {
		// here we add modulo
		sumDigs+= (multiply/hundred)%modulo;  
		//next iteration make sum of the digs
		System.out.println(sumDigs);
		hundred/=10;
		//here we divide "hundred" by 10 next iteraion
		}
	
	}
//the last point if this number of digits can be divide by 9?
// 324/9 == 8 because of 3+2+4 = 9

int y=0, count = 1;
y+=sumDigs;
while(y!=0) {
	y/=10;
	count++;
}
int sumABC = 0;
if(count == 1)
	sumABC=sumDigs/1;
else if (count == 2) {
	sumABC= sumDigs/10 + sumDigs%10;
}else if(count == 3)
	sumABC= sumDigs/100 + (sumDigs/10)%10+(sumDigs%10);

if(sumABC==9){
	System.out.println("This number can be divide by 9!");
}
else {
	System.out.println("This num can't be divide by 9!");
}
}


}


