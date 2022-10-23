package calculator.expression;

public class AdditionExpression implements Expression {
    private Expression e1;
    private Expression e2;

    public AdditionExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public double compute() {
        return 0.0;
    }

}