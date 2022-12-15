package book.shildt.chapter9;

public class CauseExp {

    public static void main(String[] args) {
        try {
            throw new ArithmeticException("Арифметическая ошибка");
        }catch (ArithmeticException e){
            e.initCause(new StasunException("Причина исключения " + e));
            e.printStackTrace();
        }

    }
}
