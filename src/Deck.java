import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;

    /*TODO: Create constructor that initializes and fills deck and shuffles it
        NOTE: May want to look into Collections.shuffle()

     */
    public Deck() {
        this.deck = new ArrayList<>();
        for(int i = 1; i <= 13; i++){
                deck.add(new Card(i, "Diamonds"));
                deck.add(new Card(i, "Spades"));
                deck.add(new Card(i, "Hearts"));
                deck.add(new Card(i, "Clubs"));
        }
        Collections.shuffle(deck);
    }

    //TODO: Make drawCard so it returns the card at the end of
    // the list and removes it from the list
    public Card drawCard() {
        return deck.remove(deck.size() - 1);
    }
    //Happy Friday Class! (Don't delete this unless necessary)
}