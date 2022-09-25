import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = getLength(in);
        if (length <= 0) {
            System.out.println("Элементов в массиве должно быть более 0");
            return;
        }

        double[][] numbersArray = getNumbersArray(in, length);

        showArray(numbersArray);
    }

    private static int getLength(Scanner in) {
        System.out.println("Введите : ");
        int lines = in.nextInt();

        return lines;
    }

    private static double[][] getNumbersArray(Scanner in, int length) {
        double[][] array = new double[length][length];
        System.out.println("Заполните массив элементами: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = in.nextDouble();
            }
        }

        return array;
    }

    private static void showArray(double[][] numbersArray) {
        for (double number : numbersArray[0]) {
            System.out.println(number * 3 + " ");
        }
    }
}