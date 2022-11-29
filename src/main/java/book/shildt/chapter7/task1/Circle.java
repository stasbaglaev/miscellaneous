package book.shildt.chapter7.task1;

public class Circle extends TwoDShape {
    private double radius;

    Circle(double radius) {
        super();
        this.radius = radius;
    }


    Circle(Circle object) {
        super(object);
        this.radius = object.radius;
    }


    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}


