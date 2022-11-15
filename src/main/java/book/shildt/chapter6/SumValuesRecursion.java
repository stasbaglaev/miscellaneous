package book.shildt.chapter6;

public class SumValuesRecursion {
    // метод вычисляющий сумму целых чисел от 1 до number
    static int getSum(int number) {
        if (number < 0) {
            return -1;
        }
        return number == 1 ? 1 : number + getSum(number - 1);
    }


    public static void main(String[] args) {
        int sum;
        sum = SumValuesRecursion.getSum(3);
        System.out.println(sum);
    }
}
