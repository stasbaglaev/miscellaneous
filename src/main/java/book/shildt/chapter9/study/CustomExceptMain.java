package book.shildt.chapter9.study;

public class CustomExceptMain {
    public static void main(String[] args) {
        int[] number = {4, 8, 15, 32, 64, 127, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};


        for (int i = 0; i < number.length; i++) {
            try {
                if (number[i] % denom[i] == 0) {
                    System.out.println(number[i] + " / " + denom[i] + " равно " + number[i] / denom[i]);
                } else {
                    throw new NonIntResultException(number[i], denom[i]);
                }
            } catch (ArithmeticException exception) {
                System.out.println("Ошибка деления на ноль");
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Соответствующий элемент не найден");
            } catch (NonIntResultException exception) {
                System.out.println(exception);
            }
        }
    }
}