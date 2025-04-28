package variables;

public class Variables {

    public static void main(String[] args) {

        /*
        * Variables are splits by two types
        *
        * THE PRIMITIVES X THE REFERENCES
        *
        * int                String
        * double             Array
        * char               Object
        * boolean
        *
        *
        * The primitives are directly stored at pc's memory (STACK)
        * Meanwhile the references it's like a collection of primitive types that are referenced (HEAP)
        *
        *
        * ------------- STACK -------------
        * - A stack is a type of data structure that deals with variables,
        *   primarily storing and managing automatic variables in memory,
        *   with no need for manual allocation or deallocation.
        *   It is mostly used for managing local variables with functions,
        *   as well as handling the function call context
        *
        *
        * -------------- HEAP --------------
        * - A heap is a type of data structure.
        *   In java heaps refer to a region of memory
        *   used to allocate some objects.
        *   The allocation is manual, so it gets a better performance,
        *   You can work with them using strings, arrays and objects
        *
        * */

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

        System.out.println("---------------- CHALLENGER ----------------");
        String newName = "Pedro Tomáz";
        int gta = 6;
        double pi = 3.14159;
        char gender = 'M';
        boolean isAdmin = true;


        if(isAdmin) {
            System.out.println("Only if you're admin, you're seeing this");
            System.out.println("My name is " + newName + " I wanna buy gta " + gta +
                    " for the " + pi + " value price" + " because I'm a " + gender);
        } else {
            System.out.println("You're not a admin, get out!");
        }
    }
}
