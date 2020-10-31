package CardsWithPower;

public enum CardsSuits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private final int suit;

    CardsSuits(int suit) {
        this.suit = suit;
    }

    public int getSuit() {
        return suit;
    }
}
