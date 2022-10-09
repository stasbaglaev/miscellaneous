package book.shildt.chapter5;

public class ArrayThree2 {

    public static void main(String[] args) {


        int[][][] arr = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};

        int value = 1;
        for (int i = 0; i < arr.length; i++) {// от 0 до 4, т.к. длина внешнего массива 4 (4 внутренних массива разной длинны)
            for (int j = 0; j < arr[i].length; j++) { // в каждом одномерном внешнем массиве находится одномерный массив разной длинны
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
