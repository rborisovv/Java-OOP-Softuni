package CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String power = scanner.nextLine();
        String suit = scanner.nextLine();

        int card = CardsPower.valueOf(power).getMultiplier() + CardsSuits.valueOf(suit).getSuit();
        System.out.printf("Card name: %s of %s; Card power: %d%n",power,suit,card);
    }
}
