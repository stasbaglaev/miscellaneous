package book.shildt.chapter9.task10;

public class StackEmptyException extends Exception {

    @Override
    public String toString() {
        return "\nСтек пуст!";
    }
}
