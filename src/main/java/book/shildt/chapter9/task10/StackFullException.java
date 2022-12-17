package book.shildt.chapter9.task10;

public class StackFullException extends Exception{
    int size;


    StackFullException(int size){
        this.size = size;
    }

    @Override
    public String toString() {
        return "\nСтек заполнен. Максимальный размер стека " + size;
    }
}
