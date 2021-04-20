import java.util.Scanner;

import javax.swing.plaf.synth.Region;

public class Ex2_homeWork_samar {
    public static void main(String[] args) {

		//#region What we gonna do?
        //the task is build some function that can check if a number can be divided only by this number or 1
        //#endregion

		Scanner sc =new Scanner(System.in);

        //#region the first part 

        //these parameters we use for input check
        double number = 0,divide=1;
        boolean flag = true;
        
        //
        while(flag == true){

            //first input
            number = sc.nextDouble();
            
            //we know that if divider will be great than number we cant get a result without digs after dot. so this loop work until divier's growing reach input number
            while(divide<number ){

                //this if statment check that number can be divide by divider. also divider cant be 1 or equal to "number".
                if(number%divide == 0 && divide!=number && divide!=1){

                    //if true lets move to next number to check
                    number = sc.nextDouble();
                    
                }
                else{

                    //if false add 1 to divider
                    divide++;
                    // just for check how it work
                    System.out.println(divide);

                }
            }
            //before we end a loop we need to check that number is divide by equal number and number is can be divide by 1(example num 0.5 can't)
            if(number%number == 0 && number%1==0){

                //turn flag to false and end a loop
                flag = false;

            }
        }

        System.out.println("A number "+number+ " is the first number");
        //#endregion the first part
        
    }
}
