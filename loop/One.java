import java.util.Scanner;
public class One{
    public static void main(String[] args) {
        Scanner arun= new Scanner(System.in);
        double balance = 10000;
        System.out.print("Enter the amout: ");
        int amount = arun.nextInt();
        while(true){
            System.out.println("welcome to atm\n");
            System.out.println("your current balance is:$" + amount);
            System.out.println("Enter your amount to withdraw(or type 'exit' to quit):");
            String input = arun.next();
        if(input.equalsIgnoreCase("exit")){
            System.out.println("thank you for using atm");
            break;
        }
        try{
            double amount = Double.parseDouble(input);
            if(amount <= 0){
                System.out.println("withdrawl anount must be greater than zero.: ");
            }
            else if(amount>balance){
            System.out.println("Insuffinient balance! please enter a smaller amount.: ");
            }
            else{
                balance -= amount;
                System.out.println("Withdrawl successful! your current balance is:$" + balance);
                System.out.println("your current balance is :$" + balance);
            }
            if(balance==0){
                System.out.println("your account is empty");
                break;
            }
            catch(NumberFormatException e){
                System.out.println("Invalid input");
            }
        }
        arun.close();
    }
}
}