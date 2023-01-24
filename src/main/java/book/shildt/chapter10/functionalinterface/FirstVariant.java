package book.shildt.chapter10.functionalinterface;

import java.util.function.DoubleUnaryOperator;

public class FirstVariant {
    public static void main(String[] args) {
        System.out.println(new NoNameClass().applyAsDouble(10.0));
    }

}


class NoNameClass implements DoubleUnaryOperator {

    @Override
    public double applyAsDouble(double operand) {
        return operand + 1;
    }
}