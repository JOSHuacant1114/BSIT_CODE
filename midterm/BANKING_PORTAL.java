import java.util.Scanner;

public class BANKING_PORTAL {
    private double balance;

    public BANKING_PORTAL(double initialBalance){
        this.balance = initialBalance;
    }
    public void deposit(double amount){
        if(amount >0){
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New balance: $ " + balance);
        }
        else{
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount <= balance){
            balance -=amount;
            System.out.println("withdraw: $" + amount);
            System.out.println("New balance: $" + balance);
        }else{
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }public double getBalance(){
        return balance;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter intial balance: ");
        double initialBalance = sc.nextDouble();
        BANKING_PORTAL account = new BANKING_PORTAL(initialBalance);
        while(true){
            System.out.println("\nChoose an operation: ");
            System.out.println("1. deposit");
            System.out.println("2. withdraw");
            System.out.println("3.Check balance");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            switch(choice){
            case 1:
                System.out.println("this program still on work");
                break;
            case 2:
                System.out.println("this program still on work");
            case 3: 
                System.out.println("Current balance: $ " + account.getBalance());
                break;
            case 4:
                System.out.println("Exiting...");
                sc.close();
                return;
                default:
                System.out.println("Invalid choice");
            }
        }
    }
}
