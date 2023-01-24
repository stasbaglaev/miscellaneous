package book.shildt.chapter10;

/*
    Программа считывает все байты из указанного
    входного потока, а затем выводит на консоль.
    Также на косноль выводится количество считанных байтов
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class ReadAllBytes {
    public static void main(String[] args) throws IOException {
        File file = new File("File1.txt");
        byte[] bytes;
        FileInputStream fis = new FileInputStream(file);
        bytes = fis.readAllBytes();
        System.out.println(bytes.length);

        for (byte b : bytes) {
            System.out.print((char) b);
        }

        bytes = fis.readAllBytes();
        System.out.println("\n" + bytes.length);
        fis.close();
    }
}
