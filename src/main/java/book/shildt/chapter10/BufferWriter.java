package book.shildt.chapter10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {
    public static void main(String[] args) {
        File file = new File("TextBuffer.txt");
        String text = "Текст для записи в файл!";
        try (BufferedWriter bf = new BufferedWriter(new FileWriter(file))) {
            bf.write(text);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
