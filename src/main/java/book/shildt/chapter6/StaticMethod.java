package book.shildt.chapter6;

public class StaticMethod {

    static int f(int i) {
        return i;
    }

    public static void main(String[] args) {
        int i = 10;
        byte b = 15;
        short s = 3000;
        char c = 'A';

        System.out.println(StaticMethod.f(i));
        System.out.println(StaticMethod.f(b));
        System.out.println(StaticMethod.f(s));
        System.out.println(StaticMethod.f(c));
    }

}
