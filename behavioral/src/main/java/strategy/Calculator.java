package strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import strategy.operation.OperationStrategy;

@AllArgsConstructor
public class Calculator {
    @Getter
    private OperationStrategy strategy;

    public void setStrategy(final OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(final double a, final double b) {
        return strategy.execute(a, b);
    }
}
