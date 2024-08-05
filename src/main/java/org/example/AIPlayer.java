package org.example;


import java.io.*;
import java.util.ArrayList;
import java.util.Random;

// Игрок, управляемый компьютером
public class AIPlayer extends Player {

    public AIPlayer() {
        ArrayList<String> namesList = getListOfNamesFromFile("names.txt");
        Random random = new Random();
        Name = namesList.get(random.nextInt(namesList.size() - 1));
    }

    // Получение списка имён из файла
    private ArrayList<String> getListOfNamesFromFile(String filename) {
        ArrayList<String> namesList = new ArrayList<>();
        try {
            InputStream inputStream = AIPlayer.class.getClassLoader().getResourceAsStream(filename);
            if (inputStream == null) {
                throw new NullPointerException("Ошибка открытия файла");
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String fileLine;
            while ((fileLine = reader.readLine()) != null) {
                namesList.add(fileLine);
            }
        } catch (FileNotFoundException noFile) {
            throw new IllegalArgumentException("Файл не найден");
        }
        catch (IOException input) {
            System.out.println("Ошибка чтения файла");
        }
        return namesList;
    }

    @Override
    public boolean getEvenOrOddGuess() {
        return new Random().nextBoolean();
    }

    @Override
    public int getEvenOrOddBet() {
        if (NumberOfStones > 1)
            return new Random().nextInt(NumberOfStones - 1) + 1;
        else
            return 1;
    }

    @Override
    public int getBet() {
        if (NumberOfStones > 1)
            return new Random().nextInt(NumberOfStones - 1) + 1;
        else
            return 1;
    }

}
