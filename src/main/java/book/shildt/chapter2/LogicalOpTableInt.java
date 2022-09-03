package book.shildt.chapter2;

public class LogicalOpTableInt {
//с использование побитовой операции
    public static void main(String[] args) {
        int p;
        int q;

        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p = 0;
        q = 0;
        System.out.print(p + "\t\t" + q + "\t\t");
        System.out.println((p & q) + "\t\t" + (p | q) + "\t\t" + (p ^ q) + "\t\t" + (~p + 2));

        p = 1;
        q = 0;
        System.out.print(p + "\t\t" + q + "\t\t");
        System.out.println((p & q) + "\t\t" + (p | q) + "\t\t" + (p ^ q) + "\t\t" + (~p + 2));

        p = 0;
        q = 1;
        System.out.print(p + "\t\t" + q + "\t\t");
        System.out.println((p & q) + "\t\t" + (p | q) + "\t\t" + (p ^ q) + "\t\t" + (~p + 2));

        p = 1;
        q = 1;
        System.out.print(p + "\t\t" + q + "\t\t");
        System.out.println((p & q) + "\t\t" + (p | q) + "\t\t" + (p ^ q) + "\t\t" + (~p + 2));



    }


}
