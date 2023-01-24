package book.shildt.chapter10;

import java.io.*;

public class MarkAndResetInputStream {

    public static void main(String[] args) throws IOException {
        File file = new File("File1.txt");

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        System.out.println("Characters printed:");
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());


        bis.mark(0);
        System.out.println("mark() invoked");
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());

        System.out.println("Поддерживает ли BufferedInputStream методы mark() и reset()? " + bis.markSupported());
        bis.reset();
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());

        bis.reset();
        System.out.println("Повторный сброс");
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        bis.close();
    }
}
