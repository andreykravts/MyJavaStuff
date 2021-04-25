import java.util.Scanner;
public class Exercise_9_lesson_with_samar_LABS_11 {
	public static void main(String[] args) {

		//#region What we gonna do?


        // int n=1, counter = 0,max=0, priviousNum=0,serialCounter=0,counterObjects=0,PriviuosCounterObjects=0,MaxSerial=0,PriviousMax=0;
        
        // n=sc.nextInt();
        // while(n!=-2){
        //     counter=0;

        //             while(n!=-2)
        //             {
        //             n=sc.nextInt();
                        
        //                 //סופר איברים תוך סדרה
        //                 counterObjects++;

        //                 //עושה סינון לרצף הכי ארוך
        //                 if(priviousNum==n){
        //                     counter++;
        //                 }else{
        //                     priviousNum=n;
        //                 }
        //             }
        //             //גודל סדרה הכי גדולה
        //         if(PriviuosCounterObjects<counterObjects){
        //             PriviuosCounterObjects=counterObjects;
        //             MaxSerial=counterObjects;
        //         }

        //         //מספרים חוזרים על עצמם
        //     if(counter>max)
        //     max=counter;
            
        //     if(max>PriviousMax){
        //         PriviousMax = max;
        //     }


        //         System.out.println("הרצף הכי גדול בסדרה"+max+" מספר סדרה "+serialCounter);
            
        //     n=sc.nextInt();
        //     //מספר סדרה
        //     serialCounter++;
        // }
        // System.out.println("Serial is : "+max);

        
		//#endregion

		Scanner sc=new Scanner(System.in);



        //parameters
            int n = 0,counterSerial=0,counterObjects=0,MaxCounterObjects=0,counterSequence=1,previosN=0,counterSeq=0,MAXcounterSeq=0;
        //Serial of numbers

        //first input
        n=sc.nextInt(); 
            //serial loop
        while(n!=-2){

            //After Each serial we need new counter for next serial so we do
            counterObjects=0;
            counterSequence=1;
            /*** */
            counterSeq=0;

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

            //we want to know which serial have a max lenght of (sequnce of equal numbers)

            if(MAXcounterSeq<counterSeq)
            MAXcounterSeq = counterSeq;
            


            //count max imum object in serial
            if(counterObjects>MaxCounterObjects){
                MaxCounterObjects=counterObjects;
            }



            //here we dicide if we want to start new serial or quit
        n=sc.nextInt();


        System.out.println("Number of serial is "+counterSerial+" The max number of \"sequance of equal objects\" is : "+counterSeq );

            //counter which write a number of the serial
        counterSerial++;
        }
        System.out.println("total serials : "+ counterSerial+"\n");

        System.out.println("The max number of objects in one serial is : "+ MaxCounterObjects+"\n");

        // System.out.println("The max lenght sequance is : "+ counterSeq+"\n");

        System.out.println("The maximum lenght of the \"sequance of equal object\" per each serial is : "+MAXcounterSeq+"\n");



        System.out.println("Number of serial is "+counterSerial+" The max number of \"sequance of equal objects\" is : "+counterSeq );
    }
}