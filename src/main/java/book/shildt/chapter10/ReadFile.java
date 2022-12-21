package book.shildt.chapter10;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class ReadFile {
    public static void main(String[] args) {
        File file = new File("FileForBytesRead.txt");
        char[] array;

        try (FileInputStream fis = new FileInputStream(file)) {

            int i = 0;
            int ch;
            array = new char[fis.available()];
            while ((ch = fis.read()) != -1) {
                array[i] = (char) ch;
                i++;
            }

            for (char c : array) {
                System.out.print(c);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
