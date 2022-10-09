package book.shildt.chapter5;

public class ArrayFour {

    public static void main(String[] args) {

        int[][][][] arr = new int[2][3][2][5];

        int value = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    for (int l = 0; l < arr[i][j][k].length; l++) {
                        arr[i][j][k][l] = value;
                        System.out.print(arr[i][j][k][l] + " ");
                        value++;
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println(arr[0][2][0][3]);

    }
}
