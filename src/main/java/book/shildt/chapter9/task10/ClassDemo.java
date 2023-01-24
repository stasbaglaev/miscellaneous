package book.shildt.chapter9.task10;

public class ClassDemo {

    public static void main(String[] args) {

        ClassStack stack1 = new ClassStack(10);
        char ch;
        // поместить символы в стек stack
        for (int i = 0; i < 11; i++)
            try {
                stack1.push((char) ('A' + i));
            } catch (StackFullException exception) {
                System.out.println(exception);
            }

        // отобразить стеки
        System.out.print("Содержимое stack: ");
        for (int i = 0; i < 11; i++) {
            try {
                ch = stack1.pop();
                System.out.print(ch);
            } catch (StackEmptyException exception) {
                System.out.println(exception);
            }
        }

    }
}
