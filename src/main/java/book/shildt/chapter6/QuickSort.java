package book.shildt.chapter6;

import java.util.Arrays;

public class QuickSort {
    // Вызов фактического метода быстрой сортировки
    static void qSort(char[] items) {
        qs(items, 0, items.length - 1);
    }

    // Рекурсивная версия метода быстрой сортировки символов
    private static void qs(char[] items, int left, int right) {
        int leftIndex = left;
        int rightIndex = right;
        char pivot;                 // Компаранд - элемент с помощью которого производится сравнение элементов в массиве

        pivot = items[(left + right) / 2]; // компаранд является элементом находящимся в середине массива
        System.out.println(pivot);
        do {
            while ((items[leftIndex] < pivot) && (leftIndex < right)) {
                leftIndex++;
            }
            while ((pivot < items[rightIndex]) && (rightIndex > left)) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(items, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
            System.out.println(Arrays.toString(items));
        } while (leftIndex <= rightIndex);
        if (left < rightIndex) {
            qs(items, left, rightIndex);
        }
        if (leftIndex < right) {
            qs(items, leftIndex, right);
        }
    }

    private static void swap(char[] items, int indexL, int indexR) {
        char temp = items[indexL];
        items[indexL] = items[indexR];
        items[indexR] = temp;
    }
}

class QSDemo {
    public static void main(String args[]) {
        char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
        int i;
        System.out.print("Исходный массив: ");
        for (i = 0; i < a.length; i++)
            System.out.print(a[i]);
        System.out.println();
        // Сортировка массива
        QuickSort.qSort(a);
        System.out.print("Отсортированный массив: ");
        for (i = 0; i < a.length; i++)
            System.out.print(a[i]);
    }
}
