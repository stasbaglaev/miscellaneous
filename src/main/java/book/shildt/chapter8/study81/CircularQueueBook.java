package book.shildt.chapter8.study81;

public class CircularQueueBook implements ICharQ {
    private int queue[];
    private int putloc, getloc;
    private int capacity;

    public int[] getQueue() {
        return queue;
    }

    public int getCapacity() {
        return capacity;
    }

    public CircularQueueBook(int size) {
        queue = new int[size + 1];
        putloc = getloc = 0;
    }

    @Override
    public void put(int val) {
        if (putloc+1 == getloc || ((putloc == queue.length - 1) && (getloc == 0))) {
            System.out.println("Очередь переполнена. Подождите...");
            return;
        }
        queue[putloc++] = val;
        if (putloc == queue.length) {
            putloc = 0;
        }
    }

    @Override
    public int get() {
        if (getloc == putloc) {
            System.out.println("Очередь пустая!");
            return -1;
        }

        if (getloc == queue.length) {
            getloc = 0;
        }
        return queue[getloc];
    }

    @Override
    public void reset() {
        this.queue = new int[capacity];
    }
}

