package book.shildt.chapter10.compared;

import java.io.*;

class CompFilesBook {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        // Прежде всего необходимо убедиться в том, что программе
        // передаются имена обоих файлов
        if (args.length != 3) {
            System.out.println("Использование: CompFiles файл1 файл2 CaseSensitive");
            return;
        }

        if (!((args[2].equals("yes")) || (args[2].equals("no")))) {
            System.out.println("Использование: CompFiles файл1 файл2 CaseSensitive");
            System.out.println("В качестве параметра CaseSensitive может указываться 'yes' или 'no'");
            return;
        }
        // Сравнение файлов
        try (InputStream f1 = new FileInputStream(args[0]);
             InputStream f2 = new FileInputStream(args[1])) {
            // Проверка содержимого каждого файла
            if (args[2].equals("no")) {
                do {
                    i = f1.read();
                    j = f2.read();
                    if (i != j) {
                        break;
                    }
                } while (i != -1 && j != -1);
            } else {
                do {
                    i = f1.read();
                    j = f2.read();

                    if (i != j) {
                        if (i >= 65 && i <= 90) {
                            i |= 32;
                        } else if (i >= 97 && i <= 122) {
                            i &= ~32;
                        }
                        if (i != j) {
                            break;
                        }
                    }
                } while (i != -1 && j != -1);

            }
            if (i != j) {
                System.out.println("Содержимое файлов отличается");
            } else {
                System.out.println("Содержимое файлов совпадает");
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }

    }


}


