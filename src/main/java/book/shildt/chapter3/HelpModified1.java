package book.shildt.chapter3;

public class HelpModified1 {

    public static void main(String[] args) throws java.io.IOException {
        char choice;
        char ignore;

        do {
            System.out.println("Справка:");
            System.out.println("\t1. if");
            System.out.println("\t2. switch");
            System.out.println("\t3. for");
            System.out.println("\t4. while");
            System.out.println("\t5. do while");
            System.out.println("Выберите:");

            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            switch (choice) {
                case '1':
                    System.out.println("Информация по условному оператору if");
                    break;
                case '2':
                    System.out.println("Информация по условному оператору switch");
                    break;
                case '3':
                    System.out.println("Информация по циклу for");
                    break;
                case '4':
                    System.out.println("Информация по циклу while");
                    break;
                case '5':
                    System.out.println("Информация по циклу do while");
                    break;
            }

        } while (choice < '1' || choice > '5');

    }

}

