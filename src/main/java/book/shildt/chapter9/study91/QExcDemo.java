package book.shildt.chapter9.study91;

import java.util.Arrays;

public class QExcDemo {

    public static void main(String[] args) {
        QueueLinear queueLinear = new QueueLinear(10);

//        queueLinear.put(10);
//        System.out.println(Arrays.toString(queueLinear.getQueue()));
//        queueLinear.put(20);
//        System.out.println(Arrays.toString(queueLinear.getQueue()));
//        queueLinear.put(30);
//        System.out.println(Arrays.toString(queueLinear.getQueue()));
//
//        System.out.println(queueLinear.get());
//        System.out.println(Arrays.toString(queueLinear.getQueue()));
//
//        System.out.println(queueLinear.get());
//        System.out.println(Arrays.toString(queueLinear.getQueue()));
//
//        System.out.println(queueLinear.get());
//        System.out.println(Arrays.toString(queueLinear.getQueue()));
        int val;
        try {
            for (int i = 0; i < 11; i++){
                System.out.print("Попытка сохранения: " + i);
                queueLinear.put(i);
                System.out.println(" - ОК");
            }
        } catch (QueueFullException exception){
            System.out.println(exception);
        }
        System.out.println();

        try {
            for (int i = 0; i < 11; i++){
                val = queueLinear.get();
                System.out.println("Извлеченное значение " + val);
            }
        } catch (QueueEmptyException exception){
            System.out.println(exception);
        }

    }
}
