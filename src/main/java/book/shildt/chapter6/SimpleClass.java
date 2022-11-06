package book.shildt.chapter6;


public class SimpleClass {

    SuperInnerSimpleClass superInnerSimpleClass = new SuperInnerSimpleClass();
    static String string;
     void test(){
        System.out.println(string);
    }
    protected class InnerSimpleClass{
            void say(){
                string = "hallo";
                test();
            }
    }

    private class SuperInnerSimpleClass extends InnerSimpleClass{

        InnerSimpleClass innerSimpleClass = new InnerSimpleClass();

    }

    public static void main(String[] args) {
        SimpleClass simpleClass = new SimpleClass();
        InnerSimpleClass innerSimpleClass = simpleClass.new InnerSimpleClass();
        innerSimpleClass.say();


    }

}



