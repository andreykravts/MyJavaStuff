import java.util.Scanner;
public class Exercise_5_lesson_with_samar {
    
	public static void main(String[] args) {

		//#region What we gonna do?
        ///*
        //**
        //***
		/// 
		//#endregion

		Scanner sc=new Scanner(System.in);

        System.out.println(" ");

        int n =sc.nextInt();

        // for(int i = 0; i<=n; i++){ // line

        //     for(int j = 0; j<=i; j++) //row
        //     System.out.print(" * ");

        //     System.out.println();
            

        // }
            // ****
            // ***
            // **
            // *

            // for(int i = n; i>=1; i--){ // line

            // for(int j = 1; j<=i; j++) //row
            // System.out.print(" * ");

            // System.out.println();
            
                //  *
                // **

            // for(int i = 1; i<=n; i++){ // line

            // for(int j = 1; j<=n-i; j++)
            // System.out.print(" ");

            // for(int j = 1; j<=i; j++) //row
            //     System.out.print("*");
            // System.out.println();

                // number tringle

            // for(int i = 1; i<=n; i++){ // line

            // for(int j = 1; j<=i; j++) //row
            // System.out.print(j);

            // System.out.println();



            //

            for(int i = 1; i<=n; i++){ // line

            for(int j = 1; j<=n-i; j++)
            System.out.print(" ");

            for(int j = 1; j<=2*i; j++) //row
            System.out.print("*");

            System.out.println();
        }
    }

}
