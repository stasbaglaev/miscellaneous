package book.shildt.chapter10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AvgNums {

    public static void main(String[] args) throws IOException {
        int amount;
        double sum = 0.0;
        double average;
        System.out.println("Укажите количество подлежащих обработке числовых значений:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            amount = Integer.parseInt(bufferedReader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Введен неверный формат");
            amount = 0;
        }

        System.out.println("Ввод " + amount + " значений:");
        for (int i = 0; i < amount; i++) {
            try {
                sum += Double.parseDouble(bufferedReader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Введен неверный формат");
                sum += 0;
            }
        }
        average = sum / amount;
        System.out.println("Среднее арифметическое значение введенных чисел равно: " + average);

    }
}
