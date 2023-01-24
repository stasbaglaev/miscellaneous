package dataart.test210921;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Есть два отсортированных по возрастанию массива.
        //Объедините их в один отсортированный по возрастанию массив.
        int[] m1 = {7, 5, 9, 10, 6};
        int[] m2 = {0, 6, 7};
        int[] m3 = new int[m1.length + m2.length];
        System.arraycopy(m1, 0, m3, 0, m1.length);
        System.arraycopy(m2, 0, m3, m1.length, m2.length);
        Arrays.sort(m3);
        System.out.println("Массив m3: " + Arrays.toString(m3));

        System.out.println("---------------");
        //Дан массив из чисел. Найти min и max
        int[] a1 = {7, 5, 9, 10, 6};
        Arrays.sort(a1);
        int min = a1[0];
        int max = a1[a1.length - 1];
        System.out.println("min: " + min + ", max: " + max);

        System.out.println("---------------");
        //метод постепенно приводит элементы массива к значениям равным переменной temp
        int[] array1 = {7, 5, 9, 10, 6};
        System.out.println("Исходный массив array1: " + Arrays.toString(array1));
        make(array1);
    }

    static void make(int[] array) {
        boolean flag = false;
        int temp = 0;
        while (!flag) {
            flag = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = false;
                }
            }
        }
        System.out.println("Измененный массив array1: " + Arrays.toString(array));
    }
}
