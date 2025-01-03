import java.util.Scanner;

public class PRACTICE {

    static boolean check (int grade){
        if(grade >=75) {
            return true;
        }else {
            return false;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        int x = sc.nextInt();
        if(check (x) ==true){
            System.out.println("congrats!");
        }else{
            System.out.println("Failed");
        }
        sc.close();
    }
}
