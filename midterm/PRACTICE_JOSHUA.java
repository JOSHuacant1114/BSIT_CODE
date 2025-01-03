import java.util.Scanner;

/**
 * PRACTICE_JOSHUA
 */
public class PRACTICE_JOSHUA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println("Welcome: " +name);
        System.out.println("Age: " +age);
        sc.close();
    }
}