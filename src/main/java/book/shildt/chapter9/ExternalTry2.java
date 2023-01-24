package book.shildt.chapter9;


public class ExternalTry2 {

    public static void main(String[] args) {

        int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};
        try {
            for (int i = 0; i < numer.length; i++) {
                try {
                    System.out.println(numer[i] + " / " +
                            denom[i] + " равно " +
                            numer[i] / denom[i]);
                } catch (ArithmeticException | ArrayIndexOutOfBoundsException exc) {
                    // Перехват исключения
                    System.out.println("Попытка деления на нуль");
                }
            }
        } catch ( StackOverflowError exc) {
            // Перехват исключения
            System.out.println("Соответствующий элемент не найден");
            System.out.println("Фатальная ошибка - выполнение программы прервано !");

        }
    }
}
