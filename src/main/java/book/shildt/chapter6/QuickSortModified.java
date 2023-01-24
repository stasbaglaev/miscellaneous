package book.shildt.chapter6;

import java.util.Arrays;

public class QuickSortModified {

    private QuickSortModified() {

    }

    // Вызов фактического метода быстрой сортировки
    static void qSort(char[] items) {
        if (items.length > 0) {
            qs(items, 0, items.length - 1);


        }
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
                System.out.println(Arrays.toString(items));
            }
        } while (leftIndex <= rightIndex);


        if (left < rightIndex) {
            print(items,left,rightIndex);
            qs(items, left, rightIndex);
        }
        if (leftIndex < right) {
            print(items,leftIndex,right);
            qs(items, leftIndex, right);
        }
    }

    private static void swap(char[] items, int indexL, int indexR) {
        char temp = items[indexL];
        items[indexL] = items[indexR];
        items[indexR] = temp;
    }

    private static void print(char[] a, int left, int right ){
        for (; left < right; left++)
            System.out.print(a[left]);
        System.out.println();
    }
}

class QSMDemo {
    public static void main(String args[]) {
        char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i', 'z', 'u', 'y'};

        //char a[] = new char[0];
        int i;

        System.out.print("Исходный массив: ");
        for (i = 0; i < a.length; i++)
            System.out.print(a[i]);
        System.out.println();


        QuickSortModified.qSort(a); // Сортировка массива

        System.out.print("Отсортированный массив: ");
        for (i = 0; i < a.length; i++)
            System.out.print(a[i]);
    }
}

