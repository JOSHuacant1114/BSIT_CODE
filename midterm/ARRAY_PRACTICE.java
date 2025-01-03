import java.util.Scanner;

public class ARRAY_PRACTICE {

    public static void main(String[] args) {
        payment();
    }static void payment(){
        String [] food = new String [3];
        food [0] = "Fish Cracker";
        food [1] = "Piatos";
        food [2] = "Nova";
        int [] price = new int [3];
        price [0] = 10;
        price [1] = 16;
        price [2] = 15;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int price1 = sc.nextInt();
        System.out.println("enter number");
        int price2 = sc.nextInt();
        System.out.println("enter number");
        int price3 = sc.nextInt();

        int total = price[price1]*= price2;
        int total1 = total+=price[price3];
        System.out.println( price2 + " " + food[price1] + " , "  + price3 + " " +food[price3] + " = " + total1);
    }
}