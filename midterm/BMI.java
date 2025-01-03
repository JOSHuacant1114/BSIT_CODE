import java.util.Scanner;

public class BMI {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms: ");
        // exact weight
        double weight = sc.nextDouble();
        System.out.print("Enter your height in meter: ");
        // example 1.60 m not 160 or 5.3
        double height = sc.nextDouble();
        double bmi = weight/(height*height);

        System.out.println("Your BMI " + bmi);

        // BMI Categories 

        if(bmi<=18.4){
            System.out.println("Underweight");
        }
        else if (bmi>=18.5 && bmi<=24.9){
            System.out.println("Normal");
        }
        else if (bmi>=25 && bmi<=39.9){
            System.out.println("Overweight");
        }
        else if (bmi>=40){
            System.out.println("Obese");
        }

        sc.close();
    }
    
}
