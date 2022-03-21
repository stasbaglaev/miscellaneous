package tinkoff.date210322.task5;

import java.util.Arrays;

public class SwapNeighbours {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int count = fuctorial(arr.length);
        int max = arr.length - 1;
        System.out.println("Вариантов: " + count);
        int shift = max;
        while (count > 0) {
            int t = arr[shift];
            arr[shift] = arr[shift - 1];
            arr[shift - 1] = t;
            print(arr);
            count--;
            if (shift < 2) {
                shift = max;
            } else {
                shift--;
            }
        }
    }

    static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    static int fuctorial(int n) {
        return (n > 0) ? n * fuctorial(n - 1) : 1;
    }
}
