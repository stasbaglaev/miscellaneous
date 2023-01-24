package book.shildt.chapter10.compared;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class CompareFiles {

    public static void main(String[] args) {
        int val1;
        int val2;
        int column = 1;
        int line = 1;
        byte[] buffer1 = new byte[100];
        byte[] buffer2 = new byte[100];

        if (args.length != 2) {
            System.out.println("Использование: java CompareFiles File1 File2 CaseSensitive");
            return;
        }


        try (InputStream fileInputStream1 = new FileInputStream(args[0]);
             InputStream fileInputStream2 = new FileInputStream(args[1])) {

            if (fileInputStream1.available() != fileInputStream2.available()) {
                System.out.println("Файлы разные!");
                return;
            }

            do {
                val1 = fileInputStream1.read(buffer1);
                val2 = fileInputStream2.read(buffer2);


                for (int i = 0; i < buffer1.length; i++, column++) {
                    if (buffer1[i] == 13 && buffer1[i + 1] == 10) {
                        line++;
                        column = -1;
                    }

                    if (buffer1[i] != buffer2[i]) {
                        System.out.print("Файлы разные! ");
                        System.out.println("Первая пара отличающихся символов находится на строке: " + line + ", в колонке: " + column);
                        return;
                    }
                }
            } while (val1 != -1 || val2 != -1);
            System.out.println("Файлы одинаковые!");
        } catch (FileNotFoundException exception) {
            System.out.println("Файл не найден!");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}