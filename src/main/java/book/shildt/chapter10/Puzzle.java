package book.shildt.chapter10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Puzzle {
    //загадка
    private static final String COMMAND_STOP = "Stop";
    private static final String CORRECT_ANSWER = "Nice";

    public static void main(String[] args) throws IOException {
        String answer;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Загадка. Как дела?");
            answer = bf.readLine();
        } while (!(CORRECT_ANSWER.equalsIgnoreCase(answer) || COMMAND_STOP.equalsIgnoreCase(answer)));
        bf.close();
        System.out.println(CORRECT_ANSWER.equalsIgnoreCase(answer) ? "Красавчик" : "Слабак");
    }
}
