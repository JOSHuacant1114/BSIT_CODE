import java.util.Scanner;

public class CANTORNE_ACTIVITY_VIIII {

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        if(age <= 0){
            System.out.println("Error");
        }else if(age <= 16){
            System.out.println("Too Young");
        }else if(age < 100){
            System.out.println("Welcome!");
        }else{
            System.out.println("Really?");
            sc.close();
        }
    }
}
