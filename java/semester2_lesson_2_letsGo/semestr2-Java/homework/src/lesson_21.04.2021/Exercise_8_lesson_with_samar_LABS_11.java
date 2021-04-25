import java.util.Scanner;
public class Exercise_8_lesson_with_samar_LABS_11 {
	public static void main(String[] args) {

		//#region What we gonna do?
        
		//#endregion

		Scanner sc=new Scanner(System.in);

        //parameters
            int n = 0,counterSerial=0,counterObjects=0,MaxCounterObjects=0,counterSequence=1,previosN=0,counterSeq=0;
        //Serial of numbers

        //first input
        n=sc.nextInt(); 
            //serial loop
        while(n!=-1){

            //After Each serial we need new counter for next serial so we do
            counterObjects=0;

            counterSequence=0;

            //numbers Objects loop
            while(n!=-1){

                

                //counter objects into serial
                counterObjects++;

                //we want to know which sequanse of equal objects  is a longest
                
                //checking the max sequance of equal objects in the serial
                if(previosN==n){
                counterSequence++;
                if(counterSeq<counterSequence){
                counterSeq = counterSequence;
                }
                }else{
                previosN = n;
                counterSequence=0;
                }


                //next number into serial
                n=sc.nextInt();
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

        System.out.println("The max lenght sequance is : "+ counterSeq);
    }
}