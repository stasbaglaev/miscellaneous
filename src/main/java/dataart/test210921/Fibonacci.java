package dataart.test210921;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
        System.out.println(fibonacciRecursion(4));
    }
    // Последовательность фибоначчи: 0 1 1 2 3 5 8 13 ... (следующее число является суммой двух предыдущих)
    static long fibonacci(int n) {
        long first = 0;
        long second = 1;
        long result = n;

        for (int i = 1; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    static long fibonacciRecursion(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
