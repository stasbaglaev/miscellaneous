package book.shildt.chapter2;

public class LogicalOpTable {

    public static void main(String[] args) {
        boolean p;
        boolean q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true;
        q = true;
        System.out.print((p ? 1 : 0) + "\t" + (q ? 1 : 0) + "\t");
        System.out.println(((p & q) ? 1 : 0) + "\t" + ((p | q) ? 1 : 0) + "\t" + ((p ^ q) ? 1 : 0) + "\t" + ((!p) ? 1 : 0));

        p = true;
        q = false;
        System.out.print((p ? 1 : 0) + "\t" + (q ? 1 : 0) + "\t");
        System.out.println(((p & q) ? 1 : 0) + "\t" + ((p | q) ? 1 : 0) + "\t" + ((p ^ q) ? 1 : 0) + "\t" + ((!p) ? 1 : 0));

        p = false;
        q = true;
        System.out.print((p ? 1 : 0) + "\t" + (q ? 1 : 0) + "\t");
        System.out.println(((p & q) ? 1 : 0) + "\t" + ((p | q) ? 1 : 0) + "\t" + ((p ^ q) ? 1 : 0) + "\t" + ((!p) ? 1 : 0));

        p = false;
        q = false;
        System.out.print((p ? 1 : 0) + "\t" + (q ? 1 : 0) + "\t");
        System.out.println(((p & q) ? 1 : 0) + "\t" + ((p | q) ? 1 : 0) + "\t" + ((p ^ q) ? 1 : 0) + "\t" + ((!p) ? 1 : 0));
    }

}
