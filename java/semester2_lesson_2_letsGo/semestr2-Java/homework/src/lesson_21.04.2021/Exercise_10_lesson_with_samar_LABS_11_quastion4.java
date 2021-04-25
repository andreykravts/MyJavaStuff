import java.util.Scanner;

public class Exercise_10_lesson_with_samar_LABS_11_quastion4 {
    public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

        int Grade = 0;
        int sumOfGrades=0;
        int count=0,count1=0;
        int numGrades=0;
        char ch;
        boolean flag = true;


        //new student with new grades
        while(flag){


        //input number of grades
        numGrades=sc.nextInt();

        // boolean flag = true;
        for(int i = 0; i <= numGrades; i++){

            if(i != numGrades){

            //input Grade of student
            Grade = sc.nextInt();

            //Sum of the grades
            sumOfGrades += Grade;

            //I want to know how much Grades is great than 80
            if(Grade>80){
                count++;
            }

                        //I want to know how much Grades is less than 55
            if(Grade<55){
                count1++;
            }

            
        

        }else{
            //to see result on the screen I want to use if statment

        //Avg of the grades
        System.out.println("Avg of the  grades is : "+(sumOfGrades/numGrades));

        //Grades is great than 80
        System.out.println("We have a "+count+" Grades is great than 80!");

                //Grades is less than 80
        System.out.println("We have a "+count1+" Grades is less than 55!");
        }

        }

        System.out.println("Do you want to continue with the new student? y/n ");
        switch(ch){
            case 'n':
            flag = false;
            break;
            case 'y':
            flag = true;
            break;
            default:
            System.out.println("Error");
            break;
        }

    }




    }
}
