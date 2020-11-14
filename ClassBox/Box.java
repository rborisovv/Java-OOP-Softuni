package ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setHeight(double height) {
        if (isInvalidSide(height)) {
            throw new IllegalArgumentException(InvalidSide.heightMessage);
        }
        this.height = height;
    }

    private void setWidth(double width) {
        if (isInvalidSide(width)) {
            throw new IllegalArgumentException(InvalidSide.widthMessage);
        }
        this.width = width;
    }

    private void setLength(double length) {
        if (isInvalidSide(length)) {
            throw new IllegalArgumentException(InvalidSide.lengthMessage);
        }
        this.length = length;
    }

    private boolean isInvalidSide(double side) {
        return side <= 0;
    }

    public double calculateSurfaceArea() {
        return 2 * (length * width) + calculateLateralSurfaceArea();
    }

    public double calculateLateralSurfaceArea() {
        return 2 * (length * height) + 2 * (width * height);
    }

    public double calculateVolume() {
        return length * width * height;
    }
}