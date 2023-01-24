package book.shildt.chapter9.study91;

 class QueueLinear implements ICharQ {
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
    public void put(int val) throws QueueFullException {
        if (putloc == queue.length) {
            throw new QueueFullException(capacity);
        }
        queue[putloc++] = val;
    }


    @Override
    public int get() throws QueueEmptyException {
        if (getloc == putloc) {
            throw new QueueEmptyException();
        }
        return queue[getloc++];
    }

    @Override
    public void reset() {
        this.queue = new int[capacity];
    }
}
