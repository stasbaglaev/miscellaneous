package book.shildt.chapter8.task1.qpack;

public class QueueDynamic implements ICharQ {

    private int[] queue;
    private int indexPut;
    private int capacity;
    private final int primaryCapacity;

    public QueueDynamic(int capacity) {
        this.queue = new int[capacity];
        this.capacity = capacity;
        this.primaryCapacity = capacity;
        this.indexPut = 0;
    }

    public QueueDynamic(QueueDynamic queue) {
        this.queue = queue.queue;
        this.capacity = queue.capacity;
        this.primaryCapacity = capacity;
        this.indexPut = queue.indexPut;
    }

    public int[] getQueue() {
        return queue;
    }

    int getCapacity() {
        return this.capacity;
    }

    @Override
    public void put(int val) {
        if (indexPut == capacity) {
            queue = copyQueue(queue);
            capacity = queue.length;
        }
        queue[indexPut] = val;
        indexPut++;
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

    private static int[] copyQueue(int[] queueOld) {
        int[] queueNew = new int[queueOld.length * 2];

        for (int i = 0; i < queueOld.length; i++) {
            queueNew[i] = queueOld[i];
        }
        return queueNew;
    }


    @Override
    public void reset() {
        this.queue = new int[primaryCapacity];
    }
}
