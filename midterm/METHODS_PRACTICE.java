import java.util.Scanner;

public class METHODS_PRACTICE {

    public static void main(String [] args){
        timer();
    }
    static void timer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int num = sc.nextInt();

        while(num>=0){
            System.out.println(num);
            num--;
            
        }
    }
}