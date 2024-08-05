package org.example;

import static org.example.RealPlayer.getNameOfRealPlayer;

public class Main {

    public static void main(String[] args) {
        Game game = new Game(getNameOfRealPlayer());
        for (int numberOfRound = 1; !game.isGameEnded(); numberOfRound++) {
            game.round(numberOfRound);
        }
    }

}
