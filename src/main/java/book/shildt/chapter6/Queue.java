package book.shildt.chapter6;

import java.util.Arrays;

public class Queue {
    private char q[];
    private int putloc;
    private int getloc;

    public Queue(int size) {
        q = new char[size]; // выделение памяти для очереди
        putloc = getloc = 0;
    }

    public Queue(Queue queue) {
        this.putloc = queue.putloc;
        this.getloc = queue.getloc;
        this.q = new char[queue.q.length];
        int i;

        for(i = 0; i < queue.q.length;i++){
            this.q[i] = queue.q[i];
        }
//        for (char element : queue.q) {
//            this.q[i] = element;
//            i++;
//        }
    }

    public Queue(char[] chars) {
        this.putloc = 0;
        this.getloc = 0;
        this.q = new char[chars.length+1];
//        int i = 0;
//        for (char element : chars) {
//            this.q[i] = element;
//            i++;
//        }

        for (int i = 0; i < chars.length; i++) {
            put(chars[i]);
        }
    }

    // Помещение символа в очередь
    public void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Очередь заполнена.");
            return;
        }
        q[putloc++] = ch;
    }

    // Извлечение символа из очереди
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста.");
            return (char) 0;
        }
        return q[getloc++];
    }


    public static void main(String[] args) {
        Queue queue1 = new Queue(10);
        char[] ch = {'T','o','m'};

        Queue queue3 = new Queue(ch);

        for (int i = 0; i < queue1.q.length - 1; i++) {
            queue1.put((char) ('A' + i));
        }

        Queue queue2 = new Queue(queue1);

        System.out.print("Отображение первой очереди: " );
        for(int i = 0; i < queue1.q.length-1;i++){
            System.out.print(queue1.get());
        }

        System.out.println();
        System.out.print("Отображение второй очереди: " );
        for(int i = 0; i < queue2.q.length-1;i++){
            System.out.print(queue2.get());
        }

        System.out.println();
        System.out.print("Отображение третьей очереди: " );
        for(int i = 0; i < queue3.q.length-1;i++){
            System.out.print(queue3.get());
        }

    }
}
