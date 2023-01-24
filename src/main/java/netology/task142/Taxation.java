package netology.task142;

import java.util.Scanner;

public class Taxation {

    private static int earnings;
    private static int spending;

    public static void main(String[] args) {
        String input;
        do {
            System.out.println("\nВыберите операцию и введите её номер:");
            System.out.print("1. Добавить новый доход\n2. Добавить новый расход\n3. Выбрать систему налогообложения\n");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                input = scanner.next();
                int operation = Integer.parseInt(input);
                switch (operation) {
                    case 1:
                        System.out.println("Введите сумму дохода:");
                        setEarnings(scanner.nextInt());
                        break;
                    case 2:
                        System.out.println("Введите сумму расхода:");
                        setSpending(scanner.nextInt());
                        break;
                    case 3:
                        calculateTax();
                        break;
                    default:
                        System.out.println("Такой операции нет");
                }
                continue;
            }
            input = scanner.next();
        }
        while (!"end".equals(input));
        System.out.println("\nПрограмма завершена!");
    }

    private static void calculateTax() {
        int taxEar = taxEarnings();
        int taxEarMinusSpe = taxEarningsMinusSpending();
        boolean isLargeEar = taxEar > taxEarMinusSpe;
        System.out.printf("%nМы советуем вам %s", (isLargeEar ? "УСН доходы минус расходы" : "УСН доходы"));
        System.out.printf("%nВаш налог составит: %d рублей", (isLargeEar ? taxEarMinusSpe : taxEar));
        System.out.printf("%nНалог на другой системе: %d рублей", (isLargeEar ? taxEar : taxEarMinusSpe));
        System.out.printf("%nЭкономия: %d рублей %n", (isLargeEar ? taxEar - taxEarMinusSpe : taxEarMinusSpe - taxEar));
    }


    public static int taxEarnings() {
        return (earnings * 6) / 100;
    }

    public static int taxEarningsMinusSpending() {
        int tax = (((earnings - spending) * 15) / 100);
        return (tax >= 0) ? tax : 0;
    }

    public static void setEarnings(int earnings) {
        if (earnings < 0) {
            return;
        }
        Taxation.earnings += earnings;
    }

    public static void setSpending(int spending) {
        if (earnings < 0) {
            return;
        }
        Taxation.spending += spending;
    }
}
