package book.shildt.chapter10;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) {
        double[] data = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
        File file = new File("FileRandomAccess.txt");

        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw")) {
            for (int i = 0; i < data.length; i++) {
                randomAccessFile.writeDouble(data[i]);
            }
            System.out.printf("Длина файла: %d %n", randomAccessFile.length());

            // Считывание отдельных значений из файла
            randomAccessFile.seek(0);

            System.out.println("Первое значение: " + randomAccessFile.readDouble());

            randomAccessFile.seek(8);
            System.out.println("Второе значение: " + randomAccessFile.readDouble());

            randomAccessFile.seek(8 * 3);
            System.out.println("Четвертое значение: " + randomAccessFile.readDouble());

            // Прочитать значения через одно
            System.out.println();
            System.out.println("Чтение значений с нечетными порядковыми номерами: ");
            for (int i = 0; i < data.length; i += 2) {
                randomAccessFile.seek(8 * i);
                System.out.print(randomAccessFile.readDouble() + " ");
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
