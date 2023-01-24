package book.shildt.chapter9.study91;

public interface ICharQ {


    void put(int val) throws QueueFullException;

    int get() throws QueueEmptyException;

    void reset();


    default void gett(){

    }
}