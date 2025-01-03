import java.util.Scanner;

public class ASPECT_JUMP {
    public static void main(String[] args){

        //String introduction
        System.out.println("Welcome im here to record your score.");
        
        //Taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Enter your full name: ");
        String name = sc.nextLine();
        System.out.print("Enter your block in number 1-6 (A-F)");
        int num = sc.nextInt();
        System.out.print("Enter your ID number: ");
        int idnum = sc.nextInt();
        System.out.print("prelim score in prog 1: ");
        int assignment1 = sc.nextInt();
        System.out.print("midterm score in prog 1: ");
        int assignment2 = sc.nextInt();
        System.out.print("final score in prog 1: ");
        int assignment3 = sc.nextInt();


        //multiple statement
        System.out.println("  ");

        System.out.println("---------Information----------");
        System.out.println("");
        System.out.println("Name: " + name);
        //switch statement
        switch (num) {
            case 1:
                System.out.println("BSIT: Block A");
                break;
            case 2:
                System.out.println("BSIT: Block B");
                break;
            case 3:
                System.out.println("BSIT: Block C");
                break;
            case 4: 
                System.out.println("BSIT: Block D");
                break;
            case 5: 
                System.out.println("BSIT: Block E");
                break;
            case 6:
                System.out.println("BSIT: Block F");
            default:
                System.out.println("You are an allien");
        }
            System.out.println("Studen ID Number: "  + idnum );
        
        //doing math
        int total = assignment1 + assignment2 + assignment3;
        double average = total/ 3;
        System.out.println(" ");
        System.out.println("...............Final Score Report....................");
        System.out.println( "Average Score: " + average);

        //multiple conditions 
        if(average>= 90 && average<=100){
            System.out.println( "Letter Grades: A");
            System.out.println("Status: PASSED!!");
        }else if(average>=80 && average<=89){
            System.out.println( "Letter Grades: B");
            System.out.println("Status: PASSED!!");
        }
        else if(average>=70 && average<=79){
            System.out.println( "Letter Grades: C");
            System.out.println("Status: PASSED!!");
        }
        else if(average>=60 && average<= 69){
            System.out.println("Letter Grades: D");
            System.out.println("Status: PASSED!!");
        }
        //conditional
        else if(average<= 60){
            System.out.println("Letter Grades: F");
            System.out.println("Status: FAILED!!");
        }
        System.out.println("Enter your fav. num 1-10");
        int favnum = sc.nextInt();
        //while loop
        while(favnum>=10){
            System.out.println(favnum);
            favnum--;
        }    
        sc.close();

        
    }
}

