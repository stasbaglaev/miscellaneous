package book.shildt.chapter8.study81;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        QueueCircular queueCircular = new QueueCircular(3);
//
//        System.out.println(queueCircular.get());
//        System.out.println(queueCircular.get());
//        System.out.println(queueCircular.getCapacity());
//
//        queueCircular.put(10);
//        System.out.println(Arrays.toString(queueCircular.getQueue()));
//
//        queueCircular.put(20);
//        System.out.println(Arrays.toString(queueCircular.getQueue()));
//
//        queueCircular.put(30);
//        System.out.println(Arrays.toString(queueCircular.getQueue()));
//
//        System.out.println(queueCircular.get());
//        System.out.println(Arrays.toString(queueCircular.getQueue()));
//
//        System.out.println(queueCircular.get());
//        System.out.println(Arrays.toString(queueCircular.getQueue()));
//
//        System.out.println(queueCircular.get());
//        System.out.println(Arrays.toString(queueCircular.getQueue()));
//
//        System.out.println(queueCircular.get());
//        System.out.println(Arrays.toString(queueCircular.getQueue()));
//
//        queueCircular.put(40);
//        System.out.println(Arrays.toString(queueCircular.getQueue()));



        QueueDynamic queueDynamic = new QueueDynamic(2);

        queueDynamic.put(10);
        System.out.println(Arrays.toString(queueDynamic.getQueue()));
        queueDynamic.put(20);
        System.out.println(queueDynamic.getCapacity());
        System.out.println(Arrays.toString(queueDynamic.getQueue()));
        queueDynamic.put(30);
        System.out.println(Arrays.toString(queueDynamic.getQueue()));
        System.out.println(queueDynamic.getCapacity());

        System.out.println(queueDynamic.get());
        System.out.println(Arrays.toString(queueDynamic.getQueue()));

        System.out.println(queueDynamic.get());
        System.out.println(Arrays.toString(queueDynamic.getQueue()));

        System.out.println(queueDynamic.get());
        System.out.println(Arrays.toString(queueDynamic.getQueue()));

        System.out.println(queueDynamic.get());
        System.out.println(Arrays.toString(queueDynamic.getQueue()));


        queueDynamic.put(40);
        System.out.println(Arrays.toString(queueDynamic.getQueue()));

        queueDynamic.put(50);
        System.out.println(Arrays.toString(queueDynamic.getQueue()));

        queueDynamic.put(60);
        System.out.println(Arrays.toString(queueDynamic.getQueue()));

        queueDynamic.put(70);
        System.out.println(Arrays.toString(queueDynamic.getQueue()));

        queueDynamic.put(80);
        System.out.println(Arrays.toString(queueDynamic.getQueue()));

        System.out.println(queueDynamic.get());
        System.out.println(Arrays.toString(queueDynamic.getQueue()));

        System.out.println(queueDynamic.get());
        System.out.println(Arrays.toString(queueDynamic.getQueue()));

        System.out.println(queueDynamic.get());
        System.out.println(Arrays.toString(queueDynamic.getQueue()));

        System.out.println(queueDynamic.get());
        System.out.println(Arrays.toString(queueDynamic.getQueue()));

        queueDynamic.reset();
        System.out.println(Arrays.toString(queueDynamic.getQueue()));
        System.out.println(queueDynamic.getCapacity());


//        QueueLinear queueLinear = new QueueLinear(2);
//
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



    }
}
