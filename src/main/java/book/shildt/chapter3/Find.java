package book.shildt.chapter3;

public class Find {

    public static void main(String args[]) {
        int countIterators = 0;
        int countDivisor = 0;

        for (int i = 2; i <= 100; i++) {
            System.out.println();
            System.out.print("Делители " + i + ": ");
            if ((i % 2) != 0) {
                for (int j = 3; j < i; j = j + 2) {
                    countIterators++;
                    if ((i % j) == 0) {
                        countDivisor++;
                        System.out.print(j + " ");
                    }
                }
            } else {
                for (int j = 2; j < i; j++) {
                    countIterators++;
                    if ((i % j) == 0) {
                        countDivisor++;
                        System.out.print(j + " ");
                    }
                }
            }
        }
        System.out.println();
        System.out.println("\nКоличество итераций (всего) - " + countIterators);
        System.out.println("Количество делителей (всего) - " + countDivisor);
    }
}