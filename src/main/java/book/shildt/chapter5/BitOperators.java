package book.shildt.chapter5;

public class BitOperators {
    public static void main(String[] args) {
        System.out.println((byte) (0b1001_0110));

        System.out.println("-----------------------");


        byte a = 13; // 00001101
        byte maskB = 8;  // 00001000

        // проверка установлен ли четвертый бит в переменной а
        if ((a & maskB) == maskB) {
            System.out.println("Четвертый бит установлен!");

        } else {
            System.out.println("Четвертый бит не установлен!");
        }

        System.out.println("-----------------------");
        byte x = 13;     // 00001101
        byte maskY = 5;  // 00000101

        System.out.println("x = " + x);
        System.out.println("maskY = " + maskY);
        System.out.println("~maskY = " + ~maskY);
        x = (byte) (x & ~maskY);
        System.out.println(x);

    }
}
