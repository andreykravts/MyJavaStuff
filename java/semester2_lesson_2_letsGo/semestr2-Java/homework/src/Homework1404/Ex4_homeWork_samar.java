package Homework1404;
import java.util.Scanner;


public class Ex4_homeWork_samar {
    
        public static void main(String[] args) {

		//#region What we gonna do?
        
        //#endregion

		Scanner sc =new Scanner(System.in);

        //parametrs
        int x = 0, y = 0, counter1=0, counter2=0, Refresh=0, previousRefresh=0,RefreshMax=0;

        
        System.out.println("Please enter x and after y 20 times each!");

        for(int i = 0; i<20;i++){

        //input pair of number for 20 times

        //input
        System.out.println("Enter a x: ");
        x=sc.nextInt();
        System.out.println("Enter a y: ");
        y=sc.nextInt();

        //number of "pairs" of numbers that have a x equal y
        if(x == y){
        counter1++;
        }else{

            //here we need to find what a max x or y in each pair, and the differense (number) between two numbers x and y in each pair!

            //statment to find refresh between x and y
            Refresh= x-y;

            if(x>y){

            System.out.println("X is greater than Y on this pair! "+ "x= "+x+" y= "+y+ " Refresh is : "+ Refresh +"\n");

        }else{

            //print
            System.out.println("Y is greater than X on this pair! "+ "x= "+x+" y=  "+y+ " Refresh is : "+ Refresh  +"\n");
            
        }

            //here we use if statment to find maximum refresh between x and y
            if(Refresh>previousRefresh){
                RefreshMax=Refresh;
                previousRefresh = Refresh;
                counter2 = i;
            }else{
                RefreshMax= previousRefresh;
            }
            
        }

        }

        //number of "pairs" of numbers that have a x equal y
        System.out.println("number of pairs of numbers that have a x equal y is : "+counter1+"\n"+"\n");

        //print the Max refresh between x and y
        System.out.println("the max refresh equal to : "+RefreshMax+ " "+"Number of iteration is : "+counter2+"\n"+"\n");

        }
}
