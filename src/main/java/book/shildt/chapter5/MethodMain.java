package book.shildt.chapter5;

public class MethodMain {

    public static void main(String[] args) {

        String[][] str = {
                {"Tom", "755-358"},
                {"Mary", "555-333"},
                {"Katy", "991-555"}};
        int i;

        if (args.length != 0) {
            System.out.println(args[0]);

            for (i = 0; i < str.length; i++) {
                if (str[i][0].equals(args[0])) {
                    System.out.println("Имя: " + str[i][0] + ", телефон: " + str[i][1]);
                    break;
                }
            }
            if (i == str.length) {
                System.out.println("Совпадений не найдено");
            }
        }
    }

}
