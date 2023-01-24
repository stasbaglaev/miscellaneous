package book.shildt.chapter2;

public class Literals {

    public static void main(String[] args) {

        System.out.println(0b1100); // литерал заданный в двоичной системе счисления

        System.out.println(0xFF);  // литерал заданный в шестнадцатиричной системе счисления

        System.out.println(011);   // литерал заданный в восьмиричной системе счисления

        System.out.println("12345\n78");

        System.out.println("5678\r32");

        System.out.println('"');

        int x = 10;
        int y;
        y = ++x;
        System.out.println(y);


        int a = 10;
        int b;
        b = a++;
        System.out.println(b);

    }
}
