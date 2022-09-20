import java.util.Scanner;

public class Main {
    static int x = 3;
    static double y = 1.5;
    static int z = -3;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Задайте размер массива: ");
        int length = in.nextInt();
        if (length <= 0) {
            System.out.println("Элементов в массиве не может быть менее нуля");
            return;
        }

        double[] array = getArray(length, in);
        compareArray(array);
    }

    private static double[] getArray(int length, Scanner in) {
        double array[] = new double[length];

        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < length; i++) {
            array[i] = in.nextDouble();
        }

        return array;
    }

    private static void compareArray(double array[]){
        for (double element : array) {
            if (element == x || element == y || element == z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}



