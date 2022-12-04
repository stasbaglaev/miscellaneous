package book.shildt.chapter8.study81;

import book.shildt.chapter9.study91.QueueEmptyException;
import book.shildt.chapter9.study91.QueueFullException;

public interface ICharQ {


    void put(int val);

    int get();

    void reset();


    default void gett(){

    }
}
