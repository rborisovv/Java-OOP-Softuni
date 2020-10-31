package HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        Season season = Season.valueOf(tokens[2].toUpperCase());
        Discount discount = Discount.valueOf(tokens[3].toUpperCase());
        PriceCalculator priceCalculator = new PriceCalculator(Double.parseDouble(tokens[0]),
                Integer.parseInt(tokens[1]), season, discount);
        System.out.printf("%.2f",priceCalculator.getResult());
    }
}