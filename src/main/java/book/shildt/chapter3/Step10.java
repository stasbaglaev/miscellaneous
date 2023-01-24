package book.shildt.chapter3;

import java.io.IOException;

public class Step10 {

    public static void main(String[] args) throws IOException {
        char ch;
        int countChange = 0;

        System.out.println("Для остановки введите символ точки.");

        do {
            ch = (char) System.in.read();

            if (ch >= 'A' && ch <= 'Z') {
                ch += 32;
                countChange++;
                System.out.print(ch);
            } else if (ch >= 'a' && ch <= 'z') {
                ch -= 32;
                countChange++;
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }
        } while (ch != '.');
        System.out.println("\nКоличество символов для которых изменен регистр: " + countChange);
    }
}
