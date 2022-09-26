import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Player player;
    static Scanner input;

    public static int aces(ArrayList<Card> hand){
        int numaces = 0;
        int value = 0;
        for (Card card : hand) {
            System.out.println(card.getIntValue());
            if (card.getIntValue() == 1) {
                value += 11;
                numaces++;
            }
            else {
                value += card.getIntValue();
            }
        }
        while(value > 21 && numaces > 0){
            value -= 10;
            numaces--;
        }
        return value;
    }

    public static void main(String[] args){
        input = new Scanner(System.in);
        /* TODO: Use other classes to make it work */
/*        System.out.println("Hello! What is your name?");
        String name = input.nextLine();*/

        ArrayList<Card> test = new ArrayList<Card>();
        test.add(new Card(1, "Diamonds"));
        test.add(new Card(10, "Clubs"));
        //test.add(new Card(1, "Hearts"));

        System.out.println("result: "+aces(test));







    }
}
