import java.util.Scanner; 

public class ex5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a,b,c;
		
		System.out.println("A?");
		a = input.nextInt();
		System.out.println("B?");
		b = input.nextInt();
		System.out.println("C?");
		c = input.nextInt();
		double delta = b*b-4*a*c;
		
		if(a==0) {
			// bx+c=0
			if(b!=0 && c!=0)
			{
				double x = -c/b;
				System.out.println("X = " + x);
			}
			else if(b==0 && c == 0) 
			{
				System.out.println("x = all results");
			}
			else 
			{
				System.out.println("x = didnt have right way");
			}
		}	
		else //a!=0
		{
		if(delta>0) 
		{
			System.out.println("x1 = "+((-b+Math.sqrt(delta))/2*a));
			System.out.println("x2 = "+((-b-Math.sqrt(delta))/2*a));
		}
	}
		
		
						if(b==0) 
						{
							
							if(a!=0 && delta > 0)
							{
								System.out.println("x1 = "+((-b+Math.sqrt(delta))/2*a));
								System.out.println("x2 = "+((-b-Math.sqrt(delta))/2*a));
							}
							else
								System.out.println("Math error");
						}
						else// b!=0
						{
							if(delta > 0 && a != 0)
								 System.out.println(" x = "+(Math.sqrt(delta)/(2*a))+"Only one answer");
						}
								if(c==0) 
												{
													
													if(delta>0) 
													{
														System.out.println("x1 = "+((-b+Math.sqrt(delta))/2*a));
														System.out.println("x2 = "+((-b-Math.sqrt(delta))/2*a));
													}
													else 
													{
														System.out.println("Math error");
													}
												}
												else // c!=0	
														{
														if(delta>0) 
														{
															System.out.println("x1 = "+((-b+Math.sqrt(delta))/2*a));
															System.out.println("x2 = "+((-b-Math.sqrt(delta))/2*a));
														}
													}
											
			
					
			

		
		
	}
}