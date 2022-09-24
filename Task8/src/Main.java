import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = readNumber();
        if (validate(n)) {
            System.out.println(calculateSum(n));
        }
    }

    private static int readNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое положительно число");
        int input = in.nextInt();

        return input;
    }

    private static boolean validate(int n) {
        if (n <= 0) {
            System.out.println("Число должно быть больше 0");
            return false;
        }

        return true;
    }

    private static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum = sum + i;
        }

        return sum;
    }
}