
import java.util.Scanner;
public class checkadd {
	public static void main(String[] args){
		int i, j, k=8, p=3;
	double x, y = 0;
	char c;
	boolean b1,b2;
	j = ((i = 1) < (p = 4)) ? 7 * i + p : i - 7 * p;
	b1= (j < i + 5) && (k=56)>3 ;
	System.out.println(k);
	c = (char) ((i++) * (k--) +10);
	System.out.println("p="+p--+" i="+i+" j="+ ++j +" c="+c + (!b1 ?
	"yes!!!" : "no!!!" ));
	b1 = ('r'-'R' == 'f'-'F') || (14 <= -86);
	x = 2.5 - 33 % 4 * p++ ;
	j = 5; k = 2;
	i = ((p *= 7) % 2 > 0 && (y=++x) < 6) ? j : k-1;
	b2 = i <= j && j <= k;
	System.out.println("p="+p+" i="+i+" x="+ x++ +" y="+(int) y+"b1="+b1+" b2="+b2);
	//שהקלט נניח bgthuuai//
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a chars:");
	i=k=p=j=0;
	while(i < 8)
	{ c =sc.next().charAt(0);
	switch (c)
	{ case 'a' :
	case 'u' :
	case 'e' :
	case 'i' :
	case 'o' : p++;
	break;
	default: if(c >='A' && c <='Z' )
	k++;
	else
	j++;
	}
	System.out.println((c >='a' && c <='z')? c: '\n');
	 i++;
	}
	System.out.println("p ="+p+" k="+k+ " j="+j);
	}}

