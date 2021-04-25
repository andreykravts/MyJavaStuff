import java.util.Scanner;
public class Exercise_7_lesson_with_samar_LABS_11 {
	public static void main(String[] args) {

		//#region What we gonna do?
        // int n=1, counter = 0,max=0;
        // boolean flag = true;
        // n=sc.nextInt();
        // while(n!=0){
        //     counter=0;
        //             while(n!=0)
        //             {
        //             n=sc.nextInt();
        //             counter++;
        //             }
        //     if(counter>max)
        //     max=counter;

            
        //     n=sc.nextInt();
        // }
		//#endregion

		Scanner sc=new Scanner(System.in);

        int n = 0,counterSerial=0,counterObjects=0,MaxCounterObjects=0;
        //Serial of numbers

        //first input
        n=sc.nextInt(); 
            //serial loop
        while(n!=0){

            //After Each serial we need new counter for next serial so we do
            counterObjects=0;


            //numbers Objects loop
            while(n!=0){

                //next number into serial
                n=sc.nextInt();

                //counter objects into serial
                counterObjects++;

            }

            if(counterObjects>MaxCounterObjects){
                MaxCounterObjects=counterObjects;
            }



            //here we dicide if we want to start new serial or quit
        n=sc.nextInt();

            //counter which write a number of the serial
        counterSerial++;
        }
        System.out.println("total serials : "+ counterSerial);

        System.out.println("The max number of objects in one serial is : "+ MaxCounterObjects);



        

        
        
    }
}
