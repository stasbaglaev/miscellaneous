package book.shildt.chapter5;

public class Task6 {
    public static void main(String[] args) {
        String str = "Мне нравится Java";

        System.out.println("Длинна литерала = " + str.length());

        for (int i = 0; i < str.length(); i++) {
            System.out.print("Мне нравится Java".charAt(i));
        }
        System.out.println();
        System.out.println("Мне нравится Java".length());
    }
}
