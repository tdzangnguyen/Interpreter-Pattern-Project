package com.android.interpretercalc.math;

import com.android.interpretercalc.calculator.InterpreterEngineContext;
import com.android.interpretercalc.expression.Expression;

public class SubtractExpression implements Expression {

    private String expression;

    public SubtractExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public int interpret(InterpreterEngineContext context) {
        return context.subtract(expression);
    }
}
