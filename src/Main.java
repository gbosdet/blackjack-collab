
import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    static int playerTotal = 0;
    static Player player;
    static Scanner input;
    static Deck deck;
    static ArrayList<Card> playerHand;
    static ArrayList<Card> dealerHand;
    static boolean start = true;
    static boolean w = true;
    static boolean d = true;





    public static void main(String[] args) {
        input = new Scanner(System.in);
        deck = new Deck();
        playerHand = new ArrayList<>();
        dealerHand = new ArrayList<>();
        /* TODO: Use other classes to make it work */


        System.out.println("Hello! What is your name?");
        player = new Player(input.nextLine());
            while (true) {
                while (d || w) {
                    if (start) {
                        dealHands();
                    }
                    HitOrStand();
                    if (d) {
                        dealerPlay();
                    }
                }
                endGame();
                System.out.println("Do you want to play again? Y/N");
                if(input.next().toUpperCase().charAt(0) == 'Y'){
                    reset();
                }
                else{
                    System.out.println("Thanks for playing");
                    System.exit(0);
                }
            }
    }

    private static void reset() {
        w = true;
        d = true;
        start = true;
        playerHand.clear();
        dealerHand.clear();
        deck = new Deck();
    }

    private static void dealerPlay() {
        if(aces(dealerHand) < 16 || aces(playerHand) > aces(dealerHand)){
            dealerHand.add(deck.drawCard());
            System.out.println("\nThe dealer was dealt \n" + dealerHand + "\n");
            aces(dealerHand);
        }
        else{
            System.out.println("The dealer stands");
            d = false;
        }
    }

    public static void HitOrStand() {

        if (w == true) {
            System.out.println("Would you like to (H)it or (S)tand?");
            String a = input.next();
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

    public static void dealHands() {
        playerHand.add(deck.drawCard());
        dealerHand.add(deck.drawCard());
        playerHand.add(deck.drawCard());
        dealerHand.add(deck.drawCard());
        System.out.println("\nYou were dealt \n" + playerHand + "\n");
        aces(playerHand);
        System.out.println("\nThe dealer was dealt \n" + dealerHand + "\n");
        aces(dealerHand);
        start = false;
    }
//    public static void checkHandTotal (){
//        if (playerTotal > 21){
//            System.out.println("You bust! Game over!");
//            game = false;
//            w = false;
//            endGame();
//        }
//    }

    public static void playerHit() {
        playerHand.add(deck.drawCard());
        playerTotal = aces(playerHand) ;
        System.out.println(playerHand);
        //checkHandTotal();
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
        if((aces(dealerHand) > 21 || aces(playerHand) > aces(dealerHand)) && aces(playerHand) <= 21){
            System.out.println("You win! Congratulations!");
        }
        else{
            System.out.println("You lose. Better luck next time");
        }
    }
}





