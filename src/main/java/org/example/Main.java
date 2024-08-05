package org.example;

import static org.example.Game.printNumberOfRound;
import static org.example.RealPlayer.getNameOfRealPlayer;

public class Main {

    public static void main(String[] args) {
        Game game = new Game(getNameOfRealPlayer());
        int betterBet;
        int guesserBet;
        boolean guesserGuess;
        for (int numberOfRound = 1; !game.isGameEnded(); numberOfRound++) {
            printNumberOfRound(numberOfRound);
            if (numberOfRound % 2 == 1) {
                betterBet = game.AIPlayer.getEvenOrOddBet();
                guesserBet = game.RealPlayer.getBet();
                guesserGuess = game.RealPlayer.getEvenOrOddGuess();
                game.getWinner(guesserBet, betterBet, guesserGuess, game.AIPlayer, game.RealPlayer);
            }
            else {
                betterBet = game.RealPlayer.getEvenOrOddBet();
                guesserBet = game.AIPlayer.getBet();
                guesserGuess = game.AIPlayer.getEvenOrOddGuess();
                game.getWinner(guesserBet, betterBet, guesserGuess, game.RealPlayer, game.AIPlayer);
            }
            game.RealPlayer.printInfo();
            game.AIPlayer.printInfo();
        }
    }
}
