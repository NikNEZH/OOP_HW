package HW3;
/**
 * Класс WordGenerator - генерирует случайное слово заданной длины
 */
public class WordGenerator {
    private String[] words_eng = {"apple", "banana", "cherry", "date", "elderberry", "fig", "grapefruit", 
                    "honeydew", "kiwi", "lime", "mango", "orange", "passionfruit", "quince", "raspberry", "strawberry", 
                    "tangerine", "ugli fruit", "vanilla bean", "watermelon", "yuzu", "zucchini"};

    private String[] words_rus = {"яблоко", "банан", "вишня", "финик", "бузина", "инжир", "грейпфрут",
    "падь", "киви", "лайм", "манго", "апельсин", "маракуйя", "айва", "малина", "клубника",
    "мандарин", "арбуз", "юзу", "кабачок"};

    public String generateWord(int length, int en_ru) {
        String word = "";
        if (en_ru == 0) {
            word = words_eng[(int) (Math.random() * words_eng.length)];
            while (word.length() != length) {
            word = words_eng[(int) (Math.random() * words_eng.length)];
            }
        } 
        if (en_ru == 1) {
            word = words_rus[(int) (Math.random() * words_rus.length)];
            while (word.length() != length) {
            word = words_rus[(int) (Math.random() * words_rus.length)];
            }
        }
        return word;
    }
}
