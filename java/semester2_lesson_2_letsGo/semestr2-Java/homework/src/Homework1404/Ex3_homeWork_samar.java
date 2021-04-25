package Homework1404;
import java.util.Scanner;

import javax.swing.plaf.synth.Region;

public class Ex3_homeWork_samar {
        public static void main(String[] args) {

		//#region What we gonna do?
        
        //#endregion

		Scanner sc =new Scanner(System.in);

        //parameters
        int i = 0, counter=0, counter2=0, counter3=0;
        double Dollars = 0, sum = 0, avg = 0, Dmax=0,Dmin=0;

        System.out.println("Please enter a prices of 20 products : \n (PLEASE USE $ USA) \n Thank You!");

        while(i<20){

        Dollars = sc.nextDouble();
        
        //total price for 20 products
        sum+=Dollars;

        //the most expensive product and num on of input, iteration that it has

        if(Dmax<Dollars){
        Dmax = Dollars;
        counter = i;
        if(Dmin>Dmax){
        Dmin = Dmax;
        }
    }
    //num of products that price is more than 100 dollars
    if(Dollars>100){
        
        counter2++;
        
        }

        //num of products that price is more than 50 dollars but less than 60
        if(Dollars<=60 && Dollars >=50) {
        
        counter3++;
        
        }

        //next iteration
        i++;

        }
        //Average to single product 
        avg=sum/20;
        System.out.println("The average to single product "+avg);

        //A sum of all things that you gonna by
        System.out.println("A sum of all things that you gonna by :"+sum +"$ " +"US");
        
        //print the most expensive product and number of iteration
        System.out.println("the most expensive product : "+Dmax+" $  USA "+ " number of iteration is "+counter);
        
        //num of products that price is more than 100 dollars
        System.out.println("num of products that price is more than 100 dollars is : " + counter2 );

        //num of products that price is more than 50 dollars but less than 60

        System.out.println("Number of products that price is more than 50 dollars but less than 60 is : "+ counter3);
    }
}
