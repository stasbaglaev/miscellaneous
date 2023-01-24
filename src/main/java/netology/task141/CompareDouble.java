package netology.task141;

import java.util.Scanner;

public class CompareDouble {
    public static void main(String[] args) {
        int choice;
        System.out.println("Операции над double/float:");
        System.out.println("\t1. Сравнить");
        System.out.println("\t2. Округлить");
        System.out.println("\t3. Отбросить дробную часть");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Выбрана операция 'Сравнение'. Введите числа с плавающей запятой разделенных клавишей Enter");
                compare(scanner.nextDouble(), scanner.nextFloat());
                break;
            case 2:
                System.out.println("Выбрана операция 'Округление'. Введите число с плавающей запятой");
                roundUp(scanner.nextDouble());
                break;
            case 3:
                System.out.println("Выбрана операция 'Отбросить дробную часть'. Введите число с плавающей запятой");
                discardFraction(scanner.nextDouble());
                break;
            default:
                System.out.println("Неверно указан номер операции");
                break;
        }
    }

    private static void compare(double d, float f) {
        System.out.printf("Число double %f и float %f равны? %b", d, f, (Double.compare(d, f) == 0));
    }

    private static void roundUp(double d) {
        System.out.printf("Число %f округлено до %d", d, Math.round(d));
    }

    private static void discardFraction(double d) {
        System.out.printf("Дробная часть числа %f отброшена, полученное число: %d", d, (long) d);
    }
}