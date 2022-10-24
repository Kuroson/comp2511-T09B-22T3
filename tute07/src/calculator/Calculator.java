package calculator;

import calculator.expression.Expression;

public class Calculator {
    private Expression expression;

    public Calculator(Expression expression) {
        this.expression = expression;
    }

    /**
     * @return computed expression
     */
    public double calculate() {
        return this.expression.compute();
    }

}
