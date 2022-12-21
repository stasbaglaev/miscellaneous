package book.shildt.chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ShowFileMainArgs {

    public static void main(String[] args) {
        int val;

        if (args.length != 1) {
            System.out.println("Использование: java ShowFileMainArgs file");
            return;
        }
        try (InputStream inputStream = new FileInputStream(args[0])) {
            val = inputStream.read();
            while (val != -1) {
                System.out.print((char) val);
                val = inputStream.read();
            }
        } catch (FileNotFoundException exception) {
            System.out.println("Файл не найден!");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
