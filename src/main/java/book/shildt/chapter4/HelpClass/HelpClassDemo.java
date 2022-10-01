package book.shildt.chapter4.HelpClass;

public class HelpClassDemo {

    public static void main(String[] args) throws java.io.IOException {
        char choice;
        char ignore;

        Help help = new Help();

        for (; ; ) {
            do {
                help.showMenu();
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while (help.isValid(choice));

            if (choice == 'q') {
                break;
            }
            System.out.println();
            help.helpon(choice);
        }
    }


}
