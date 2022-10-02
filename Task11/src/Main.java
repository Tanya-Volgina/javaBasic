import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String number = getFirstNumber(in);
        int firstNumber = Integer.parseInt(number);

        int secondNumber = getSecondNumber(in);

        compareNumber(firstNumber, secondNumber);
    }

    private static String getFirstNumber(Scanner in) {
        System.out.println("Введите первое число: ");
        int firstNumber = in.nextInt();

        String number = Integer.toString(firstNumber);
        return number;
    }

    private static int getSecondNumber(Scanner in) {
        System.out.println("Введите второе число: ");
        int secondNumber = in.nextInt();

        return secondNumber;
    }

    private static void compareNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            show(firstNumber, secondNumber);
        } else if (firstNumber < secondNumber) {
            show(secondNumber, firstNumber);
        } else {
            System.out.println("Числа равны");
        }
    }

    private static void show(int max, int min) {
        System.out.println("большее число: " + max + "; меньшее число: " + (double) min);
    }
}








