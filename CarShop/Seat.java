package CarShop;

public class Seat extends CarImpl implements Car, Sellable {
    private final Double price;

    public Seat(String model, String color, Integer horsePower,
                String countryProduced, Double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }

    @Override
    public String toString() {
        return "This is " + super.getModel() + " produced in " + super.countryProduced() +
                " and have" + Car.TIRES + " tires" +
                System.lineSeparator() + super.getModel() + " sells for " +
                CustomFormat.PATTERN.format(this.price).replace(".", ",");
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}