package HW3;

import java.util.Scanner;

/**
 * главный класс игры, который содержит метод main для запуска игры
 * @param args
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Cp866");
        int length = 4;
        int en_ru = 0; // 0 - по умолчанию английский набор слов в игре

        System.out.println("Введите количество символов в слове:");
        length = scanner.nextInt();

        System.out.println("Введите на каком языке будут слова для угадывания 0 - английский, 1 - русский");
        en_ru = scanner.nextInt();

        WordGenerator wordGenerator = new WordGenerator();
        
        String targetWord = wordGenerator.generateWord(length,en_ru);
        

        GuessChecker guessChecker = new GuessChecker(targetWord);

        boolean gameWon = false;
        int triesCount = 0;
        int maxTriesCount = 4; // установка максимального количества попыток

        History history = new History();

        while (!gameWon) {
            System.out.println("Введите слово:");
            String guessWord = scanner.nextLine();

            GuessResult guessResult = guessChecker.checkGuess(guessWord);

            history.add(guessWord, guessResult.getBulls(), guessResult.getCows());

            if (guessResult.isGameOver()) {
                gameWon = true;
                System.out.println("Вы выиграли!");
                break;
            } 

            System.out.println(guessResult.getResultString());
            triesCount++;

            if (triesCount == maxTriesCount) {
                System.out.println("Вы проиграли. Попытки исчерпаны.");
                break;
            }
        }

        if (triesCount > 0) {
            System.out.println("Введите y, чтобы вывести историю ходов, n - чтобы не выводить:");
            String outputHistory = scanner.nextLine();

            if (outputHistory.equalsIgnoreCase("y")) {
                System.out.println(history.getHistoryString());
            }
        }
    }
    }