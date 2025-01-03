import java.util.Scanner;

public class CANTORNE_JOSHUA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                intro();
                break;
        
            default:
                break;
        }
    }public static void intro(){
        Scanner sc = new Scanner(System.in);
        String [] junkfoods = {"0.piatos","1.cracklings","2.nova","3.fish crackers","4.patata","5.rainbee","6.boogyman", "7.tattos", "8.roller coaster"};
        for(int i =0; i<junkfoods.length; i++){
            System.out.println(junkfoods[i]);
        }
        System.out.println("enter number");
        int choice = sc.nextInt();
        System.out.println(junkfoods[choice]);
    }
}