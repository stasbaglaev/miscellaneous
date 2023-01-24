package book.shildt.chapter5;

public class Task3 {
    public static void main(String[] args) {
        double[] array = new double[10];
        double sum = 0.0;

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
            sum += array[i];
            System.out.println(array[i]);
        }
        System.out.println("Сумма = " + sum);
        System.out.println("Среднее арифметическое = " + sum / array.length);
    }
}
