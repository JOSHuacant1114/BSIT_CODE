import java.util.Scanner;

/**
 * JOSHUA_CANTORNE_
 */
public class JOSHUA_CANTORNE_ {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number:");
        int day = sc.nextInt();
        switch (day) {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
        }
        sc.close();
    }
}