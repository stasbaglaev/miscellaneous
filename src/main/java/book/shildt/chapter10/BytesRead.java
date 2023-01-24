package book.shildt.chapter10;

import java.io.*;

public class BytesRead {
    public static void main(String[] args) {
        File file = new File("FileForBytesRead.txt");
        int ch;
        try (FileInputStream fis = new FileInputStream(file)) {
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
