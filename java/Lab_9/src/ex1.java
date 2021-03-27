import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		//with break --------------------------------------------------------------
//		System.out.println ("Enter a number between 1 and 3");
//		int i = input.nextInt();
//		switch (i)
//		 {
//		case 1: System.out.println (1);
//		break;
//		case 2: System.out.println (2);
//		break;
//		case 3: System.out.println (3);
//		 }
////-------------------------------------------------------------------------
//		System.out.println ("character ");
//		char cc=input.next().charAt(0);
//		switch (cc)
//		
//		 {
//		case '1':
//		case '2':
//		case '3': System.out.println ("3 is entered\n");
//		case '4':
//		case '5': System.out.println ("the %c case\n"+cc);
//		break;
//		case 'n': System.out.println ("the "+ cc+" case");
//		case 'y': System.out.println ("the "+ cc+" case");
//		break;
//		case '?': System.out.println ("the "+ cc+" case");
//		break;
//		default : System.out.println ("the default case");
//		 }
//		
////-----------------------------------------------------------------------------
//	System.out.println ("Enter a number between 1 and 4");
//	 i = input.nextInt();
//	switch (i)
//	{
//	case 1:
//	System.out.println ("this will print only if 1 is entered");
//	case 2:
//	System.out.println ("this will print if either 1 or 2 is entered");
//	System.out.println ("because there is no break after case 1");
//	case 3:
//
//	System.out.println ("this will print for 1,2 or 3 entered");
//	System.out.println ("because there is no break after 1 or 2");
//	System.out.println ("1, 2 or 3, because we have a break after this");
//	break;
//	case 4:
//	System.out.println (" this will print only for a 4 entered");
//	System.out.println (" because we end with a break here");
//	break;
//	default:
//	System.out.println (" this will print for any entry except 1,2,3 or 4");
//	}
//	}
//	}
//TASK A withnout break --------------------------------------------------------------
//System.out.println ("Enter a number between 1 and 3");
//int i = input.nextInt();
//switch (i)
// {
//case 1: System.out.println (1);
//
//case 2: System.out.println (2);
//
//case 3: System.out.println (3);
// }
////-------------------------------------------------------------------------
//System.out.println ("character ");
//char cc=input.next().charAt(0);
//switch (cc)
//
// {
//case '1':
//case '2':
//case '3': System.out.println ("3 is entered\n");
//case '4':
//case '5': System.out.println ("the %c case\n"+cc);
//
//case 'n': System.out.println ("the "+ cc+" case");
//case 'y': System.out.println ("the "+ cc+" case");
//
//case '?': System.out.println ("the "+ cc+" case");
//
//default : System.out.println ("the default case");
// }
//
////-----------------------------------------------------------------------------
//System.out.println ("Enter a number between 1 and 4");
//i = input.nextInt();
//switch (i)
//{
//case 1:
//System.out.println ("this will print only if 1 is entered");
//case 2:
//System.out.println ("this will print if either 1 or 2 is entered");
//System.out.println ("because there is no break after case 1");
//case 3:
//
//System.out.println ("this will print for 1,2 or 3 entered");
//System.out.println ("because there is no break after 1 or 2");
//System.out.println ("1, 2 or 3, because we have a break after this");
//
//case 4:
//System.out.println (" this will print only for a 4 entered");
//System.out.println (" because we end with a break here");
//
//default:
//System.out.println (" this will print for any entry except 1,2,3 or 4");
//}
		//TASK B if verse----------------------------------------------------------------
		//---------------------------------------------------------------------------
		System.out.println ("Enter a number between 1 and 3");
		int i = input.nextInt();
		if(i == 1){System.out.println (1);}
		else if(i == 2){System.out.println (2);}
		else if(i == 3){System.out.println (3);}
		else{System.out.println("Nothing");}
	//--------------------------------------------------------------------------
		System.out.println ("character ");
		char cc = input.next().charAt(0);
		if(cc%2 == 0 || cc%cc == 0)
		{
			
			System.out.println ("3 is entered\n");
			 System.out.println ("the %c case\n"+cc);
			
		}else{
			if(cc == 'n') {
				System.out.println ("the "+ cc+" case");
				System.out.println ("the "+ cc+" case");
			}else if (cc == 'y') {
			 System.out.println ("the "+ cc+" case");
			}else if(cc == '?') {
				System.out.println ("the "+ cc+" case");
				}else {System.out.println ("the default case");}
		}
		//--------------------------------------------------------------------
		System.out.println ("Enter a number between 1 and 4");
		i = input.nextInt();
		if(i==1) {
			System.out.println ("this will print only if 1 is entered");
			System.out.println ("this will print if either 1 or 2 is entered");
			System.out.println ("because there is no break after case 1");
			System.out.println ("this will print for 1,2 or 3 entered");
			System.out.println ("because there is no break after 1 or 2");
			System.out.println ("1, 2 or 3, because we have a break after this");
		}else if (i == 2) {
			System.out.println ("this will print if either 1 or 2 is entered");
			System.out.println ("because there is no break after case 1");
			System.out.println ("this will print for 1,2 or 3 entered");
			System.out.println ("because there is no break after 1 or 2");
			System.out.println ("1, 2 or 3, because we have a break after this");
		}else if(i == 3) {
			System.out.println ("this will print for 1,2 or 3 entered");
			System.out.println ("because there is no break after 1 or 2");
			System.out.println ("1, 2 or 3, because we have a break after this");
		}else if(i == 4) {
			System.out.println (" this will print only for a 4 entered");
			System.out.println (" because we end with a break here");
		}else {
			System.out.println (" this will print for any entry except 1,2,3 or 4");
			}
		
	
		
		
	}
}

