import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = getLength(in);
        if (length <= 0) {
            System.out.println("Элементов в массиве должно быть более 0");
            return;
        }

        double[] numbers = getArray(length, in);

        double avg = calculateArray(numbers);
        System.out.println(avg);

        showArray(numbers, avg);
    }

    private static int getLength(Scanner in) {
        System.out.print("Введите длину массива: ");
        int size = in.nextInt();

        return size;
    }

    private static double[] getArray(int length, Scanner in) {

        double array[] = new double[length];
        System.out.println("Введите числа в массив");
        for (int i = 0; i < length; i++) {
            array[i] = in.nextDouble();
        }
        return array;
    }

    private static double calculateArray(double[] numbers) {
        double avg = 0;
        for (double number : numbers) {
            avg += number;
        }

        return avg / numbers.length;
    }

    private static void showArray(double[] numbers, double avg) {
        for (double number : numbers) {
            System.out.print(number * avg + " ");
        }
    }
}


