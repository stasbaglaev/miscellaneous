package book.shildt.chapter3;

import java.io.IOException;

public class GameGuess {

    public static void main(String[] args) throws IOException {

        char ch, ignore, answer = 'K';

        do {
            System.out.println("Задумана буква из диапазона A-Z.");
            System.out.print("Попытайтесь ее угадать: ");

            // Получение символа с клавиатуры
            ch = (char) System.in.read();
            System.out.println("Введена буква: " + ch);
            // Отбрасывание всех остальных символов во входном буфере
            do {
                ignore = (char) System.in.read();
            } while(ignore != '\n');
            if (ch == answer) System.out.println("** Правильно! **");
            else {
                System.out.print("...Извините, нужная буква находится ");
                if (ch < answer) System.out.println("ближе к концу алфавита");
                else System.out.println("ближе к началу алфавита");
                System.out.println("Повторите попытку!\n");
            }
        } while (answer != ch);


    }
}
