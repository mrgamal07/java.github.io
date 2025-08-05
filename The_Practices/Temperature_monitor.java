// TEMPERATURE MONITORING SYSTEM
import java.util.Scanner;
public class Temperature_monitor{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the tem in Celsius or Faharenheit???(C/F):");
        char unit = scanner.next().charAt(0);
        System.out.println("Enter the temperature: ");
        double temperature = scanner.nextDouble();
          double convertedTemperature;
        String unitType = "";

        // Convert based on the unit
        if (unit == 'C' || unit == 'c') {
            // Convert Celsius to Fahrenheit
            convertedTemperature = (temperature * 9/5) + 32;
            unitType = "Fahrenheit";
        } else if (unit == 'F' || unit == 'f') {
            // Convert Fahrenheit to Celsius
            convertedTemperature = (temperature - 32) * 5/9;
            unitType = "Celsius";
        } else {
            // If the user enters an invalid unit
            System.out.println("Invalid unit entered. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
            return;
        }

        // Display the converted temperature
        System.out.printf("The temperature in %s is: %.2f\n", unitType, convertedTemperature);

        scanner.close();

    }
}