import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double course = getCourse(in);
        double quantity = getQuantity(in);

        if (validate(course, quantity)) {
            getValue(course, quantity);
        }
    }

    private static double getCourse(Scanner in) {
        System.out.print("Введите текущий курс доллара: ");
        double course = in.nextDouble();

        return course;
    }

    private static double getQuantity(Scanner in) {
        System.out.print("Введите колличество рублей: ");
        double quantity = in.nextDouble();

        return quantity;
    }

    private static boolean validate(double course, double quantity) {
        if (course <= 0) {
            System.out.println("Введено не корректное значение курса");

            return false;
        } else if (quantity <= 0) {
            System.out.println("Введено не корректное значение количества");

            return false;
        }

        return true;
    }

    private static void getValue(double course, double quantity) {
        double value = quantity / course;
        System.out.printf("Итого: %.2f долларов", value);
    }
}