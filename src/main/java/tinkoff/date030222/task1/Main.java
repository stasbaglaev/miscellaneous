package tinkoff.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    //не сделал проверку на то, вводится ли текст
    //не сделал проверку на то, вводится ли отрицательное число
    //не сделал проверку на то, вводится ли значение 0
    public static void main(String[] args) throws IOException {
        //System.out.println("\nВведите три целых числа через пробел");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = reader.readLine().split(" ");

        List<Integer> list = new LinkedList<>();
        for (String string : strings) {
            list.add(Integer.valueOf(string));
        }

        int A = list.get(0);
        int B = list.get(1);
        int n = list.get(2);

        testHypothesis(A, B, n);
    }

    static void testHypothesis(int A, int B, int n) {
        if (((A - B) % 2 == 0) && ((A - B) >= 2 * n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
