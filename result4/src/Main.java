import org.w3c.dom.Text;

import java.util.Scanner;

public class Main {
    private static int attempt = 3;
    private static Riddle riddle = new Riddle() {{
        Text = "Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает";
        Answer = "Заархивированный вирус";
        Clue = "З.............ый в...с";
    }};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(riddle.Text);
        while (attempt > 0) {
            String input = getInput(in);

            if (input.equalsIgnoreCase(riddle.Answer)) {
                System.out.println("Правильно!");
                return;
            } else if (input.equalsIgnoreCase("Подсказка")) {
                showClue();
            } else if (attempt > 1) {
                System.out.println("Подумай еще!");
                attempt--;
            } else {
                System.out.println("Обидно, приходи в другой раз");
                attempt--;
            }
        }
    }

    private static String getInput(Scanner in) {
        System.out.print("> ");
        String input = in.nextLine();

        return input;
    }

    private static void showClue() {
        if (attempt == 3) {
            System.out.println(riddle.Clue);
            attempt = 1;
        } else {
            System.out.println("Подсказка уже недоступна");
        }
    }
}

