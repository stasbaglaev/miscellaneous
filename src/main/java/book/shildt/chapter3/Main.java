package book.shildt.chapter3;

public class Main {

    public static void main(String[] args) {
        int countIterators = 0;
        int countDivisor = 0;

        for (int i = 2; i <= 100; i++) {
            System.out.print("Делители " + i + ": ");
            for (int j = 2; j <= i / 2; j++) { // (j <= i / j) не перебераем повторящие делители
                countIterators++;
                if ((i % j) == 0) { // проверка деления по модулю на равенство нулю
                    if (j != (i / j)) { //
                        countDivisor++;
                        System.out.print(j + " ");
                    } else {
                        countDivisor++;
                        System.out.print(i / j + " ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println("\nКоличество итераций (всего) - " + countIterators);
        System.out.println("Количество делителей (всего) - " + countDivisor);
    }
}
