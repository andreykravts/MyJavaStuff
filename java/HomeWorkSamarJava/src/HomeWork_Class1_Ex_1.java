import java.util.Scanner;




public class HomeWork_Class1_Ex_1 {

	public static void main(String[] args) {
		/*
		 * System.out.println("Welcome to school deals calculator."
				+ "here you can calculate how much taxies is you need, how much can take a truma, and add information.");
		System.out.println("Please enter a number of piupls yo are have : ");
		Scanner input = new Scanner(System.in);
		int NumOfThePuiples = 0;
		int MoneyTaxiTruma = 200;
		int numOfTheTrailFULLTaxy = 0;
		final int capasityOfTheTaxi = 10;
		NumOfThePuiples = input.nextInt();
		numOfTheTrailFULLTaxy = NumOfThePuiples / capasityOfTheTaxi;
		System.out.println("The num of the full taxies, that school can bring is : " +numOfTheTrailFULLTaxy );
		int numOfThePiupslThatDidntGetInTheTaxi = NumOfThePuiples % capasityOfTheTaxi;
		System.out.println("Number of the piupls that standing without taxi is : "+ numOfThePiupslThatDidntGetInTheTaxi);
		int TrumaAboutFullTaxies = numOfTheTrailFULLTaxy * MoneyTaxiTruma;
		System.out.println( "The truma from gorem trumot is :"+TrumaAboutFullTaxies+ "Nis");
		*/
		//<_______________________________________________________________>
		//ex 2
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("Greatings!");
		System.out.println("Please enter a Num of Radius of the ball that you're choose : ");
		double Radius = input.nextDouble(); 
		System.out.println("Please enter a which Density ball is : ");
		double Densiti = input.nextDouble();
		double Weight; // need to be 0.00 like this
		
		//Weight = 4/3 * Pi * R * R * R * D
		 * 
		Weight = (4.0/3.0)* Math.PI*Math.pow(Radius, 3) * Densiti;
		double scale = Math.pow(10, 2);// 2 places here we do something like that:
		//places = 2 so 10*10=100 two zeros, two places.
		Weight = Math.round(Weight * scale)/scale; //here is something strange how
		//can we Multiply by something and devide after on that num.
		//actually we must have num that we have before but we didnt. 
		//that function just cut our num.
		System.out.println("The weight of the ball is : "+Weight);
		*/
		//<_______________________________________________________________>
		//ex 3
		/*
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to our app for score data of our new building project!");
		System.out.println("Please enter a num of Radiust and Height of future project: ");
		double Radius = input.nextDouble();
		System.out.println("Your Radius is : "+Radius);
		double Height = input.nextDouble();
		System.out.println("Your Height is : "+Height);
		double SquareOfBuilding = Math.PI*Math.pow(Radius, 2)*Height;
		System.out.println("Square of the building is : "+ SquareOfBuilding);
		//2
		final double HeightOfTheFloor = 3;//Height of the floor = 3 meters
		System.out.println("If we know that Height of the one floor is 3 meter how many floors we will have?");
		double NumOfFloors = (Height / 3)-((Height/3))%3;
		System.out.println("Number of the floors is : "+ NumOfFloors);
		double SomethingThatStaysAfterDivide = (Height/3)%3;
		//3
		System.out.println("Height that cant be useful for the building add floor is :"+SomethingThatStaysAfterDivide);
		final double hightofthesmallfloor = 2;
		double numOfTheSmallFloors = (SomethingThatStaysAfterDivide / hightofthesmallfloor)-(SomethingThatStaysAfterDivide / hightofthesmallfloor)%hightofthesmallfloor;
		System.out.println("Number of the small floors is : "+numOfTheSmallFloors);
		//4
		System.out.println("Price list for rent floors to 1 month is : normal floor = 30000nils, small floor = 10000nils;");
		System.out.println("What will be sum for rent all building per month?");
		double SumPaymentForAllFloors = (numOfTheSmallFloors*10000) + (NumOfFloors*30000);
		System.out.println("For rent all floors for one month in the building you need pay : "+SumPaymentForAllFloors+ "Nils");
		*/
		//<_______________________________________________________________>
				//ex 4
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("Are you stucking?");
		System.out.println("Lets try found your location!");
		System.out.println("Please check the door for the number of the room where you are staying at the moment!");
		int code = input.nextInt();
		System.out.println(code);
		int ab,c,de;
		//ab - num of the building
		//c - num of the floor in the that building
		//de - num of the room
		
		ab =((code/10)/10)/10; 
		System.out.println("Number of the building is : "+ ab);
		c = ((code/10)/10)%10;
		System.out.println("Number of the floor is : "+c);
		de = code%100;
		System.out.println("Number of the room is : "+de);
		*/
		//<_______________________________________________________________>
		//ex 5
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("Hey SpaceBoy!");
		System.out.println("How long you are here?!");
		System.out.println("Really? You watch is going only on the seconds?");
		System.out.println("Lets help you. Put here a result that your shity watchs is show : ");
		double time = input.nextInt();
		System.out.println("Your Time in the seconds is : "+time);
		double hours,min,sec;
		//hours - hours
		//min - minutes 
		//sec - seconds
		min = (time / 60); //all seconds to minutes
		sec = Math.round(((min%1)*600)/10); //there is seconds that create after sec -> min send that to total
		hours = Math.round((min / 60)); // here we devide min by 60 for total hours
		min = Math.round((((min / 60)%1)*600)/10); // here we take minuts that we have from min - > hours translate them to miutes for final
		 int hour = (int)Math.round(hours); //המראה
		 int mins = (int)Math.round(min); 
		 int secs = (int)Math.round(sec); 
		System.out.println(hour+":"+mins+":"+secs);
		System.out.println("Hours "+hours+"Minutes"+min+"Seconds"+ sec); // our total
		*/
	}
	
	
	
	
	
	
	
	
	// Or simple Weight = ((4/3 * Pi * R * R * R * D)*100)/100
	//lets try:
	//Weight = Math.round(((4.0/3.0)* Math.PI*Math.pow(Radius, 3) * Densiti)*100)/100;
	// no no way
	//method for ex 2
	/*
	//here we use method for round our num of Weight
	public static double roundAvoid(double value,int places) {//here is two inputs first about our value that we wants round of.
		//second value is the num  of the digits that we want to see in the end
		//I didnt get how, and why value and places can be create at the start of method but Im okay with it.
		double scale = Math.pow(10, places); // 2 places here we do something like that:
		//places = 2 so 10*10=100 two zeros, two places.
		return Math.round(value * scale)/scale; //here is something strange how can we Multiply by something and devide after on that num.
		//actually we must have num that we have before but we didnt. that function just cut our num.
	}*/

}
