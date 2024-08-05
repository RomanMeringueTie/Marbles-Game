package org.example;

import java.util.Scanner;

// Игрок, управляемый пользователем
public class RealPlayer extends Player {

    RealPlayer(String name) {
        Name = name;
    }

    // Получение имени игрока от пользователя
    public static String getNameOfRealPlayer() {
        System.out.println("Введите своё имя: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    @Override
    public boolean getEvenOrOddGuess() {
        System.out.printf("%s, выбирайте:\nЧётное - 0, нечётное - 1 ", Name);
        Scanner scanner = new Scanner(System.in);
        int evenOrOdd = scanner.nextInt();
        while (evenOrOdd != 0 && evenOrOdd != 1) {
            System.out.println("Некорректный ввод, Чётное - 0, нечётное - 1 ");
            evenOrOdd = scanner.nextInt();
        }
        return evenOrOdd == 1;
    }

    @Override
    public int getEvenOrOddBet() {
        System.out.printf("%s, выбирайте, сколько камней загадать: ", Name);
        Scanner scanner = new Scanner(System.in);
        int bet = scanner.nextInt();
        while (bet > NumberOfStones || bet <= 0) {
            System.out.println("Некорректный ввод, сколько камней загадать?");
            bet = scanner.nextInt();
        }
        return bet;
    }

    @Override
    public int getBet() {
        System.out.printf("%s, выбирайте, сколько камней поставить на победу: ", Name);
        Scanner scanner = new Scanner(System.in);
        int bet = scanner.nextInt();
        while (bet > NumberOfStones  || bet <= 0) {
            System.out.println("Некорректный ввод, сколько камней поставить на победу?");
            bet = scanner.nextInt();
        }
        return bet;
    }

}
