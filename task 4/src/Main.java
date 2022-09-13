import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readNumbers();
    }

    public static void readNumbers() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите x ");
        double x = in.nextDouble();

        System.out.print("Введите y ");
        double y = in.nextDouble();

        System.out.print("Введите z ");
        double z = in.nextDouble();
        in.close();

        double avg = (x + y + z) / 3;
        System.out.println(avg);

        int b = (int) (avg / 2);

        if (b > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}

