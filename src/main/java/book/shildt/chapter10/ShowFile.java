package book.shildt.chapter10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ShowFile {

    public static void main(String[] args) throws IOException {
        int val;
        InputStream inputStream = new FileInputStream("C:\\Users\\Admin\\Desktop\\miscellaneous\\src\\main\\java\\book\\shildt\\сhapter10\\Text.txt");
        do {
            val = inputStream.read();
            System.out.write((char) val);
        }
        while (val != -1);
        inputStream.close();
    }
}
