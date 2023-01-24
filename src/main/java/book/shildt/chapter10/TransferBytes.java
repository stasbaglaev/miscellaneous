package book.shildt.chapter10;
/*
 Программа считывает байты из указанного файла,
 и перенаправляет их в выходной поток, в данном
 случае в System.out, т.е. на консоль, т.к. System.out
 по умолчанию связана с консолью
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class TransferBytes {
    public static void main(String[] args) {
        File file = new File("File1.txt");
        try (FileInputStream fis = new FileInputStream(file)) {
            fis.transferTo(System.out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
