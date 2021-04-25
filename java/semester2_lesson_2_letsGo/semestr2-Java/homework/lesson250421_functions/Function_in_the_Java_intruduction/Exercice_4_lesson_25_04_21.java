import java.util.Scanner;
public class Exercice_4_lesson_25_04_21 {
            public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

                System.out.println("please enter a positive number");
                int num =0;
                num = sc.nextInt();
                while(num<0){
                    System.out.println("error try again positive number");
                    num = sc.nextInt();
                }
                System.out.println("please enter a digit between 1 to 9");
                int d =0;
                d= sc.nextInt();
                while(d<0 || d>9){
                    System.out.println("error try again between 1 to 9");
                    d = sc.nextInt();
                }

                for(int i = 0; i<=100; i++){
                    if(digits(num, d)){
                    System.out.println(digits(num, d));
                    System.out.println(i+ " ");}
                }
                
            }

            //func
            public static boolean digit(int n, int dig){
                
                int res = 0;
                while(n!=0){

                    res+=n%10;
                    if(dig == n%10){

                    return true;

                    }
                    n/=10;
                }
                return false;
            
                
            }

                        //func2
            public static boolean digits(int n, int dig){
            return digit(n,dig) && digit((int)(Math.pow(n, 2)),dig) && digit((int)(Math.pow(n, 3)),dig)  ;
            }

            //func3


}
