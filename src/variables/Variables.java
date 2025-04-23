package variables;

public class Variables {

    public static void main(String[] args) {

        int age = 22;
        int year = 2025;
        int quantity = 1;

        double price = 19.99;
        double gpa = 4.5;
        double temperature = -1.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        String name = "Pedro";
        String food = "meatloaf";
        String email = "pedrotomaz918@gmail.com";

        System.out.println(age);
        System.out.println("The year is " + year);
        System.out.println(quantity);

        System.out.println("-----------------------");

        System.out.println("R$"+price);
        System.out.println(gpa);
        System.out.println(temperature);

        System.out.println("-----------------------");

        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(currency);

        System.out.println("-----------------------");

        System.out.println(isStudent);
        System.out.println(forSale);
        System.out.println(isOnline);

        System.out.println("-----------------------");

        if(isStudent != true) {
            System.out.println("You're a student!");
        } else {
            System.out.println("You're not a student!");
        }

        System.out.println("-----------------------");

        System.out.println("Hello " + name);
        System.out.println("My favorite food is " + food);
        System.out.println("Contact me on " + email);

        System.out.println("-----------------------");

        System.out.println("Hello everyone!");
        System.out.println("I'm " + name + " and I'm " + age + " years old!");
        System.out.println("My gpa is " + gpa);
        System.out.println("My average grade is " + grade);
    }
}
