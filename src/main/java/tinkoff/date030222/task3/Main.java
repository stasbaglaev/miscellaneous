package tinkoff.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        int numberElements;
        List<Long> sequence = new LinkedList<>();

        do {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] numberElementsString = reader.readLine().split(" ");
            String[] sequenceString = reader.readLine().split(" ");

            List<Integer> list = new LinkedList<>();
            for (String string : numberElementsString) {
                list.add(Integer.valueOf(string));
            }
            numberElements = list.get(0);

            for (String string : sequenceString) {
                if (sequence.size() < numberElements) {
                    sequence.add(Long.valueOf(string));
                }
            }

        } while ((!((numberElements >= 1) && (numberElements <= Math.pow(10, 5)))));

        sequence.sort(Collections.reverseOrder());
        findValue(sequence);
    }

    static void findValue(List<Long> sequence) {
        /*Для полноценного решения задачи скорее всего нужно использовать рекурсивный метод.
        Не хватило времени довести решение задачи до ума. Изначально опирался на то, что
        Петин порядок будет отсортированным от большего значения к меньшему, а по факту, как я понял,
        он может сделать любой порядок из имеющейся последовательности.
         */

        int x = 1;
        while (Math.pow(x, 2) <= sequence.get(0)) {
            x++;
        }
        System.out.println(x);

        Iterator<Long> iterator = sequence.iterator();


        if (Math.pow(x, 2) <= sequence.get(0)){

        }
    }
}