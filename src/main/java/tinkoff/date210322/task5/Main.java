package tinkoff.date210322.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        byte n;
        short k;

        do {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            n = Byte.parseByte(reader.readLine());
            k = Short.parseShort(reader.readLine());
        } while ((!(n >= 1 && n <= 10)) && (!(k >= 2 && k <= 1000)));

        Integer[] array = new Integer[n];

        permutationArray(array,k);

     }

    static void permutationArray(Integer[] array, short k) {
        fillArray(array);
        int count = factorial(array.length);
        int max = array.length - 1;
        //System.out.println("Вариантов: " + count);
        int shift = max;
        while (count > 0) {
            int t = array[shift];
            array[shift] = array[shift - 1];
            array[shift - 1] = t;
            findBeautyPermutation(array, k);
            count--;
            if (shift < 2) {
                shift = max;
            } else {
                shift--;
            }
        }
    }

    static void fillArray(Integer[] array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            j++;
            array[i] = j;
            //System.out.println(array[i]);
        }
    }

    static int factorial(int n) {
        return (n > 0) ? n * factorial(n - 1) : 1;
    }

    static void findBeautyPermutation(Integer[] array, short k) {
        List<Integer> listValueBeautyPermutation = new LinkedList<>();
        byte numberPermutations = 0;
        int j = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            j++;
            sum = sum + array[i] * j;
        }
        listValueBeautyPermutation.add(sum);
        Iterator<Integer> listIterator = listValueBeautyPermutation.iterator();
        while (listIterator.hasNext()) {
            if (listIterator.next() % k == 0) {
                numberPermutations++;
            }
        }
        System.out.println("ew " + numberPermutations);
    }






}