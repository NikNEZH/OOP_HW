package HW3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BullsAndCows {

    private int[] secretNumber;
    private int attempts;
    private boolean gameWon;
    private List<String> history = new ArrayList<>();


    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Bulls and Cows game!");
        System.out.print("Enter game language (1 - English, 2 - Русский): ");
        int languageChoice = scanner.nextInt();
        scanner.nextLine();
        if (languageChoice == 2) {
            System.out.println("Выбран русский язык.");
        } else {
            System.out.println("English language selected.");
        }

        System.out.print("Enter number of digits in secret number: ");
        int numberLength = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter number of attempts: ");
        attempts = scanner.nextInt();
        scanner.nextLine();

        secretNumber = generateSecretNumber(numberLength);
        System.out.println("Secret number generated.");

        while (attempts > 0 && !gameWon) {
            System.out.print("Enter guess: ");
            String guessInput = scanner.nextLine();
            int[] guess = parseGuess(guessInput, numberLength);
            if (guess == null) {
                System.out.println("Invalid guess format. Please enter " + numberLength + " digits.");
                continue;
            }

            String result = checkGuess(guess);
            attempts--;
            history.add(Arrays.toString(guess) + " -> " + result);

            if (result.equals(numberLength + "B0C")) {
                gameWon = true;
                System.out.println("Congratulations, you have won in " + (history.size() - 1) + " turns!");
                System.out.print("Do you want to see the guessing history? (y/n) ");
                String showHistory = scanner.nextLine();
                if ("y".equalsIgnoreCase(showHistory)) {
                    System.out.println("Guess history:");
                    for (String move : history) {
                        System.out.println(move);
                    }
                }
            } else {
                System.out.println("Guess result: " + result);
                System.out.println("Attempts left: " + attempts);
            }
        }

        if (!gameWon) {
            System.out.println("Sorry, you have lost. The secret number was " + Arrays.toString(secretNumber));
        }

        scanner.close();
    }

    private int[] generateSecretNumber(int length) {
        Random random = new Random();
        int[] secretNumber = new int[length];
        for (int i = 0; i < length; i++) {
            secretNumber[i] = random.nextInt(10);
        }
        return secretNumber;
    }

    private int[] parseGuess(String guessInput, int length) {
        if (guessInput.length() != length) {
            return null;
        }

        int[] guess = new int[length];
        for (int i = 0; i < length; i++) {
            char c = guessInput.charAt(i);
            if (c < '0' || c > '9') {
                return null;
            }
            guess[i] = c - '0';
        }

        return guess;
    }

    private String checkGuess(int[] guess) {
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == secretNumber[i]) {
                bulls++;
            } else if (containsDigit(guess[i])) {
                cows++;
            }
        }

        return bulls + "B" + cows + "C";
    }

    private boolean containsDigit(int digit) {
        for (int n : secretNumber) {
            if (n == digit) {
                return true;
            }
        }
        return gameWon;
    }
}