package substring;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        // .substring() = A method to extract a portion of a string, string.substring(start, end)

        /*

        String email = "fakeemail@gmail.com";
        String username = email.substring(0, 9); // starts at 0 = f, ends at 9 = @
        String domain = email.substring(10, 19); // starts at 10 = g, ends at 19 = m

        username = email.substring(0, email.indexOf("@")); // Flexible
        domain = email.substring(email.indexOf("@")); // Flexible

        System.out.println(username);
        System.out.println(domain);

        */

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String password;

        System.out.println("Enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@")) {
            username = email.substring(0, email.indexOf("@"));
            System.out.printf("Your username is: %s", username);
        }

        else {
            System.out.println("Email must contain @");
            return;
        }

        System.out.println("\nEnter your password: ");
        password = scanner.nextLine();
        if(password.length() < 8) {
            System.out.println("Password must be more than 8 characters");
        } else {
            System.out.println("User registered!");
        }

        scanner.close();
    }
}
