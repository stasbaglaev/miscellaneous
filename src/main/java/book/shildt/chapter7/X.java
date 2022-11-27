package book.shildt.chapter7;

public class X {
    int a;

    X(int a) {
        this.a = a;
    }
}

class Y {
    int b;

    Y(int b) {
        this.b = b;
    }
}

class XYMain{

    public static void main(String[] args) {
        X x = new X(10);
        X x1;
        Y y = new Y(15);

        x1 = x;
        System.out.println(x1.a);

        // так делать нельзя, т.к. переменные ссылаются на объекты разных классов!
        // X = y;
    }
}