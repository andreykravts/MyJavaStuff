

import java.util.Scanner;

import javax.swing.plaf.synth.Region;
public class Exercise_2_lesson_with_samar {
	public static void main(String[] args) {

		//#region What we gonna do?

		/// 
		//#endregion

		Scanner sc=new Scanner(System.in);

        float sum, grade, avg, min=0, mini=0;

        for(int stud = 1; stud<=40; stud++){
            System.out.println("Enter 6 grades from students");
            sum = 0;
            for(int i = 1; i<6;i++){
                grade = sc.nextFloat();
                sum+=grade;
            }
            avg = sum/6;
            System.out.println("stud "+stud+ "the avrage is "+avg);

            if(avg<min){
                min = avg;
                mini = stud;
            }
        }
        System.out.println("the min average is "+min+" to student "+stud);
    }
}