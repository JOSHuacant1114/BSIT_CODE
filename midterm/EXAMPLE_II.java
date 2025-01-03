import java.util.Scanner;

public class EXAMPLE_II {

    public static void main(String [] args){
        Scanner sc = new Scanner( System.in);
        String name = "";

        while(name.isBlank()){
            System.out.println("Enter your name: ");
            name = sc.nextLine();

        }
        System.out.println("hello " + name);
        sc.close();
    }
}
