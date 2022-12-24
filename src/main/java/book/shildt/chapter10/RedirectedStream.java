package book.shildt.chapter10;
/*
    Программа записывает строку "str" в переменную System.out, которая
    представляет поток PrintStream. Причем поток представляющий
    переменной System.out перенаправлен с консоли в файл "file".
 */
import java.io.*;

public class RedirectedStream {
    public static void main(String[] args) {
        File file = new File("FileForRedirectedStream.txt");
        String str = "Magic";
        try (FileOutputStream fis = new FileOutputStream(file);
             PrintStream ps = new PrintStream(fis)) {
            System.setOut(ps);
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
