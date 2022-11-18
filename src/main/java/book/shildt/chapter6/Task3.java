package book.shildt.chapter6;

public class Task3 {

    public static void main(String[] args) {

//        ClassStack stack = new ClassStack(7);
//        System.out.println("Длина стека: " + stack.getSize());
//        stack.push('a');
//        stack.push('b');
//        stack.printArray();
//        stack.pop();
//        stack.printArray();
//        stack.pop();
//        stack.printArray();
//        stack.pop();
//        stack.printArray();
//        stack.pop();
//        stack.printArray();
//        stack.push('c');
//        stack.printArray();
//        stack.push('d');
//        stack.push('e');
//        stack.push('f');
//        stack.push('g');
//        stack.push('j');
//        stack.push('k');
//        stack.printArray();
//        stack.push('y');
//        stack.printArray();
//        stack.push('z');
//        stack.printArray();
//
//
//        ClassStack stack2 = new ClassStack(stack);
//        System.out.println();
//        System.out.println("Длина стека: " + stack2.getSize());
//        stack2.printArray();
//
//
//        char[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'J', 'K', 'L', 'M', 'O', 'P', 'R',};
//        ClassStack stack3 = new ClassStack(chars);
//        System.out.println();
//        System.out.println("Длина массива: " + chars.length);
//        System.out.println("Длина стека: " + stack3.getSize());
//        stack3.printArray();

        ClassStack stack1 = new ClassStack(10);

        char[] name = {'T', 'o', 'm'};
        ClassStack stack2 = new ClassStack(name);

        char ch;
        int i;

        // поместить символы в стек stack1
        for (i = 0; i < 10; i++)
            stack1.push((char) ('A' + i));

        // создать один стек из другого стека
        ClassStack stack3 = new ClassStack(stack1);

        // отобразить стеки
        System.out.print("Содержимое stack1: ");
        for (i = 0; i < 10; i++) {
            ch = stack1.pop();
            System.out.print(ch);
        }

        System.out.println("\n");
        System.out.print("Содержимое stack2: ");
        for (i = 0; i < 3; i++) {
            ch = stack2.pop();
            System.out.print(ch);
        }

        System.out.println("\n");
        System.out.print("Содержимое stack3: ");
        for (i = 0; i < 10; i++) {
            ch = stack3.pop();
            System.out.print(ch);
        }

    }
}

class ClassStack {
    private char[] stack;
    private int vertex; // вершина стека

    private int size;

    private char getValue;

    public int getSize() {
        return size;
    }

    ClassStack(int size) {
        this.size = size;
        this.stack = new char[this.size];
        this.vertex = 0;
    }


    ClassStack(ClassStack ob) {
        this.size = ob.size;
        this.stack = copyStack(ob);
        this.vertex = ob.vertex;
    }

    ClassStack(char[] arr) {
        this.size = arr.length;
        this.stack = copyStack(arr);
        this.vertex = arr.length;
    }

    private static char[] copyStack(ClassStack ob) {
        char[] newStack = new char[ob.size];
        for (int i = 0; i < ob.vertex; i++) {
            newStack[i] = ob.stack[i];
        }
        return newStack;
    }

    private static char[] copyStack(char[] arr) {
        char[] newStack = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newStack[i] = arr[i];
        }
        return newStack;
    }

    void push(char a) {
        if (vertex == stack.length) {
            System.out.println("Стек заполнен, подождите ... ");
            return;
        }
        stack[vertex] = a;
        //System.out.println("Элемент " + a + " добавлен в стек, в индекс " + vertex);
        vertex++;
    }


    char pop() {
        if (vertex == 0) {
            System.out.println("Стек пуст!");
            return (char) 0;
        }
        vertex--;
        getValue = stack[vertex];
        //System.out.println("Элемент " + getValue + " извлечен из стека, индекс " + vertex);
        delete();
        return getValue;
    }

    private void delete() {
        stack[vertex] = 0;
    }

    void printArray() {
        for (char x : stack) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

