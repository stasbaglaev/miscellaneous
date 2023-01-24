package book.shildt.chapter3;

import java.io.IOException;

public class InputKey {

    public static void main(String[] args) throws IOException {

        char ch;
        int countSpace = 0;

        do {
            ch = (char) System.in.read();
            System.out.println(ch);

            if (ch == ' ') {
                countSpace++;
            }
        }
        while (ch != '.');

        System.out.println("Количество пробелов: " + countSpace);
    }

}
