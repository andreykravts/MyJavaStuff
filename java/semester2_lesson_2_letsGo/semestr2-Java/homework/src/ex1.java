

import java.util.Scanner;
public class ex1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
            int up = 0; int down =10;
            while(++up<10 || --down >0)
            System.out.println(up + " " + down);
	}
}
