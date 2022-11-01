package book.shildt.chapter6;

public class NoStaticBlock {
    int a;
    {
        System.out.println("Не статический блок инициализации");
        a = 0;
    }

    NoStaticBlock(){
        System.out.println("Конструктор");
        this.a++;
    }
}
