package book.shildt.chapter6;

public class StaticClass {

    private static int val = 1;

    static int getVal(){
        return val;
    }

    public static void main(String[] args) {
        System.out.println(StaticClass.getVal());
    }
}
