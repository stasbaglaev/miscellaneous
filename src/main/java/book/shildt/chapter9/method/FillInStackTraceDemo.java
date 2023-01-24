package book.shildt.chapter9.method;

public class FillInStackTraceDemo {
    public static void main(String[] args)  throws Exception {
        int[] number = {4, 8, 15, 32, 64, 127};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < number.length; i++) {

            try {
                System.out.println(number[i] + " / " + denom[i] + " равно " + number[i] / denom[i]);
            } catch (ArithmeticException exception) {
                throw new Exception(exception.fillInStackTrace());
            }
        }
    }
}
