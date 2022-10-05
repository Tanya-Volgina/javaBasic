import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = getString();

        char[] symbols = str.toCharArray();
        if (validate(symbols)) {
            calculate(symbols);
        }
    }

    private static String getString() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите уравнение: ");
        String str = in.nextLine();

        return str;
    }

    private static void calculate(char[] symbols) {
        int number;
        if (symbols[1] == '+') {
            number = Character.isAlphabetic(symbols[0])
                    ? subtract(symbols[4], symbols[2])
                    : subtract(symbols[4], symbols[0]);
        } else if (symbols[1] == '-') {
            number = Character.isAlphabetic(symbols[0])
                    ? add(symbols[2], symbols[4])
                    : subtract(symbols[0], symbols[4]);
        } else {
            System.out.println("Некорректный знак");

            return;
        }

        System.out.println(number);
    }

    public static boolean validate(char[] symbols) {
        if (symbols.length != 5) {
            System.out.println("Введена неверная длина строки");

            return false;
        } else if (symbols[3] != '=') {
            System.out.println("Отсутствует знак равно");

            return false;
        } else if (symbols[1] != '-' && symbols[1] != '+') {
            System.out.println("Неверный арифметический знак");

            return false;
        } else if (!checkStructure(symbols[0], symbols[2])) {
            System.out.println("Задана некорректная структура уравнения");

            return false;
        } else if (!Character.isDigit(symbols[4])) {
            System.out.println("Некорретный символ");

            return false;
        }

        return true;
    }

    private static boolean checkStructure(char first, char second) {
        return Character.isAlphabetic(first) && Character.isDigit(second)
                || Character.isDigit(first) && Character.isAlphabetic(second);
    }

    private static int subtract(char first, char second) {
        return Character.getNumericValue(first) - Character.getNumericValue(second);
    }

    private static int add(char first, char second) {
        return Character.getNumericValue(first) + Character.getNumericValue(second);
    }
}
