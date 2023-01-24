package book.shildt.chapter7;

public class DMain {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2);
        System.out.println(triangle.hashCode());
    }
}

class DShape{

}

class Triangle extends DShape{
    private int a;
    Triangle(int a){
        this.a = a;
    }
}

