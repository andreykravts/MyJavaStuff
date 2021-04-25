

import java.util.Scanner;
public class ex4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int num = 0, i = 0, mark = 0, avg = 0;
        System.out.println("Please enter a number of the students in room.");
        num = sc.nextInt();
        while(i<num)
        {
        System.out.println("Please enter a grade of student number "+i);
        mark = sc.nextInt();
        avg+=mark;
        i++;
        }
        System.out.println("Avg of grades in the class is : "+(avg/num));
	}
}
