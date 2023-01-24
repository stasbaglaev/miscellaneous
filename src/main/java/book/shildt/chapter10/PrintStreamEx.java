package book.shildt.chapter10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamEx {

    public static void main(String[] args) {
        String str = "\nDa da da";
        File file = new File("Use PrintStream.txt");


        try (FileOutputStream fos = new FileOutputStream(file,true);
             PrintStream printStream = new PrintStream(fos)) {
            printStream.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
