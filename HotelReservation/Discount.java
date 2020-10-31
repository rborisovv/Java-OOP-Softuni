package HotelReservation;

public enum Discount {
    VIP(20),
    SECONDVISIT(10),
    NONE(0);

    private final int discount;

    Discount(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }
}
