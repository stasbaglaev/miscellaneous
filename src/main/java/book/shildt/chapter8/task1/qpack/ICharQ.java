package book.shildt.chapter8.task1.qpack;

public interface ICharQ {


    void put(int val);

    int get();

    void reset();


    default void gett(){

    };
}
