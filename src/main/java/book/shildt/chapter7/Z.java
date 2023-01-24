package book.shildt.chapter7;

public class Z {
    int a;

    Z(int a) {
        this.a = a;
    }
}

class Q extends Z{
    int b;

    Q(int a, int b) {
        super(a);
        this.b = b;
    }
}

class ZQMain{

    public static void main(String[] args) {
        Z z = new Z(10);
        Z z1;
        Q q = new Q(15,5);

        z1 = z;
        System.out.println(z1.a);

        z1 = q;
        System.out.println(z1.a);

        System.out.println(q.a + ", " + q.b);
    }
}
