package lesson;
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i<=3;i++)//outside
		{
			for(int j = 1; j<= 3; j++)// inside
			{
				System.out.print('*'); //in line
			}
			System.out.println();//new line
		}
	}

}
