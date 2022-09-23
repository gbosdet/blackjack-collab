import java.util.Scanner;

public class Main {
    static Player player;
    static Scanner input;

    public static void main(String[] args){
        input = new Scanner(System.in);
        /* TODO: Use other classes to make it work */
        System.out.println("Hello! What is your name?");
        player = new Player(input.nextLine());



    }
}
