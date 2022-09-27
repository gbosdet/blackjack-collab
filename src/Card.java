public class Card {

    private static String[] faceCards = {"Jack", "Queen", "King"};
    private int intValue;
    private String stringValue;
    private String suit;

    /*TODO: Finish constructor. CardNum argument has range of 1-13 where
        1 = Ace, 11 = Jack, 12 = Queen, and 13 = King. intNum should be 10 for face cards
     */
    public Card(int cardNum, String suit) {
        this.suit = suit;
        intValue = Math.min(cardNum, 10);

        switch (cardNum) {
            case 1 -> stringValue = "Ace";
            case 11 -> stringValue = "Jack";
            case 12 -> stringValue = "Queen";
            case 13 -> stringValue = "King";
            default -> stringValue = "" + cardNum;

        }
    }

    public int getIntValue() {
        return intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return stringValue +
                " of " + suit;
    }

}