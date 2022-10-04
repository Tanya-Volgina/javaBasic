import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int quantity = in.nextInt();
        if (quantity <= 0){
            System.out.println("Введено не верное количество строк");
            return;
        }

        String[] strings = getStrings(in, quantity);
        int[] counts = countLetters(strings);
        int max = findMax(counts);
        showLine(strings, counts, max);
    }

    private static String[] getStrings(Scanner in, int quantity) {
        String strArray[] = new String[quantity];
        System.out.println("Введите строки");
        for (int i = 0; i < quantity; i++) {
            System.out.print(i + 1 + " строка: ");
            strArray[i] = in.next();
        }

        return strArray;
    }

    private static int[] countLetters(String[] lines) {
        int counts[] = new int[lines.length];
        for (int i = 0; i < lines.length; i++) {
            HashSet<Character> uniqueLetters = new HashSet<Character>();
            for (char letter : lines[i].toLowerCase().toCharArray()) {
                uniqueLetters.add(letter);
            }

            counts[i] = uniqueLetters.size();
        }

        return counts;
    }

    private static int findMax(int[] counts) {
        int max = counts[0];
        for (int i = 1; i < counts.length; i++) {
            if (max < counts[i]){
                max = counts[i];
            }
        }

        return max;
    }

    private static void showLine(String[] strings, int[] counts, int max){
        for (int i = 0 ; i < counts.length; i++){
            if (counts[i] == max){
                System.out.println("max = " + max);
                System.out.println(strings[i]);
                break;
            }
        }
    }
}