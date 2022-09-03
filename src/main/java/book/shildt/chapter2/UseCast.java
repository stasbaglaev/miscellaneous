package book.shildt.chapter2;

public class UseCast {

    public static void main(String[] args) {

        char ch1 = 'A';
        char ch2 = 'b';
        char ch;

        ch = (char) (ch1 + 1);

        System.out.println(ch);

        ch = 90;

        System.out.println(ch);

        ch = (char) (ch1 + ch2);

        System.out.println(ch);

    }

}
