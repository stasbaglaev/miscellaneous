package book.shildt.chapter8.task1.qpack;


public class QueueLinear implements ICharQ {
    private int queue[];
    private int putloc, getloc;
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public QueueLinear(int size) {
        queue = new int[size];
        putloc = getloc = 0;
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

