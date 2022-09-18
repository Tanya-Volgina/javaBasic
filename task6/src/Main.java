import java.util.Scanner;

public class Main {
    private static final double kilo = 1;
    private static final double ton = 0.001;
    private static final double center = 0.01;
    private static final double pound = 2.20462;
    private static final double meter = 1;
    private static final double mile = 0.000621371;
    private static final double yard = 1.09361;
    private static final double foot = 3.28084;

    public static void main(String[] args) {
        calculate();
    }

    private static void calculate() {
        Scanner in = new Scanner(System.in);

        System.out.print("Ввести: 1 - масса, 2 - расстояние ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                calculateMass(in);
                break;
            case 2:
                calculateDistance(in);
                break;
            default:
                System.out.println("Неизвестный ввод");
                break;
        }

        in.close();
    }

    private static void calculateMass(Scanner in) {
        System.out.print("Выберите единицу измерения: 1 - киллограмм, 2 - тонна, 3 - центнер, 4 - фунт ");
        int unit = in.nextInt();

        System.out.print("Введите число ");
        double number = in.nextDouble();

        if (unit == 1) {
            showMassResult(number, number * ton, number * center, number * pound);
        } else if (unit == 2) {
            showMassResult(kilo / ton * number, number, center / ton * number, pound / ton * number);
        } else if (unit == 3) {
            showMassResult(kilo / center * number, ton / center * number, number, pound / center);
        } else if (unit == 4) {
            showMassResult(kilo / pound * number, ton / pound * number, center / pound * number, number);
        } else {
            System.out.println("Неизвестная единица измерения");
        }
    }

    private static void calculateDistance(Scanner in) {
        System.out.print("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут ");
        int unit = in.nextInt();

        System.out.print("Введите число ");
        double number = in.nextDouble();

        if (unit == 1) {
            showDistanceResult(number, number * mile, number * yard, number * foot);
        } else if (unit == 2) {
            showDistanceResult(meter / mile * number, number, mile / yard * number, foot / mile * number);
        } else if (unit == 3) {
            showDistanceResult(meter / yard * number, mile / yard * number, number, foot / yard * number);
        } else if (unit == 4) {
            showDistanceResult(meter / foot * number, mile / foot * number, foot / yard * number, number);
        } else {
            System.out.println("Неизвестная единица измерения");
        }
    }

    private static void showDistanceResult(double meters, double miles, double yards, double foots) {
        System.out.println("метры: " + meters + ", мили: " + miles + ", ярды: " + yards + ", футы: " + foots);
    }

    private static void showMassResult(double kilo, double ton, double center, double pound) {
        System.out.println("киллограммы: " + kilo + ", тонны: " + ton + ", центнеры: " + center + ", фунты: " + pound);
    }
}