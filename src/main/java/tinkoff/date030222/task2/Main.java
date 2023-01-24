package tinkoff.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        long n;
        long m;

        do {
            //System.out.println("\nВведите два целых числа через запятую");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] strings = reader.readLine().split(" ");

            List<Long> list = new LinkedList<>();
            for (String string : strings) {
                list.add(Long.valueOf(string));
            }

            n = list.get(0);
            m = list.get(1);

        } while ((!((n >= 1) && (n <= Math.pow(10, 18)))) || (!((m >= 1) && (m <= Math.pow(10, 18)))));

        calculateNumberBuckets(n, m);
    }

    static void calculateNumberBuckets(long n, long m) {
        int buckets = 1;
        while (n != m) {
            if (n > m) {
                n = n - m;
            } else {
                m = m - n;
            }
            buckets++;
        }
        System.out.println("\n" + buckets);
    }
}