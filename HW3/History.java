package HW3;
/**
 * Класс History - хранит историю ходов и результатов проверки
 */
import java.util.ArrayList;
import java.util.List;

public class History {
    private List<String> guessWords = new ArrayList<>();
    private List<Integer> bullsCounts = new ArrayList<>();
    private List<Integer> cowsCounts = new ArrayList<>();

    public void add(String guessWord, int bulls, int cows) {
        guessWords.add(guessWord.toLowerCase());
        bullsCounts.add(bulls);
        cowsCounts.add(cows);
    }

    public String getHistoryString() {
        StringBuilder historyString = new StringBuilder();
        int historySize = guessWords.size();

        for (int i = 0; i < historySize; i++) {
            historyString.append(String.format("%s - %d быков, %d коров\n", guessWords.get(i), bullsCounts.get(i), cowsCounts.get(i)));
        }

        return historyString.toString();
    }
}
