package book.shildt.chapter6;

public class Task6 {
    public static void main(String[] args) {
        String originalStr = "абвгд";
        System.out.println(Str.reverse(originalStr));
    }
}

class Str {
    static String reverse(String original) {
        if (original.length() == 0) {
            return "";
        }
        return reverse(original.substring(1)) + original.charAt(0);
    }
}
