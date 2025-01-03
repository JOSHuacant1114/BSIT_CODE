import java.util.Scanner;

public class CANTORNE_ACTIVITY_VIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name");
        String name = sc.nextLine();
        System.out.println("How old are you");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("What is your favorite food");
        String food = sc.nextLine();
        
        System.out.println("hello: " +name);
        System.out.println("You are: " + age + " Years old");
        System.out.println("You like: " +food);
        sc.close();
    }
}


