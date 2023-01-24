package tinkoff.date210322.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        byte n;

        do {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            n = Byte.parseByte(reader.readLine());
        } while (!(n >= 1 && n <= 100));

        String[][] strings = new String[n][n];

        //System.out.println(n);

        fillInA(strings);
        fillInB(strings, n);
        fillInC(strings, n);

        print(strings, n);
    }

    static void print(String[][] strings, byte n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(strings[i][j]);
            }
            System.out.println();
        }
    }

    static void fillInA(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = "a";
            array[array.length - 1 - i][i] = "a";
        }
    }

    static void fillInB(String[][] array, byte n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ("a".equals(array[i][j])) {
                    modifyCell(array, i, j + 1);
                    modifyCell(array, i, j - 1);
                }
            }
        }
    }

    static void modifyCell(String[][] array, int i, int j) {
        if (0 <= i && i < array.length && 0 <= j && j < array[i].length) {
            array[i][j] = "b";
        }
    }

    static void fillInC(String[][] array, byte n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!("a".equals(array[i][j])) && (!"b".equals(array[i][j]))) {
                    array[i][j] = "c";
                }
            }
        }
    }
}