import java.util.Scanner; 
public class quastion2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int GraduationYears;
		double AvgExaminationGrade;
		
		System.out.println("Welcome to course of Pilot License!");
		System.out.println("We need to checkout your ability for taking our cource.");
		System.out.println("Please enter your Graduate years : ");
		GraduationYears = input.nextInt();
		System.out.println("Please enter your AVG examination grade : ");
		AvgExaminationGrade = input.nextDouble();
		if(GraduationYears > 15)
			System.out.println("Congratulations! You can apply this cource!");
		else if(GraduationYears < 15 && GraduationYears >= 12 && AvgExaminationGrade > 95)
			System.out.println("Congratulations! You can apply this cource!");
		else System.out.println("Sorry we cant let you in, our cource required higher qualification than your. Try next time, please!");
		
	}
	}