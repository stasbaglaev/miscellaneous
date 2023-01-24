package book.shildt.chapter9.method;

import java.io.*;

public class PrintStackTraceFileDemo {
    public static void main(String[] args) throws IOException {
        int[] number = {4, 8, 15, 32, 64, 127};
        int[] denom = {2, 0, 4, 4, 0, 8};

        method(number, denom);
    }

    private static void method(int[] number, int[] denom ) throws IOException {
        FileWriter fileWriter = new FileWriter("DescException.txt");
        for (int i = 0; i < number.length; i++) {

            try {
                System.out.println(number[i] + " / " + denom[i] + " равно " + number[i] / denom[i]);
            } catch (ArithmeticException exception) {
                System.out.println("Ошибка деления на ноль!");
                print(exception, fileWriter);
            }
        }
        fileWriter.close();
    }

    private static void print(Throwable throwable, Writer file) throws IOException {
        file.write(throwable + "\r\n");
        for (StackTraceElement stackTraceElement : throwable.getStackTrace()) {
            file.write("\tat " + stackTraceElement.toString() + "\r\n");
            file.flush();
        }
        file.write("\r\n");
    }
}
