package book.shildt.chapter3;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class InputWithKey {

    public static void main (String[] args) throws IOException {

      // для считывания одного (первого введенного) символа
        /*char ch;
        ch =  (char) System.in.read();
        System.out.println(ch);
        */

        // для считывания всей введенной строки c помощью цикла while
        char ch;

        do{
            ch = (char) System.in.read();
            System.out.println(ch);
        }
        while (ch != '\r');


        // для считывания всей введенной строки c помощью объекта класса Scanner
       /*
        Scanner scanner = new Scanner(System.in);
        String str;
        str = scanner.nextLine();

        System.out.println(str);

        */
    }
}
