package book.shildt.chapter3;

public class Help {

    public static void main(String[] args) throws java.io.IOException {
        char choice;

        System.out.println("Справка:");
        System.out.println("\t1. if");
        System.out.println("\t2. switch");
        System.out.println("Выберите:");


        choice = (char) System.in.read();


        switch (choice) {
            case '1':
                System.out.println("Информация по условному оператору if");
                break;
            case '2':
                System.out.println("Информация по условному оператору switch");
                break;
            default:
                System.out.println("Запрос не найден");
        }
    }

}
