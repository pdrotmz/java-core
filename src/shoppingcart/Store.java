package shoppingcart;

import java.util.Scanner;

public class Store {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("What item would you like to buy ?: ");
        String item = read.nextLine();
        System.out.print("What is the price for each ?: ");
        double price = read.nextDouble();
        read.nextLine();
        System.out.print("How many you like ?:");
        int quantity = read.nextInt();

        double totalPrice = price * quantity;

        System.out.println("\nYou have bought " + item + "/s");
        System.out.println("Your total is $" + totalPrice);

        read.close();
    }
}
