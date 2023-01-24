package book.shildt.chapter9.method;

import java.util.Arrays;

public class SetStackTraceDemo {
    public static void main(String[] args)  throws Exception {
        int[] number = {4, 8, 15, 32, 64, 127};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < number.length; i++) {
            try {
                System.out.println(number[i] + " / " + denom[i] + " равно " + number[i] / denom[i]);
            } catch (ArithmeticException exception) {
                StackTraceElement[] stackTraceElements = new StackTraceElement[5];
                stackTraceElements[0] =        exception.getStackTrace()[0];

                System.out.println(Arrays.toString(stackTraceElements));
                stackTraceElements[0] = new StackTraceElement("book.shildt.chapter9.method.SetStackTraceDemo","main","FillInStackTraceDemo.java",16);
                stackTraceElements[1] = new StackTraceElement("book.shildt.chapter9.method.SetStackTraceDemo","main","FillInStackTraceDemo.java",16);

                System.out.println(Arrays.toString(stackTraceElements));
            }
        }
    }
}
