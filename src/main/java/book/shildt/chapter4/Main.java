package book.shildt.chapter4;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        int x = 1;
        int y = 128;

        //System.out.println(x&y);

        String str = " ";

        char[] ch = new char[2];

        System.out.println(Arrays.toString(ch));

        System.out.println( ch[0]);


        char chars = (char) System.in.read();
        System.out.println(chars);

    }

}
