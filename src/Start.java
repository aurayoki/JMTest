import java.io.IOException;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) throws IOException {

        System.out.println("Калькулятор принимает арабские и римские числа");
        System.out.println("Используйте числа от 0 до 10 и от I до X включительно");
        System.out.println("Введите выражение:");

        try (Scanner sc = new Scanner(System.in)) {
            String result = new Calculator().calculate(sc.nextLine().trim().split(""));
            System.out.println(result);

        } catch (Exception e) {
            System.out.println("Введены неверные данные");
        }

    }

}
