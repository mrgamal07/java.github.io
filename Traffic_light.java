// TRAFFIC LIGHT SYSTEM
import java.util.Scanner;
public class Traffic_light{
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter traffic color (red, yellow, green,orange): ");
        String signal = scanner.nextLine();
        
        if(signal.equals("Red")){
            System.out.println("Stop");
        }
        else if(signal.equals("Green")){
            System.out.println("Go");
        }
        else if(signal.equals("Yellow")){
            System.out.println("Get Ready");
        }
        else if(signal.equals("Orange")){
            System.out.println("Slow Down");
        }
        else{
            System.out.println("Invalid Signal");
        }
        scanner.close();
    }

}