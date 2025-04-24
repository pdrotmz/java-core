package ifstatement;

import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {
        // If statements = performs a block of code if its condition is true
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Are you a student ? (true/false):");
        boolean isStudent = scanner.nextBoolean();

        // GROUP 1 FOR THE NAME
        if(name.isEmpty()) {
            System.out.println("You didn't enter your name");
        } else {
            System.out.println("Hello " + name);
        }

        // GROUP 2 FOR THE AGE
        if(age >= 18 ) {
            System.out.println("You're an adult!");
        } else if(age < 0) {
            System.out.println("You haven't been born yet!");
        } else if(age >= 65) {
            System.out.println("You're a senior!");
        }
        else if (age == 0) {
            System.out.println("You're a baby!");
        }
        else {
            System.out.println("You're a child!");
        }

        // GROUP 3 FOR STUDENT (TRUE/FALSE)
        if(isStudent) {
            System.out.println("You're a student!");
        } else {
            System.out.println("You're not a student!");
        }

        scanner.close();
    }
}
