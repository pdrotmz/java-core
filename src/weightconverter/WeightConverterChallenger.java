package weightconverter;

import java.util.Scanner;

public class WeightConverterChallenger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choose;
        double weight, newWeight;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.print("Choose and option: ");
        choose = scanner.nextInt();
        if(choose == 1) {
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight / 2.2;
            System.out.printf("The new weight in lbs is: %.2f", newWeight);
        }
        else if(choose == 2) {
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.2;
            System.out.printf("The new weight in kgs is %.2f", newWeight);
        } else {
            System.out.println("Select a valid number");
        }

        scanner.close();
    }
}
