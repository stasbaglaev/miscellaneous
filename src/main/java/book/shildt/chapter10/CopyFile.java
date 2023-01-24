package book.shildt.chapter10;

import javax.sound.sampled.AudioInputStream;
import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        int val;
        byte[] buffer = new byte[4096];
        if (args.length != 2) {
            System.out.println("Копирование одного файла в другой. Использование: java CopyFile file1 file2");
            return;
        }
        try (InputStream inputStream = new FileInputStream(args[0]);
             OutputStream outputStream = new FileOutputStream(args[1])) {
            val = inputStream.read(buffer, 0, buffer.length);
            while (val != -1) {
                outputStream.write(buffer, 0, val);
                val = inputStream.read(buffer, 0, buffer.length);
            }
        } catch (FileNotFoundException exception) {
            System.out.println("Один из файлов не найден!");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
