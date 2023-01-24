package book.shildt.chapter9.study91;

public class QueueFullException extends Exception{
    int size;

    QueueFullException(int size){
        this.size = size;
    }

    @Override
    public String toString() {
        return "\nОчередь переполнена. Максимальный размер очереди " + size;
    }
}
