

import java.util.Scanner;
public class ex7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int  i = 0, counter = 0;
        do {
            if(i%2==0 && i%3==0){
                System.out.println(i);
                counter++;
            }
            i++;
        }
        while(counter<20);

	}
}
