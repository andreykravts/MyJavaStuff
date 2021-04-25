import java.util.Scanner;
public class Exercise_6_lesson_with_samar {
	public static void main(String[] args) {

		//#region What we gonna do?

		//#endregion

		Scanner sc=new Scanner(System.in);

        int n = 1;
        int divide = 1;
        boolean flag;

        for(n =1; n<=3000; n++){
            flag= true;

            for(divide = 2; divide<n/2 && flag;divide++)
            if(n/divide==0)

            flag = false;
            
            if(flag)
            System.out.println("the number "+n+" is prime!");

        }
        
    }
}
