package org.example;

// Игра
public class Game {

    public RealPlayer RealPlayer;
    public AIPlayer AIPlayer;

    Game(String nameOfRealPlayer) {
        RealPlayer = new RealPlayer(nameOfRealPlayer);
        AIPlayer = new AIPlayer();
    }

    // Проверка, закончилась ли игра
    public boolean isGameEnded() {
        if (RealPlayer.NumberOfStones == 0 || AIPlayer.NumberOfStones == 0) {
            System.out.printf("%s выиграл!\n", (RealPlayer.NumberOfStones == 0) ? AIPlayer.Name : RealPlayer.Name);
            return true;
        }
        return false;
    }

    // Вывод на экран номера текущего раунда
    public static void printNumberOfRound(int numberOfRound) {
        System.out.printf("Раунд %d!\n", numberOfRound);
    }

    // Проверка победителя в текцщем раунде
    public void getWinner(int bet, int evenOrOddBet, boolean evenOrOddGuess, Player bettingPlayer, Player guessingPlayer) {
        if (evenOrOddBet % 2 == 0 && !evenOrOddGuess || evenOrOddBet % 2 == 1 && evenOrOddGuess) {
            updateNumberOfStones(bet, guessingPlayer, bettingPlayer);
        }
        else {
            updateNumberOfStones(bet, bettingPlayer, guessingPlayer);
        }
    }

    // Обновление количества камней по итогам раунда
    private void updateNumberOfStones(int bet, Player winner, Player loser) {
        winner.NumberOfStones += bet;
        loser.NumberOfStones -= bet;
        winner.NumberOfWins++;
        loser.NumberOfLosses++;
        System.out.printf("%s выиграл камни в количестве %d!\n", winner.Name, bet);
    }

}