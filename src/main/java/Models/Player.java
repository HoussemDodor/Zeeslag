package Models;

public class Player {
    // Fields
    private String name;
    private int playerNr;

    // Properties
    public String getName() {
        return name;
    }
    public int getPlayerNr() {
        return playerNr;
    }

    // Constructor
    public Player(String name, int playerNr){
        this.name = name;
        this.playerNr = playerNr;
    }

    // Methods
    @Override
    public String toString() {
        return name;
    }
}
