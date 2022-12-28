package book.shildt.chapter10.task7;

import java.io.*;

public class CopyFiles {

    private static final byte space = 32;
    private static final byte hyphen = 45;

    public static void main(String[] args) {

        File fileIn = new File("FileInTask7.txt");
        File fileOut = new File("FileOutTask7.txt");
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        int ch;

        try {
            bis = new BufferedInputStream(new FileInputStream(fileIn));
            bos = new BufferedOutputStream(new FileOutputStream(fileOut));

            while ((ch = bis.read()) != -1) {
                if (ch == space) {
                    bos.write(hyphen);
                    continue;
                }
                bos.write(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bis != null) {
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}