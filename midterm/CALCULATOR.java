import java.util.Scanner;

public class CALCULATOR {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        System.out.println("Enter first number:");
        num1 = sc.nextDouble();
        System.out.println("Enter second number:");
        num2 = sc.nextDouble();
         System.out.println("Select operation:");
         System.out.println("1.Addition(+)");         
         System.out.println("2. Subtraction (-)");
         System.out.println("3. Multiplication(*)");
         System.out.println("4. Division(/)");
         System.out.println("Enter your choice:");
         int choice = sc.nextInt();
         switch(choice) {
            case 1:
        System.out.println("Result:" + (num1 + num2));
            break;
            case 2:
        System.out.println("Result: " + (num1 - num2));
            break;
            case 3:
        System.out.println("Result:" + (num1 * num2));
            break;
            case 4:
                if (num2 != 0){
                    System.out.println("Result:" + (num1 / num2));
                }else {
                    System.out.println("Error: Division by zero");
                }break;
            default:
                    System.out.println("Invalid choice");
                    sc.close();
        }
    }
}
