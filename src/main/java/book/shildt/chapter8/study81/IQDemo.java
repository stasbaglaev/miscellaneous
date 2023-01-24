package book.shildt.chapter8.study81;

class IQDemo {

    public static void main(String[] args) {
        QueueLinear queueLinear = new QueueLinear(10);
        QueueDynamic queueDynamic = new QueueDynamic(5);
        QueueCircular queueCircular = new QueueCircular(10);

        ICharQ queue;

        int val;
        int i;

        queue = queueLinear;
        // Помещение ряда символов в очередь фиксированного размера
        for (i = 0; i < 10; i++) {
            queue.put(i);
        }
        // Отображение содержимого очереди
        System.out.print("Содержимое фиксированной очереди: ");
        for (i = 0; i < 10; i++) {
            val = queue.get();
            System.out.print(val + " ");
        }
        System.out.println();

        queue = queueDynamic;
        // Помещение ряда символов в динамическую очередь
        for (i = 0; i < 10; i++) {
            queue.put(i);
        }
        // Отображение содержимого очереди
        System.out.print("Содержимое динамической очереди: ");
        for (i = 0; i < 10; i++) {
            val = queue.get();
            System.out.print(val + " ");

        }
        System.out.println();


        queue = queueCircular;
        // Помещение ряда символов в кольцевую очередь
        for (i = 0; i < 10; i++) {
            queue.put(i);
        }
        // Отображение содержимого очереди
        System.out.print("Содержимое кольцевой очереди: ");
        for (i = 0; i < 10; i++) {
            val = queue.get();
            System.out.print(val + " ");
        }
        System.out.println();

        // Помещение дополнительных символов в кольцевую очередь
        for (i = 10; i < 20; i++) {
            queue.put(i);
        }
        // Отображение содержимого очереди
        System.out.print("Содержимое кольцевой очереди: ");
        for (i = 0; i < 10; i++) {
            val = queue.get();
            System.out.print(val + " ");
        }

        System.out.println("\nСохранение и использование данных кольцевой очереди.");
        // Помещение символов в кольцевую очередь с последующим их извлечением
        for (i = 0; i < 20; i++) {
            queue.put(i);
            val = queue.get();
            System.out.print(val + " ");
        }

    }
}
