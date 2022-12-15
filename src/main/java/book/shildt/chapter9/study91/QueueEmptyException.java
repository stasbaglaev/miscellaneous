package book.shildt.chapter9.study91;

public class QueueEmptyException extends Exception {

    @Override
    public String toString() {
        return "Очередь пустая!";
    }
}
