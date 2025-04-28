package enhancedswitch;

import java.util.Scanner;

public class EnhancedSwitch {

    public static void main(String[] args) {
        // Enhanced switch = A replacement to many if else statements

        /*
         * String day = "DogTooth";
         *
         * switch (day) {
         *      case "Monday" -> System.out.println("It is a weekday");
         *      case "Tuesday" -> System.out.println("It is a weekday");
         *      case "Wednesday" -> System.out.println("It is a weekday");
         *      case "Thursday" -> System.out.println("It is a weekday");
         *      case "Friday" -> System.out.println("It is the final weekday");
         *      case "Saturday" -> System.out.println("It is weekend");
         *      case "Sunday" -> System.out.println("It is weekend");
         *      default -> System.out.println(day + " is not a day");
         *   }
         */

        Scanner scanner = new Scanner(System.in);

        double firstGrade, secondGrade, finalGrade;

        System.out.print("Enter your first grade: ");
        firstGrade = scanner.nextDouble();

        System.out.print("Enter your second grade: ");
        secondGrade = scanner.nextDouble();

        finalGrade = (firstGrade + secondGrade) / 2;

        switch ((int) finalGrade) {
            case 7, 8, 9, 10 -> System.out.println("Approved");
            case 5, 6 -> System.out.println("Recovery");
            case 1, 2, 3, 4 -> System.out.println("Failed");

        }
    }
}
