import java.util.Scanner;
//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
// необходимо повторно запросить у пользователя ввод данных. В этом задании не используем try catch.
// Пишем регулярное выражение и используем на строке метод matches.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите дробное число: ");
        String input = scanner.next();
        String floatNumberPattern = "-?\\d+(\\.\\d+)?";

        while (!input.matches(floatNumberPattern)) {
            input = scanner.next();
        }
        System.out.println("Введенное число: " + input);
    }
}