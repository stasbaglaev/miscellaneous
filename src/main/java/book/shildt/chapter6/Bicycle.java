package book.shildt.chapter6;

public class Bicycle {
    private int sizeWheel;

    Bicycle(int sizeWheel) {
        Wheel wheel = new Wheel(sizeWheel);
    }

    public int getSizeWheel() {
        return sizeWheel;
    }

    public void ride(){
        HandlerBar handlerBar = new HandlerBar();
        handlerBar.right();
    }

    //класс отвечающий за создание объекта "Колесо"
    private class Wheel {
        Wheel(int size) {
            sizeWheel = size;
        }

    }

    //класс отвечающий за создание объекта "Руль"
    protected class HandlerBar {
        void left() {
            System.out.println("Руль влево!");
        }

        void right() {
            System.out.println("Руль вправо!");
        }

    }

}

class MainBicycle {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(17);
        System.out.println(bicycle.getSizeWheel());
        Bicycle.HandlerBar handlerBar = bicycle.new HandlerBar();

        handlerBar.left();

        bicycle.ride();
    }
}
