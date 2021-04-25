

import java.util.Scanner;
public class ex8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int i = 0, counter = 0;
        boolean flag = true;
        char ch;
        do{
            System.out.println("please enter a char!");
            ch = sc.next().charAt(0);
            if(ch == 'W'){
                counter = i;
                System.out.println("we are have W here. His place is "+counter);
                flag = false;
            }
            i++;
        }
        while(i<25);
                if(flag)  
                System.out.println("W isnt here!");
            

	}
}
