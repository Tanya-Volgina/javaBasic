import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readNumbers();
    }

    public static void readNumbers() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число ");
        double first = in.nextDouble();

        System.out.print("Введите второе число ");
        double second = in.nextDouble();

        System.out.print("Введите один из символов: +, -, *, / ");
        String symbol = in.next();

        in.close();

        calculate(first, second, symbol);
    }

    public static void calculate(double firstNumber, double secondNumber, String symbol) {
        switch (symbol) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            case "/":
                if (secondNumber == 0)
                    System.out.println("На ноль делить нельзя!");
                else
                    System.out.println(firstNumber / secondNumber);
                break;
            default:
                System.out.println("Неизвестный символ");
                break;
        }
    }
}