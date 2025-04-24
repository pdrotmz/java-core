package random;

import java.util.Random;

public class RandomClass {

    public static void main(String[] args) {
        Random random = new Random();

        int number1;
        int number2;
        int number3;

        number1 = random.nextInt(1, 6);
        number2 = random.nextInt(1, 6);
        number3 = random.nextInt(1, 6);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        System.out.println("-----------------MINI-GAME-----------------");
        boolean isHeads;

        isHeads = random.nextBoolean();

        if(isHeads) {
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }
    }
}
