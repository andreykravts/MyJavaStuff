
import java.util.Scanner;

import javax.swing.plaf.synth.Region;
public class Exercise_3_lesson_with_samar {
	public static void main(String[] args) {

		//#region What we gonna do?

		/// 
		//#endregion

		Scanner sc=new Scanner(System.in);

        int NumHospitals, numPatients, days,avg,TotalNumPatients=0,count=0;

        

            System.out.println("amount of sick persons per 7 days per hospital");
            for(NumHospitals = 1; NumHospitals<6; NumHospitals++){

            
                for(days = 1; days<7; days++){
            numPatients = sc.nextInt();
            TotalNumPatients +=numPatients;

            }

            avg=TotalNumPatients/7;
            System.out.println("avg "+avg);

            if(avg<100){
                count++;
            }
            System.out.println("amount ... < 100 = "+count);
        }
    }
}