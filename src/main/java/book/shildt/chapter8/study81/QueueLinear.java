package book.shildt.chapter8.study81;


public class QueueLinear implements ICharQ {
    private int queue[];
    private int putloc, getloc;
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public QueueLinear(int size) {
        this.queue = new int[size];
        this.putloc = this.getloc = 0;
        this.capacity = size;
    }

    public int[] getQueue() {
        return queue;
    }
    @Override
    public void put(int val) {
        if (putloc == queue.length) {
            System.out.println("Очередь переполнена. Подождите...");
            return;
        }
        queue[putloc++] = val;
    }


    @Override
    public int get() {
        if (getloc == putloc) {
            System.out.println("Очередь пустая!");
            return -1;
        }
        return queue[getloc++];
    }

    @Override
    public void reset() {
        this.queue = new int[capacity];
    }
}

