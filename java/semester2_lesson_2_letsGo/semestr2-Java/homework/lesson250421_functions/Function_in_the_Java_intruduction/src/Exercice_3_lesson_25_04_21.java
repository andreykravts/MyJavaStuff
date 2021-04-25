import java.util.Scanner;
public class Exercice_3_lesson_25_04_21 {
            public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

                System.out.println(numFunc(123456));
            }

            //func
            public static int numFunc(int n){

                int res = 0;
                while(n!=0){
                    res+=n%10;
                    n/=10;
                }

                return res;
            }
}
