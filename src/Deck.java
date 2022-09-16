import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;

    /*TODO: Create constructor that initializes and fills deck and shuffles it
        NOTE: May want to look into Collections.shuffle()

     */
    public Deck() {

    }

    //TODO: Make drawCard so it returns the card and the end of
    // the list and removes it from the list
    public Card drawCard() {
        return new Card(11, "Hearts");
    }

    //Happy Friday Class! (Don't delete this unless necessary)
}