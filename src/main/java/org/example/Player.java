package org.example;

// Игрок
public abstract class Player {

    protected String Name = null; // Имя
    protected int NumberOfStones = 10; // Количество камней
    protected int NumberOfWins = 0; // Количество верных угадываний
    protected int NumberOfLosses = 0; // Количество неверных угадываний

    // Получение предполочения о том, чётное или нечётное количество камней загадал соперник
    public abstract boolean getEvenOrOddGuess();

    // Получение количества камней, чётность или нечётность которого должен угадать соперник
    public abstract int getEvenOrOddBet();

    // Получение количества камней, которое угадывающий игрок выиграет или проиграет
    public abstract int getBet();

    // Вывод на экран информации об игроке
    public final void printInfo() {
        System.out.printf("%s\nКоличество камней: %d\nКоличество побед: %d\nКоличество поражений: %d\n", Name, NumberOfStones, NumberOfWins, NumberOfLosses);
    }

}
