import java.util.Scanner;
 
/**
 * EXERCISE
 */
public class EXERCISE {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number <= 10: ");
        int x = sc.nextInt();
        
        while (x <=10) {
            System.out.println(x);
            x+=2;
            
        }
        System.out.println(x);
        sc.close();

    }
}