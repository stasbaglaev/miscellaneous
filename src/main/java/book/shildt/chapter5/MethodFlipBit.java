package book.shildt.chapter5;

public class MethodFlipBit {

    public static void main(String[] args) {

        int i = flipBit(10, 2); // 10 = 0000_1010;
        //   2 = 0000_0010 - 2 бит
        System.out.println(i);               //      0000_1001, метод должен вернуть значение = 8

        int b = flipBit(9, 2); //  9 = 0000_1001;
        //  2 = 0000_0010 - 2 бит
        System.out.println(b);              //      0000_1011, метод должен вернуть значение = 11

        int y = flipBit(0, 1); //  9 = 0000_0000;
        //  1 = 0000_0001 - 1 бит
        System.out.println(y);              //      0000_0001, метод должен вернуть значение = 1


        int u = flipBit(0, 3); //  9 = 0000_0000;
        //  4 = 0000_0100 - 3 бит
        System.out.println(u);              //      0000_0100, метод должен вернуть значение = 4


    }

    public static int flipBit(int value, int bitIndex) {
        int mask = (int) Math.pow(2, bitIndex - 1);
        return value ^ mask;
    }
}
