package book.shildt.chapter3;

public class FindDivisorNew {

    public static void main(String[] args) {
        int countIterators = 0;
        int countDivisor = 0;

        for (int i = 2; i <= 100; i++) {
            System.out.print("Делители " + i + ": ");
            for (int j = 2; j <= i / j; j++) { // (j <= i / j) не перебераем повторящие делители
                countIterators++;
                if ((i % j) == 0) { // проверка деления по модулю на равенство нулю
                    if (j != (i / j)) { //
                        countDivisor += 2;
                        System.out.print(j + " " + i / j + " "); // делителем является делитель и результат деления
                    } else {
                        countDivisor++;
                        System.out.print(i / j + " "); // делителем является только делитель (например 25/5=5, где только один делитель)
                    }
                }
            }
            System.out.println();
        }
        System.out.println("\nКоличество итераций (всего) - " + countIterators);
        System.out.println("Количество делителей (всего) - " + countDivisor);
    }
}
