package book.shildt.chapter9.task10;

public class ClassStack {
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

    void push(char a) throws StackFullException{
        if (vertex == stack.length) {
            throw new StackFullException(size);
        }
        stack[vertex] = a;
        vertex++;
    }


    char pop() throws StackEmptyException {
        if (vertex == 0) {
            throw new StackEmptyException();
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
