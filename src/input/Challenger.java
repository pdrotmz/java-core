package input;

import java.util.Scanner;

public class Challenger {

    public static void main(String[] args) {

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of rectangle: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height of rectangle: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is " + area + "cm²");
        scanner.close();;
    }
}
