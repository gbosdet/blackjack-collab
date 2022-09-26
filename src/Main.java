import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Player player;
    static Scanner input;
    static Deck deck;
    static ArrayList playerHand;

    public static void main(String[] args){
        input = new Scanner(System.in);
        deck = new Deck();
      playerHand = new ArrayList();
        /* TODO: Use other classes to make it work */
        System.out.println("Hello! What is your name?");
        player = new Player(input.nextLine());
        HitOrStand();

        //public void playerName() {
        //    System.out.println("Hello! What is your name?");
        //    String name = input.nextLine();
//
        }

        public static void HitOrStand() {
        int w = 0;
            while (w < 10) {
                System.out.println("Would you like to (H)it or (S)tand?");
                String a = input.nextLine();
                a.toUpperCase();
                char b = a.charAt(0);







                switch (b) {
                    case ('H'):
                        playerHit();
                        break;

                    case ('S'):
                    //    dealerHand.checktotal;
                    //   while (checkValue < 17 ){
                    //      dealerHand.add(deck.drawCard());
                    //      System.out.println("Dealer drew a" + toString());
                }
            }

        }

        //public static void dealPlayerHand () {
          //  ArrayList<Card> playerHand = new Arraylist<>()
        //}
        //public static int checkHandTotal ()

        public static void playerHit() {
            playerHand.add(deck.drawCard());
            System.out.println(playerHand);
        }
        public static void playerStand() {

        }

    }

