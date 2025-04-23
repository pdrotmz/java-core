package input;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        // TODO: Document everything using examples and make it understandable

        // Start of Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What's your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student ? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is " + gpa);

        if(isStudent) {
            System.out.println("You are enrolled as a student");
        } else {
            System.out.println("You're NOT enrolled");
        }

        // COMMON ISSUE
        System.out.println("What's your favorite number ?");
        int number = scanner.nextInt();
        scanner.nextLine(); // Put nextLine after declaration because, nextInt and nextDouble overwrites nextLine

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("Your favorite number is " + number);
        System.out.println("Your favorite color is " + color);

        // End of Scanner
        scanner.close();
    }
}
