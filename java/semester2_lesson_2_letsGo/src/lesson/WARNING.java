package lesson;
import java.util.Scanner;
public class WARNING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			sc.useDelimiter("");
			char ch;
			int num=0, sum=0;
			do {
				ch=sc.next().charAt(0);
				if(ch>='0' && ch<='9')
					num=num*10+ch-'0';
				else if(ch=='+'||ch=='=')
				{
					sum+=num;
					num=0;
				}
			}while(ch!='=');
			System.out.println(sum);
	}

}
