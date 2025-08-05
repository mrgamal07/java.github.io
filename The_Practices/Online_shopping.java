// ONLINE SHOPPING DISCOUNT
import java.util.Scanner;
public class Online_shopping{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your shopping amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter your card type(Gold/Platinum): ");
        String cardType = scanner.nextLine();
        double discount = 0.0;
        if(cardType.equals("Gold")){
            discount = amount*0.10;
    }
    else if(cardType.equals("Platinum")){
        discount = amount*0.20;
    }
    else{
        System.out.println("Invalid card type");
    }
    double finalAmount = amount -discount;
    System.out.println("your discount amount is:"+discount);
    System.out.println("Your final amount is:"+finalAmount);
    scanner.close();
}
}