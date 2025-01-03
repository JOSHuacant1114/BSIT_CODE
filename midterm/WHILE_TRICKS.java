import java.util.Scanner;

public class WHILE_TRICKS {
    public static void main(String[] args) {
        while(true){
            System.out.println("1. food ");
            System.out.println("2. transportation");
            System.out.println("enter choice");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                System.out.println("humba");
                System.out.println("kaldiritas");
                System.out.println("pakbet");
                break;
                case 2:
                System.out.println("bus");
                System.out.println("taxi");
                System.out.println("tricycle");
                break;
                default:
                System.out.println("invalid");
            }
        }
    }
    
}