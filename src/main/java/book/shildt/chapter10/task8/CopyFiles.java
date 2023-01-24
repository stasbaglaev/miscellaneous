package book.shildt.chapter10.task8;

import java.io.*;

public class CopyFiles {

    private static final byte space = 32;
    private static final byte hyphen = 45;

    public static void main(String[] args) {
        File fileIn = new File("FileInTask7.txt");
        File fileOut = new File("FileOutTask7.txt");
        int ch;

        try (BufferedReader br = new BufferedReader(new FileReader(fileIn));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut))) {
            while ((ch = br.read()) != -1) {
                if (ch == space) {
                    bw.write(hyphen);
                    continue;
                }
                bw.write(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
