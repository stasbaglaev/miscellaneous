package book.shildt.chapter2;

public class SimpleValues {

    public static void main(String[] args) {
        int k = 0;

        for (int i = 2; i <= 52; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                k++;
                System.out.println(i + " простое число");
            }
        }
        System.out.println("Количество простых чисел от 2 до 100 - " + k);
    }
}
