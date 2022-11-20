package book.shildt.chapter6;

public class Task13 {
    public static void main(String[] args) {
        System.out.println(sum(100, 20));

    }

    static int sum(int... values) {
        int sum = 0;
        for (int val : values) {
            sum += val;
        }
        return sum;
    }


}
