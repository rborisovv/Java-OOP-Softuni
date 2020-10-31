package HotelReservation;

public enum Season {
    SPRING(2),
    SUMMER(4),
    AUTUMN(1),
    WINTER(3);

    private final int seasonMultiplier;

    Season(int multiplier) {
        this.seasonMultiplier = multiplier;
    }

    public int getSeasonMultiplier() {
        return seasonMultiplier;
    }
}
