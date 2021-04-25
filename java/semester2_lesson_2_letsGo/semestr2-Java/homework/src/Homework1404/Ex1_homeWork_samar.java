package Homework1404;


import java.util.Scanner;

import javax.swing.plaf.synth.Region;
public class Ex1_homeWork_samar {
	public static void main(String[] args) {

		//#region What we gonna do?

		/// here we want to do some kind loop that can get some numbers and send us difference between next number and priviously number
		//#endregion

		Scanner sc=new Scanner(System.in);

		//sum is the parametr that we use in the loop for prisent difference between privious nubmer and next number

		int num =0, privNumber=0,nextNumber=0, sum=0;			

		// here I used the do while loop for to limit our input by 10 numbers

			do{
				
				privNumber = nextNumber;
				nextNumber =sc.nextInt();
				
				//using of if statment is nessesary for positive or negative number. we need to make difference for each of them.

				//this statment work with positive numbers

				if(nextNumber>0 && nextNumber > privNumber){

					//this loop prisent us number which we need substract from nextNumber to get the privios nuber in the line

				for(int i=privNumber; i<nextNumber; i++){
					sum--;

				} //this statment work with negative numbers
				}else if(nextNumber>0 || nextNumber < privNumber){

					//this loop prisent us number which we need add to privios number to get the currentNumber(nextNumber) in the line

					for(int i=privNumber; i>nextNumber; i--){
					sum++;

				}
				}

				//print results for check
				System.out.println("Privious number : "+privNumber);
				System.out.println("sum : "+sum);
				
				//sum is must stay clean after itteration for next cycle
				sum=0;

				//move to next itteration
				num++;

			}while(num<=10);
	}
}
