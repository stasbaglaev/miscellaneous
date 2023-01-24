package book.shildt.chapter6;

public class Backwards {

    private String str;

    Backwards(String s) {
        str = s;
    }

    void backward(int idx) {
        if (idx != str.length() - 1) {
            backward(idx + 1);
        }
        System.out.print(str.charAt(idx));
    }
}

class BWDemo {
    public static void main(String[] args) {
        Backwards s = new Backwards("Эт");
        s.backward(0);
    }
}
