package RhombusOfStars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //top Half
        int n = Integer.parseInt(scanner.nextLine());
        //TODO: Check if i can make a christmas Tree out of the first top logic
        printTopHalf(n);
        printBottomHalf(n);

    }

    private static void printBottomHalf(int n) {
        for (int row = 1; row <= n - 1; row++) {
            printSpaces(row);
            printStar(n - row);
        }
    }

    private static void printTopHalf(int n) {
        for (int row = 1; row <= n; row++) {
            printSpaces(n - row);
            printStar(row);
        }
    }

    private static void printStar(int row) {
        for (int i = 1; i <= row; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    private static void printSpaces(int numberOfSpaces) {
        for (int i = 1; i <= numberOfSpaces; i++) {
            System.out.print(" ");
        }
    }
}