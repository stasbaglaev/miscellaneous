package book.shildt.chapter6;

class Block {
    {
        System.out.println("Блок инициализации класса Block");
    }

    Block() {
        System.out.println("Конструктор класса Block");
    }
}

public class NoStaticBlock2 extends Block {
    {
        System.out.println("Блок инициализации класса NoStaticBlock2");
    }

    NoStaticBlock2() {
        System.out.println("Конструктор класса NoStaticBlock2");
    }

    public static void main(String[] args) {
        NoStaticBlock2 noStaticBlock2 = new NoStaticBlock2();
    }
}
