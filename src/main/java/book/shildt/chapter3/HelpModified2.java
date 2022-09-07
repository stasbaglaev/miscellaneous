package book.shildt.chapter3;

public class HelpModified2 {

    public static void main(String[] args) throws java.io.IOException {
        char choice;
        char ignore;

        for (; ; ) {
            do {
                System.out.println("\nСправка:");
                System.out.println("\t1. if");
                System.out.println("\t2. switch");
                System.out.println("\t3. for");
                System.out.println("\t4. while");
                System.out.println("\t5. do while");
                System.out.println("\t6. break");
                System.out.println("\t7. continue");
                System.out.print("\nВыберите (q - выход): ");

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while ((choice < '1' || choice > '7') && choice != 'q');

            if (choice == 'q') {
                break;
            }

            switch (choice) {
                case '1':
                    System.out.println("Информация по условному оператору if");
                    break;
                case '2':
                    System.out.println("Информация по условному оператору switch");
                    break;
                case '3':
                    System.out.println("Информация циклу for");
                    break;
                case '4':
                    System.out.println("Информация циклу while");
                    break;
                case '5':
                    System.out.println("Информация циклу do while");
                    break;
                case '6':
                    System.out.println("Информация по оператору перехода break");
                    break;
                case '7':
                    System.out.println("Информация по оператору перехода continue");
                    break;
            }
        }
    }
}
