package dataart.test210921;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }

    static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}