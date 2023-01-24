package book.shildt.chapter6;

public class Task4 {

    public static void main(String[] args) {

        Test test1 = new Test(5);
        Test test2 = new Test(10);

        System.out.println("Значения переменных до обмена:");
        System.out.println("Значение переменной а объекта test1: " + test1.a);
        System.out.println("Значение переменной а объекта test2: " + test2.a);
        test1.swap(test2);
        System.out.println("Значения переменных после обмена:");
        System.out.println("Значение переменной а объекта test1: " + test1.a);
        System.out.println("Значение переменной а объекта test2: " + test2.a);
    }

}

class Test{
    int a;

    public Test(int i) {
        this.a = i;
    }


    void swap(Test ob){
        int temp = ob.a;
        ob.a = this.a;
        this.a = temp;
    }
}
