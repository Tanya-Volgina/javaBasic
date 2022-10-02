import java.util.Scanner;

public class Main {
    private static String letters = "abсdefghijklmnopqrstuvwxyz";
    private static String separators = " |\\.|,|!|\\?|:|-|;";

    public static void main(String[] args) {
        String str = readString();

        String[] words = split(str);

        checkWords(words);
    }

    private static String readString() {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String text = in.nextLine();

        return text;
    }

    private static String[] split(String str) {
        String[] result = str.split(separators);

        return result;
    }

    private static void checkWords(String[] words) {
        int count = 0;
        for (String word : words) {
            if (checkWord(word)) {
                System.out.println(word);
                count++;
            }
        }

        System.out.println("Количество слов: " + count);
    }

    private static boolean checkWord(String word) {
        for (char letter : word.toLowerCase().toCharArray()) {
            if (letters.indexOf(letter) == -1) {
                return false;
            }
        }

        return true;
    }
}