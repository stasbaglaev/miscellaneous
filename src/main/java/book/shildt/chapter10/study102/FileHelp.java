package book.shildt.chapter10.study102;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHelp {
    public static void main(String[] args) throws IOException {
        String str;
        String operator;
        if (args.length != 1) {
            System.out.println("Пользование программой: java FileHelp оператор");
            return;
        }
        operator = "#" + args[0];

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("HelpFile.txt"))) {
            for (; ; ) {
                str = bufferedReader.readLine();
                if (str == null) {
                    System.out.println("По указанному оператору отсутствует справочная информация");
                    return;
                } else if (str.startsWith("#") && str.equalsIgnoreCase(operator)) {
                    System.out.println("Справочная информация по оператору " + args[0] + ": ");
                    while (!str.equals("")) {
                        str = bufferedReader.readLine();
                        if (str == null || str.equals("")) {
                            return;
                        }
                        System.out.println("\t" + str);
                    }
                    return;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isValid(String str) {
        return str != null;
    }
}
