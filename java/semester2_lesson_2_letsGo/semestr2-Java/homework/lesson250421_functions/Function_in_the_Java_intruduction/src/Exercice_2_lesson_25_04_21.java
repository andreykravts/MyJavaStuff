import java.util.Scanner;
public class Exercice_2_lesson_25_04_21 {
        public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

        //A
        System.out.println("Please enter a number that you want to x! : ");
        int num = 0;
        //check
        while(num<=0){
            num = sc.nextInt();
        }
        
        System.out.println(num5_1(num));

        //B
        System.out.println(Kelet());


        //C

        int n = Kelet();
        for(int i = 0; i<=n; i++){
            System.out.println(i+ " ! = "+azert(i));
        }
    }

    //B
    //5! = 1*2*3*4*5
    public static int Kelet(){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number that you want to x! : ");

        //check
        
        int x = sc.nextInt();
        while(x<=0){
            System.out.println("ERROR : please enter a valid number");
            x = sc.nextInt();
        }
        

        int num =1;
        for(int i=1; i<=x; i++){
        num*=i;
    }
    return num;

}
    //A
    public static int num5_1(int x){
        
        int num =1;
    for(int i=1; i<=x; i++){
        num*=i;
    }
    return num;

}


    public static int azert(int x){
        
        int num =1;
    for(int i=1; i<=x; i++){
        num*=i;
    }
    return num;


}
}

