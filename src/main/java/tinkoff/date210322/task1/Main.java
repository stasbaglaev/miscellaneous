package tinkoff.date210322.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        short A;
        short B;
        short N;
        short maxA;
        short minB;

        do {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            A = Short.parseShort(reader.readLine());
            B = Short.parseShort(reader.readLine());
            N = Short.parseShort(reader.readLine());
        } while (!(A >= 0 && A <= Math.pow(10, 4)) || (!(B >= 0 && B <= Math.pow(10, 4))) || (!(N >= 1 && N <= Math.pow(10, 4))));

        maxA = A;
        minB = (short) (Math.floor(B / N) + 1);

//        System.out.println(A);
//        System.out.println(B);
//        System.out.println(N);
//        System.out.println(maxA);
//        System.out.println(minB);

        if (maxA > minB) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}