package book.shildt.chapter3;

public class FindDivisor {

    public static void main(String[] args) {
        int countIterators = 0;
        int countDivisor = 0;

        for (int i = 2; i <= 100; i++) {
            System.out.print("Делители " + i + ": ");
            for (int j = 2; j < i; j++) {
                countIterators++;
                if ((i % j) == 0) {
                    countDivisor++;
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        System.out.println("\nКоличество итераций (всего) - " + countIterators);
        System.out.println("Количество делителей (всего) - " + countDivisor);

    }
}
