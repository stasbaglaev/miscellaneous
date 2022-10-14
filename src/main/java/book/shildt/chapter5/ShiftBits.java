package book.shildt.chapter5;

public class ShiftBits {

    public static void main(String[] args) {
        byte a = -7;
        System.out.println(a + " ");

        a = (byte) (a >>> 25);
        System.out.println(a + " ");


//        int b = 0b01111111_11111111_11111111_11111100;
//        System.out.println(b + " ");
//
//        byte c;
//        c = (byte) b;
//        System.out.println(c + " ");

//        int p = -13;
//        System.out.println(Integer.toBinaryString(p));
    }
}
