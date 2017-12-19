import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        while (scanner.hasNextInt()) {

            int a=scanner.nextInt();
            System.out.println("Введите второе целое число");
            int b = scanner.nextInt();
            int c = a+b;
            System.out.println("Сумма двух чисел a и b = "+c);
            return;
            }
        System.out.println("Вы ввели не целое число");
        }
}