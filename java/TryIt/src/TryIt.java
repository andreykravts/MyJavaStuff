import java.math.BigDecimal;
import java.util.Scanner;


public class TryIt {
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    int result = sum(2);
    System.out.println(result);
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}

