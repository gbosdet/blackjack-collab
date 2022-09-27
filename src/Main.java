import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int playerTotal = 0;
    static Player player;
    static Scanner input;
    static Deck deck;
    static ArrayList<Card> playerHand;
    static boolean w = true;

    public static void main(String[] args){
        input = new Scanner(System.in);
        deck = new Deck();
      playerHand = new ArrayList<>();
        /* TODO: Use other classes to make it work */

        System.out.println("Hello! What is your name?");
        player = new Player(input.nextLine());
        dealPlayerHand();
        HitOrStand();


        }

        public static void HitOrStand() {

            while (w == true) {
                System.out.println("Would you like to (H)it or (S)tand?");
                String a = input.nextLine();
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

        public static void dealPlayerHand () {
           playerHand.add(deck.drawCard());
           //addToTotal();
           playerHand.add(deck.drawCard());
           //addToTotal();
           System.out.println("\nYou were dealt \n" + playerHand + "\n");
        }
        //public static int checkHandTotal ()

        public static void playerHit() {
            playerHand.add(deck.drawCard());
            addToTotal(playerHand.get(playerHand.size()-1));
            System.out.println(playerHand);
        }
        public static void addToTotal (Card card){
        playerTotal += card.getIntValue();
        System.out.println("Total = " + playerTotal);
        //if (playerTotal>21){
           // System.out.println("You Lose!");
            //w= false;
        }

        }



