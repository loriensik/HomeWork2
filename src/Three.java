import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 8;
        int attempt = 5;
        while (true) {
            System.out.println("Отгадай загаданное число");
            int key = scanner.nextInt();
            if (key == 100) {
                System.out.println("Вы сдались, правильно число было "+answer);
                break;
            }
            if (key == answer) {
                System.out.println("Поздравляю, ты угадал число");
                break;
            }
            attempt--;
            System.out.println("У тебя осталось "+attempt+" попыток!");
            if (attempt == 3) {
                System.out.println("Введи 100 чтобы сдаться");
            }
        }
    }
}
