package book.shildt.chapter8.task1.qpack;

public class QueueCircular implements ICharQ {
    private int[] queue;
    private int indexPut;
    private int capacity;

    public QueueCircular(int capacity) {
        this.queue = new int[capacity];
        this.capacity = capacity;
        this.indexPut = 0;
    }

    public QueueCircular(QueueCircular queue) {
        this.queue = queue.queue;
        this.indexPut = queue.indexPut;
        this.capacity = queue.capacity;
    }

    public int[] getQueue() {
        return queue;
    }

    int getCapacity() {
        return this.capacity;
    }

    @Override
    public void put(int val) {
        if (indexPut < capacity) {
            queue[indexPut] = val;
            indexPut++;
        } else {
            System.out.println("Очередь переполнена. Подождите...");
        }
    }

    @Override
    public int get() {
        int returnVal = -1;
        if (indexPut > 0) {
            returnVal = queue[0];
            delete();
            indexPut--;
            return returnVal;
        }
        System.out.println("Очередь пустая!");
        return returnVal;
    }

    private void delete() {
        for (int i = 0; i < capacity - 1; i++) {
            queue[i] = queue[i + 1];
        }
        queue[capacity - 1] = 0;
    }

    @Override
    public void reset() {
        this.queue = new int[capacity];
    }


}
