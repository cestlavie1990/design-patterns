package strategy.operation;

public class SubtractionStrategy implements OperationStrategy {
    @Override
    public double execute(double a, double b) {
        return a - b;
    }
}
