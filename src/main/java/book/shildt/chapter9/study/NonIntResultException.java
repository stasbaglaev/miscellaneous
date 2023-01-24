package book.shildt.chapter9.study;

public class NonIntResultException extends Exception {

    int a;
    int b;

    public NonIntResultException(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Результат операции " + a + " / " + b + " не является целым числом";
    }
}
