/*
 * Sea Battle Start project.
 */
package seabattlegame;

import Models.Player;
import seabattlegui.ISeaBattleGUI;
import seabattlegui.ShipType;

/**
 * The Sea Battle game. To be implemented.
 * @author Nico Kuijpers
 */
public class SeaBattleGame implements ISeaBattleGame {

    @Override
    public void registerPlayer(String name, String password, ISeaBattleGUI application, boolean singlePlayerMode) {
        if (name == null || name == "" || password == null || password == "" || application == null){
            throw new IllegalArgumentException("This operation is illegal");
        }

        Player player = new Player(name,1);

        /**
         * Register player with given name and password. The player number will be
         * set at the player's application by a call-back of method setPlayerNumber().
         * @param name              Name of the player to be registered
         * @param password          Password of the player to be registered
         * @param application       Reference to application of player
         * @param singlePlayerMode  Single-player (true) or multi-player (false) mode
         * @throws IllegalArgumentException when:
         * name is null or the empty,
         * password is null or empty,
         * application is null,
         * number of players exceeds one in single-player mode,
         * number of players exceeds two in multi-player mode or
         * name is already registered.
         */
    }

    @Override
    public void placeShipsAutomatically(int playerNr) {
        throw new UnsupportedOperationException("Method placeShipsAutomatically() not implemented.");
    }

    @Override
    public void placeShip(int playerNr, ShipType shipType, int bowX, int bowY, boolean horizontal) {
        throw new UnsupportedOperationException("Method placeShip() not implemented.");
    }

    @Override
    public void removeShip(int playerNr, int posX, int posY) {
        throw new UnsupportedOperationException("Method removeShip() not implemented.");
    }

    @Override
    public void removeAllShips(int playerNr) {
        throw new UnsupportedOperationException("Method removeAllShips() not implemented.");
    }

    @Override
    public void notifyWhenReady(int playerNr) {
        throw new UnsupportedOperationException("Method notifyWhenReady() not implemented.");
    }

    @Override
    public void fireShot(int playerNr, int posX, int posY) {
        throw new UnsupportedOperationException("Method fireShot() not implemented.");
    }

    @Override
    public void startNewGame(int playerNr) {
        throw new UnsupportedOperationException("Method startNewGame() not implemented.");
    }    
}
