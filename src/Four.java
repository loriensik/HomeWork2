import java.util.Random;
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        int attempt = 0;
        Random random = new Random();
        while (true) {
            attempt++;
            int a = random.nextInt(100);
            System.out.println("Попытка №"+attempt+". Число "+a);
            if (a == answer) {
                System.out.println("Количество попыток "+attempt);
                break;
            }
        }
    }
}
