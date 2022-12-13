package book.shildt.chapter9.method;

import java.io.PrintWriter;
import java.io.StringWriter;

public class PrintStackTraceStringDemo {
    public static void main(String[] args) {
        int[] number = {4, 8, 15, 32, 64, 127};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < number.length; i++) {

            try {
                System.out.println(number[i] + " / " + denom[i] + " равно " + number[i] / denom[i]);
            } catch (ArithmeticException exception) {
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                exception.printStackTrace(printWriter);
                String error = stringWriter.toString();
                System.out.println("Error: " + error);
            }
        }
    }
}