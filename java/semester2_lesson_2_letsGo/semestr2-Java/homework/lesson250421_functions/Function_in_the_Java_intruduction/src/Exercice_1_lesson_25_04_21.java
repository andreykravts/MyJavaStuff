
import java.util.Scanner;

public class Exercice_1_lesson_25_04_21 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
            
    //num%2==0
            System.out.println(A(17));
      //max num
            System.out.println("The max is : "+Fmax(5,9));
      //min num
            System.out.println("The min is : "+Fmax(5,9));
      //max wuth 3 parametrs 
      System.out.println(Fmax3num(1,2,3));

      //
      System.out.println("the middle is : "+Middle3num(2,5,8));
        }

        public static boolean A(int num){
          if(num%2==0)
          return true;
          else// actually not need else
          return false;
        }

        public static int Fmax(int a, int b){
          if(a>b){
            return a;
          }else{
            return b;
          }
        }

                  public static int Fmin(int x, int y){
          if(x<y){
            return x;
          }else{
            return y;}
          }

                  public static int Fmax3num(int x, int y, int z){
                    //  return Fmax(x,Fmax(y,z)); // 1 line
                    int num = Fmax(x,y);
                    num = Fmax(z,num);
                    return num;

        }



        
        public static int Middle3num(int x, int y, int z){
          int max = Fmax3num(x,y,z);
          int min = Fmin(z,Fmin(x,y));

          return (x+y+z)- (min+max);
        }

}
