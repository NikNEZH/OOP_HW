package HW3;
/**
 * Класс GuessChecker - проверяет правильность введенного слова
 */
public class GuessChecker {
    private String targetWord;

    public GuessChecker(String targetWord) {
        this.targetWord = targetWord.toLowerCase();
    }

    public GuessResult checkGuess(String guessWord) {
        guessWord = guessWord.toLowerCase();
        int bullsCount = 0;
        int cowsCount = 0;

        for (int i = 0; i < guessWord.length(); i++) {
            char guessChar = guessWord.charAt(i);
            if (guessChar == targetWord.charAt(i)) {
                bullsCount++;
            } else if (targetWord.indexOf(guessChar) != -1) {
                cowsCount++;
            }
        }

        boolean isGameOver = false;
        if (bullsCount == targetWord.length()) {
            isGameOver = true;
        }

        return new GuessResult(bullsCount, cowsCount, isGameOver);
    }
}
