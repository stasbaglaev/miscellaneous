package book.shildt.chapter5;

public class Task13 {

    public static void main(String[] args) {
        int[] num = new int[10];
        int min;
        int max;

        num[0] = 99;
        num[1] = -10;
        num[2] = 100123;
        num[3] = 18;
        num[4] = -978;
        num[5] = 5623;
        num[6] = 463;
        num[7] = -9;
        num[8] = 287;
        num[9] = 49;

        min = max = num[0];
        for (int element : num) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }
        System.out.println("min и max: " + min + " " + max);
    }
}