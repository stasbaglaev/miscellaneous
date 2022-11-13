package book.shildt.chapter6;

public class ReverseStringRecursion {
    // метод который возвращает заданную строку в обратном виде
    static String runReverse(String str) {
        if (str.length() == 0) {
            return "";
        }
        return runReverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String string = "Привет";

        System.out.println(string);
        String catInvert = ReverseStringRecursion.runReverse(string);
        System.out.println(catInvert);
    }
}
