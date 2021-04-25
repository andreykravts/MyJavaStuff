import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int FirstTime = input.nextInt();//seconds
		int SecondTime = input.nextInt();//seconds
		int ThreeTime = input.nextInt();//seconds
		//second place
		int mathMid = 0;
		//messages
		String messageForMid= null , messageForMax = null , messageForMin= null ;
		
		
		//Min result 
		int mathMin = Math.min(FirstTime, SecondTime);
		mathMin = Math.min(mathMin, ThreeTime);
		//Max result
		int mathMax = Math.max(FirstTime, SecondTime);
		mathMax = Math.max(mathMax, ThreeTime);
		//MAthMid message box
		if(mathMin != FirstTime && mathMin != FirstTime) {
			mathMid = FirstTime;
			messageForMid = "FirstTime";
		}else if(mathMin != SecondTime && mathMin != SecondTime ) {
			mathMid = SecondTime;
			messageForMid = "SecondTime";
		}else if(mathMin != ThreeTime && mathMin != ThreeTime ) {
			mathMid = ThreeTime;
			messageForMid = "TherdTime";
		}
		//Math max message box
		if(mathMax == FirstTime) {
			messageForMax = "FirstTime";
		} else if(mathMax == SecondTime) {
			
			messageForMax = "SecondTime";
		}else if(mathMax == ThreeTime ) {
			
			messageForMax = "TherdTime";}
		
		//Math min message box
		if(mathMin == FirstTime) {
			messageForMin = "FirstTime";
		} else if(mathMin == SecondTime) {
			messageForMin = "SecondTime";
		}else if(mathMin == ThreeTime ) {
			messageForMin = "TherdTime";
			}
		//final message
		System.out.println("Best result is : "+mathMin+" " + messageForMin +" " +"Midle result is : "+ mathMid+" " + messageForMid +" " +"Worst result is : "+ mathMax+" " + messageForMax +" " );
		}
	}
