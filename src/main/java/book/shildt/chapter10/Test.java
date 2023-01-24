package book.shildt.chapter10;

import java.io.*;


public class Test {
    public static void main(String[] args) {
        File file = new File("File1.txt");
        try (FileInputStream fileInputStream = new FileInputStream(file);
             Writer writer = new FileWriter(file)) {

            int i = fileInputStream.read();
            byte b = (byte) i;
            char c = (char) i;

            System.out.println(i);
            System.out.println(b);
            System.out.println(c);

            writer.write('q');
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
