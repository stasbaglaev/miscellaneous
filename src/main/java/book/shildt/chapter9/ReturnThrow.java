package book.shildt.chapter9;

public class ReturnThrow {

    public static void genExp() {
        int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " равно " + numer[i] / denom[i]);
            } catch (ArithmeticException exception) {
                System.out.println("Попытка деления на нуль");
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Соответствующий элемент не найден");
                System.out.println(exception.getMessage());
                throw exception;
            }
        }
    }
}

class ReturnThrowMain {
    public static void main(String[] args) {
        try {
            ReturnThrow.genExp();
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Фатальная ошибка - выполнение программы прервано!");
            System.out.println("StackTrace исключения: '");
            exception.printStackTrace();
            System.out.println("'");

        }
    }
}
