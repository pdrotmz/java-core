package temperatureconverter;

import java.util.Scanner;

public class TemperatureConverterChallenger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature, newTemperature;
        String unit;

        System.out.print("Enter the temperature: ");
        temperature = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.nextLine();

        newTemperature = (unit.equals("C")) ? (temperature - 32) * 5 / 9 : (temperature * 5 / 9) + 32;
        System.out.printf("The temperature is %.1fº%s", newTemperature, unit);

        scanner.close();
    }
}
