

package semester2_lesson_2_letsGo;
import java.util.Scanner;
public class nextto3_class {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x, y,count=0;
		System.out.println("num of boys : ");
		x=sc.nextInt();
		System.out.println("num of girls : ");
		y=sc.nextInt();
		
		while(x != -1 || y!=-1) {
			
			System.out.println("Number of the children in the famaly"+(x+y));
		
		System.out.println("num of boys : ");
		x=sc.nextInt();
		System.out.println("num of girls : ");
		y=sc.nextInt();
		
		if(x==y)
			count++;
		}
			System.out.println("Number of familys there number of boys and girls same: "+count);
		
	}

}
