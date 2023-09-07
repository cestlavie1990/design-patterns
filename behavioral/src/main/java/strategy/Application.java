package strategy;

import lombok.extern.slf4j.Slf4j;
import strategy.operation.*;

@Slf4j
public class Application {

    private static final class Strategy {
        private static final OperationStrategy ADDITION = new AdditionStrategy();
        private static final OperationStrategy DIVISION = new DivisionStrategy();
        private static final OperationStrategy MULTIPLICATION = new MultiplicationStrategy();
        private static final OperationStrategy SUBTRACTION = new SubtractionStrategy();
    }

    public static void main(String[] args) {
        final var instance = new Calculator(new AdditionStrategy());

        var a = 10;
        var b = 15;

        addition(instance, a, b);
        division(instance, a, b);
        multiplication(instance, a, b);
        subtraction(instance, a, b);
    }

    private static void addition(final Calculator instance, final double a, final double b) {
        if (!(instance.getStrategy() instanceof AdditionStrategy)) {
            instance.setStrategy(Strategy.ADDITION);
        }
        log.info("Addition result: {}", instance.calculate(a, b));
    }

    private static void division(final Calculator instance, final double a, final double b) {
        if (!(instance.getStrategy() instanceof DivisionStrategy)) {
            instance.setStrategy(Strategy.DIVISION);
        }
        log.info("Division result: {}", instance.calculate(a, b));
    }

    private static void multiplication(final Calculator instance, final double a, final double b) {
        if (!(instance.getStrategy() instanceof MultiplicationStrategy)) {
            instance.setStrategy(Strategy.MULTIPLICATION);
        }
        log.info("Multiplication result: {}", instance.calculate(a, b));
    }

    private static void subtraction(final Calculator instance, final double a, final double b) {
        if (!(instance.getStrategy() instanceof SubtractionStrategy)) {
            instance.setStrategy(Strategy.SUBTRACTION);
        }
        log.info("Subtraction result: {}", instance.calculate(a, b));
    }

}
