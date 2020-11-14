package ClassBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        StringBuilder sb = new StringBuilder();
        try {
            Box box = new Box(length, width, height);
            sb.append(String.format("Surface Area - %.2f",
                    box.calculateSurfaceArea())).append(System.lineSeparator());
            sb.append(String.format("Lateral Surface Area - %.2f",
                    box.calculateLateralSurfaceArea())).append(System.lineSeparator());
            sb.append(String.format("Volume - %.2f",
                    box.calculateVolume()));
            System.out.println(sb.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}