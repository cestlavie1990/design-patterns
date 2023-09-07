package strategy.operation;

@FunctionalInterface
public interface OperationStrategy {
    double execute(double a, double b);
}
