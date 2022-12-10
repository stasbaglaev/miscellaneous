package book.shildt.chapter9;

import java.io.IOException;

public class KeywordThrows {

    public static char promt(String str) throws IOException {
        System.out.println(str + ": ");
        return (char) System.in.read();
    }
    // первый вариант использования метода "promt", который бросает исключение IOException
//    public static void main(String[] args) throws IOException {
//        char ch;
//        ch = promt("Введите букву");
//        System.out.println("Вы нажали клавишу " + ch);
//    }

    // второй вариант использования метода "promt", который бросает исключение IOException
    public static void main(String[] args) {
        char ch;

        try {
            ch = promt("Введите букву");
        } catch (IOException exception) {
            System.out.println("Произошло исключение ввода/вывода");
            ch = 'X';
        }
        System.out.println("Вы нажали клавишу " + ch);
    }

}
