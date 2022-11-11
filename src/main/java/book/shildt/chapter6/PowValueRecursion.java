package book.shildt.chapter6;

public class PowValueRecursion {
    // метод вычисляющий степень для указанного числа
    static int getPow(int val, int pow) {
        return pow == 0 ? 1 : val * getPow(val, pow - 1);
    }

    public static void main(String[] args) {
        int val;
        val = PowValueRecursion.getPow(2, 8);
        System.out.println(val);
    }
}
