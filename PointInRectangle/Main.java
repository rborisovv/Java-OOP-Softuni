package PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] coordinates = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        Point bottomLeftPoint = new Point(coordinates[0], coordinates[1]);
        Point topRightPoint = new Point(coordinates[2], coordinates[3]);
        Rectangle rectangle = new Rectangle(bottomLeftPoint, topRightPoint);
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        while (numberOfLines-- > 0) {
            int[] currentPointCoordinates = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            System.out.println(rectangle.contains(new Point(currentPointCoordinates[0], currentPointCoordinates[1])));
        }
    }
}