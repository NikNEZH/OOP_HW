package HW3;
/**
 * Класс GuessResult - содержит результат проверки угаданного слова (быки, коровы)
 *  и информацию о выигрыше/продолжении игры
 */
public class GuessResult {
    private int bulls;
    private int cows;
    private boolean isGameOver;

    public GuessResult(int bulls, int cows, boolean isGameOver) {
        this.bulls = bulls;
        this.cows = cows;
        this.isGameOver = isGameOver;
    }

    public int getBulls() {
        return bulls;
    }

    public int getCows() {
        return cows;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public String getResultString() {
        return bulls + " быков, " + cows + " коров";
    }
}
