package book.shildt.chapter6;

public class SumNum {
    int Summ(int N) {
        if (N == 0) return 0;
        return (N + Summ(N - 1));
    }

    public static void main(String[] args) {
        int N = -1;
        SumNum rev = new SumNum();
        System.out.println(rev.Summ(N));
    }
}