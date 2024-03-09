import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int randomNum = new Random().nextInt(11);

        System.out.println("Відгадайте рандомне число в межах від 0 до 10. Ви маєте 3 спроби.");

        int attempts = 3;
        for (int attempt = 1; attempts >= attempt; attempt++) {
            System.out.print(attempt + " спроба: ");
            int guessNum = keyboard.nextInt();

            if (guessNum == randomNum) {
                System.out.println("Ви відгадали рандомне число. Вітаю!");
                break;
            } else if (attempt < attempts) {
                System.out.println("Неправильно! Спробуйте ще раз.");
            } else
            {
                System.out.println("На жаль, ви не відгадали. Рандомне число було: " + randomNum);
            }
        }

        keyboard.close();
    }
}
