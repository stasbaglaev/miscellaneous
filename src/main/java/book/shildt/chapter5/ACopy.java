package book.shildt.chapter5;

public class ACopy {

    public static void main(String args[]) {
        int i;
        int array1[] = new int[10];
        int array2[] = new int[11];
        for (i = 0; i < array1.length; i++) {
            array1[i] = i;
        }
        // Копирование массива array1 в массив array2

        if (array2.length >= array1.length) {
            for (i = 0; i < array2.length; i++) {
                if (i == array1.length) break;
                array2[i] = array1[i];
            }
            for (i = 0; i < array2.length; i++) {
                System.out.print(array2[i] + " ");
            }
        }
    }
}
