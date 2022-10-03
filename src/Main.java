
import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    static int playerTotal = 0;
    static Player player;
    static Scanner input;
    static Deck deck;
    static ArrayList<Card> playerHand;
    static boolean w = true;
    static boolean game = true;




    public static void main(String[] args) {
        input = new Scanner(System.in);
        deck = new Deck();
        playerHand = new ArrayList<>();
        /* TODO: Use other classes to make it work */


        System.out.println("Hello! What is your name?");
        player = new Player(input.nextLine());
            while (game == true) {
                dealPlayerHand();
                HitOrStand();
            }
    }

    public static void HitOrStand() {

        while (w == true) {
            System.out.println("Would you like to (H)it or (S)tand?");
            String a = input.nextLine();
            a = a.toUpperCase();
            char b = a.charAt(0);

            switch (b) {
                case ('H'):
                    playerHit();
                    break;

                case ('S'):
                    w = false;
            }
        }
    }

    public static void dealPlayerHand() {
        playerHand.add(deck.drawCard());
        playerHand.add(deck.drawCard());
        System.out.println("\nYou were dealt \n" + playerHand + "\n");
        aces(playerHand);
    }
    public static void checkHandTotal (){
        if (playerTotal > 21){
            System.out.println("You bust! Game over!");
            game = false;
            w = false;
            endGame();
        }
    }

    public static void playerHit() {
        playerHand.add(deck.drawCard());
        playerTotal = aces(playerHand) ;
        System.out.println(playerHand);
        checkHandTotal();
        System.out.println("Your total is " + playerTotal);

    }

    public static int aces(ArrayList<Card> hand) {
        int numaces = 0;
        int value = 0;
        for (Card card : hand) {
            //System.out.println(card.getIntValue());
            if (card.getIntValue() == 1) {
                value += 11;
                numaces++;
            } else {
                value += card.getIntValue();
            }
        }
        while (value > 21 && numaces > 0) {
            value -= 10;
            numaces--;
        }
        return value;
    }
    public static void endGame (){
        System.out.println("Do you want to play again? Y/N");

    }
}





