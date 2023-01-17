package netology.task132;

import java.time.Year;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int numCorrectAns = 0;
        boolean isCorrect = true;
        boolean isLeap;
        do {
            System.out.println("Введите год в формате: уууу количество дней");
            Scanner scanner = new Scanner(System.in);
            int year = scanner.nextInt();
            int numberDays = scanner.nextInt();
            isLeap = Year.isLeap(year);
            if (((isLeap) && (numberDays == 366)) || (!(isLeap) && (numberDays == 365))) {
                numCorrectAns++;
            } else {
                isCorrect = false;
                System.out.printf("Правильный ответ: в %d году %d дней!%n", year, (isLeap ? 366 : 365));
            }
        } while (isCorrect);
        System.out.println("Количество верных ответов: " + numCorrectAns);
    }
}