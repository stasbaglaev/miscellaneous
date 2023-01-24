package book.shildt.chapter3;

public class Step9 {

    public static void main(String[] args) {

        for (int i = 1; i < 100 ; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // или так:
        for (int j = 1; j < 100 ; j += j) {
            System.out.print(j + " ");
        }
    }
}
