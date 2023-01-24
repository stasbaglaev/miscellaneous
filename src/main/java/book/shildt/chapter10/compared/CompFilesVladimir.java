package book.shildt.chapter10.compared;

import java.io.*;

public class CompFilesVladimir {
    public static void main(String[] args) {
        int i = 0, j = 0;
        int count = 0;
        // Прежде всего необходимо убедиться в том, что программе
        // передаются имена обоих файлов
        if (args.length != 2) {
            System.out.println("Использование: CompFiles файл1 файл2");
            return;
        }
        // Сравнение файлов
        try (FileInputStream f1 = new FileInputStream(args[0]);
             FileInputStream f2 = new FileInputStream(args[1])) {
            // Проверка содержимого каждого файла

            do {
                count++;
                i = f1.read();
                j = f2.read();


                if (i != j) {
                    if (i >= 65 & i <= 122 & j >= 65 & j <= 122 & ((i - 32 == j) | (i + 32 == j))) {
                        System.out.println("Элементы " + count + " отличаются только регистром");
                    } else {
                        System.out.println("Элементы с номером : " + count + " отличаются");
                        break;
                    }
                }


            }
            while (i != -1 && j != -1);
            if (i != j)
                System.out.println("Содержимое файлов отличается");
            else
                System.out.println("Содержимое файлов совпадает");
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }

    }
}