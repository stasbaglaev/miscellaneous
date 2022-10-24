package book.shildt.chapter5;

public class QDemo {

    public static void main(String[] args) {
        ClassQueue<Integer> queue = new ClassQueue<>(10);

        for (int i = 1; i < queue.getCapacity() + 1; i++) {
            queue.put(i);
        }
        queue.printArray();

        System.out.println("\nПервый первый элемент из очереди - " + queue.get());
        queue.printArray();

        System.out.println("\nПервый элемент из очереди - " + queue.get());
        queue.printArray();
    }

}

class ClassQueue<T> {
    private T[] queue;
    private int indexPut;
    private int capacity;

    private T getValue;

    public int getCapacity() {
        return capacity;
    }

    ClassQueue(int capacityQueue) {
        this.capacity = capacityQueue;
        this.queue = (T[]) new Object[capacity];
        this.indexPut = 0; // хранится индекс в который было записано последнее значение
    }

    void put(T a) {
        if (indexPut == queue.length) {
            System.out.println("Очередь заполнена, подождите ... ");
            return;
        }
        queue[indexPut] = a;
        System.out.println("Элемент " + a + " добавлен в очередь, в индекс " + indexPut);
        indexPut++;

//        for (int i = 0; i < queue.length; i++) {
//            if (queue[i] == 0) {
//                queue[i] = a;
//                System.out.println("Элемент " + a + " добавлен в очередь, в индекс " + queue[i]);
//                return;
//            }
//        }
    }


    T get() {
        if (queue[0] == null) {
            System.out.println("Очередь пустая!");
        }
        getValue = queue[0];
        delete();
        return getValue;
    }

    private void delete() {
        for (int i = 0; i < queue.length - 1; i++) {
            queue[i] = queue[i + 1];
        }
        queue[queue.length - 1] = null;
    }

    void printArray() {
        for (T x : queue) {
            System.out.print(x + " ");
        }
    }

}