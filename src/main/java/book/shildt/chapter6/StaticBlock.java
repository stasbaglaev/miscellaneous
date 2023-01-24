package book.shildt.chapter6;

public class StaticBlock {
    static int a;

    static {
        System.out.println("Статический блок");
        a++;
    }

    StaticBlock(){
        System.out.println("Конструктор");
    }


    public static void main(String[] args) {

    }

}
