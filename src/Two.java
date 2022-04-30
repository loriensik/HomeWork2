import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        if (month >= 1 && month <= 12) {
            int day = scanner.nextInt();
            if (day >= 1 && day <= 31) {
                if (month == 2 && day >= 28) {
                    System.out.println("В феврале не может быть больше 28 дня");
                } else {
                    if (month == 4 || month == 6 || month == 9 || month == 11){
                        if (day > 30) {
                            System.out.println("В месяце не может быть больше, чем 30 дней");
                        }
                    } else System.out.println("День существует");
                }
            } System.out.println("В месяце не может быть больше, чем 31 день");
        }
    }
}