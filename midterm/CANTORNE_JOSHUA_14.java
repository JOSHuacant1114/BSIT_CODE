import java.util.Scanner;

public class CANTORNE_JOSHUA_14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of second to count down: ");
        int seconds = sc.nextInt();
        System.out.println("Timer started for " + seconds + " seconds...");
        while (seconds > 0){
            System.out.println("Time remaining: " + seconds + " seconds");
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            seconds--;
        }
        System.out.println("Time's up! Timer finished");
        sc.close();
    }
}