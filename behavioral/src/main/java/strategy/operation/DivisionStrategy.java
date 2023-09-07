package strategy.operation;

public class DivisionStrategy implements OperationStrategy {

    @Override
    public double execute(double a, double b) {
        return a / b;
    }
}
