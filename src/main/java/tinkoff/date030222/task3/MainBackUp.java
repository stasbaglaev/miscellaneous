package tinkoff.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainBackUp {
    public static void main(String[] args) throws IOException {
        int NumberElements;
        List<Long> sequence = new LinkedList<>();
        do {
            System.out.println("\nВведите число элементов в множестве");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] strings = reader.readLine().split(" ");

            System.out.println("\nВведите последовательность");
            BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
            String[] strings2 = reader.readLine().split(" ");

            List<Integer> list = new LinkedList<>();
            for (String string : strings) {
                list.add(Integer.valueOf(string));
            }
            NumberElements = list.get(0);


            sequence = new LinkedList<>();
            for (String string : strings2) {
                if (sequence.size() < NumberElements) {
                    sequence.add(Long.valueOf(string));
                }
            }

        } while ((!((NumberElements >= 1) && (NumberElements <= Math.pow(10, 5)))));
        // } while ((!((NumberElements >= 1) && (NumberElements <= Math.pow(10, 5)))) || (!((m >= 1) && (m <= Math.pow(10, 18)))));

        sequence.sort(Collections.reverseOrder());
        findValue(sequence);
    }

    static void findValue(List<Long> sequence) {
        int x = 1;
        while (Math.pow(x, 2) <= sequence.get(0)){
            x++;
        }
        System.out.println(x);


    }

}