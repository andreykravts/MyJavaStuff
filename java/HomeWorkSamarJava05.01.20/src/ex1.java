import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to HR team of Poalei Israel!");
		int Years, yearsExpirience;
		boolean Bagrut;
		
		System.out.println("Please enter your age.");
		Years = input.nextInt();
		
		if(Years > 20) {
		System.out.println("Do you have a Bagrut? (Please enter ( true or false)");
		Bagrut = input.nextBoolean();
			if(Bagrut) {
				System.out.println("How much experience years you have? ");
				yearsExpirience  = input.nextInt();
				if(yearsExpirience >= 3) {
					System.out.println("You are can be worker.");
				}else {
					System.out.println("Sorry. You are can't be worker.");
					}
			}else {
				System.out.println("You didnt have a bagrut, sorry we cant take that risk.");
				}
		}else {
			System.out.println("Sorry you are too young.");
			}
	}
}

