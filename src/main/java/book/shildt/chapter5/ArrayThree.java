package book.shildt.chapter5;

public class ArrayThree {

    public static void main(String[] args) {

        int[][][] arr = new int[3][4][2];

//        // объявляем длину каждого одномерного внешнего массива
//        arr[0] = new int[4][];
//        arr[1] = new int[3][];
//        arr[2] = new int[2][];
//        arr[3] = new int[1][];
//
//        // объявляем длина для каждого вложенного одномерного массива
//        arr[0][0] = new int[4];
//        arr[0][1] = new int[3];
//        arr[0][2] = new int[4];
//        arr[0][3] = new int[4];
//
//
//        arr[1][0] = new int[4];
//        arr[1][1] = new int[4];
//        arr[1][2] = new int[4];
//
//        arr[2][0] = new int[2];
//        arr[2][1] = new int[2];
//
//        arr[3][0] = new int[1];

        int value = 1;
        for (int i = 0; i < arr.length; i++) {// от 0 до 4, т.к. длина внешнего массива 4 (4 внутренних массива разной длинны)
            for (int j = 0; j < arr[i].length; j++) { // в каждом одномерном внешнем массиве находится одномерный массив разной длинны
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = value;
                    //System.out.print(arr[i][j][k] + " "); // можно вывести массив в консоль так
                    value++;
                }
                //System.out.println();
            }
            //System.out.println();
        }

        System.out.println("Элемент массива arr[2][3][1] - " + arr[2][3][1] + "\n");


        // или можно вывести массив в консоль так
        for (int[][] i : arr) {
            for (int[] j : i) {
                for (int val : j) {
                    System.out.print(val + " ");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
}
