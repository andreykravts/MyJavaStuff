package lesson;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int i =1;
		while(true) {
			System.out.println('a');
			i++;
			if(i==3)
				break; // stop
		}
		System.out.println("bye");*/
		
		int i =1;
		while(i<5) {
			System.out.println('a');
			i++;
			if(i==3)
				continue;
			System.out.println("b");// stop
		}
		System.out.println("bye");
	}

}
