import java.util.Scanner; 
public class quastion3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testGrade, semesterFinalTestGrade, finalSemesterGradeCource;
		System.out.println("Would you know your semester grade in our cource?");
		System.out.println("If so please enter at first your Bohan grade : ");
		testGrade = input.nextInt();
		System.out.println("At second please enter at your semester final test grade : ");
		semesterFinalTestGrade = input.nextInt();
		System.out.println("Let's see....");
		if(testGrade> semesterFinalTestGrade)
		{
			finalSemesterGradeCource = ((testGrade*15)+(semesterFinalTestGrade*85))/100;
		}
		else {
			finalSemesterGradeCource = semesterFinalTestGrade;
		}
		if(semesterFinalTestGrade > 55)
			System.out.println("Yeah you did it!");
			else 
			System.out.println("Sorry, you failed.");
		}
}