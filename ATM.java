// ATM WIDRAWAL SYSTEM
import java.util.Scanner;
public class ATM{
    public static void main(String[] args){
        double balance = 5000.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        if( withdrawalAmount > 0 && withdrawalAmount<=balance){
            balance -= withdrawalAmount;
            System .out.println("withdrawal successful. Remaining balance: $" + balance);
        }
        else if(withdrawalAmount > balance)
        {
            System.out.println("Insufficient balance.");
        }
        else{
            System.out.println("Invalid amount.");
        }
        scanner.close();
    }
}