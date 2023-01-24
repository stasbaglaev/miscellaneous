package tinkoff.date210322.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        long N;

        do {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            N = Long.parseLong(reader.readLine());
        } while (!(N >= 1 && N <= Math.pow(10, 12)));

        //System.out.println(N);

        System.out.println(devide(N));

    }

    static byte devide(long N) {
        if (N % 10 == 0) {
            byte i = 1;
            devide(N / 10);
            i++;
            return i;
        }
        return 0;
    }
}