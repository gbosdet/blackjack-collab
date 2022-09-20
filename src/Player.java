/*TODO: Create Player class with constructor that takes name
   and has name and cash fields along with getters and a way to change amount of cash

 */

public class Player {
    private String name;
    private int cash;
    private int highScore;

    public Player(String name){
        this.name = name;
        cash = 0;
        highScore = 0;
    }

    public String getName() {
        return name;
    }

    public int getCash() {
        return cash;
    }

    public int getHighScore() {
        return highScore;
    }
}
