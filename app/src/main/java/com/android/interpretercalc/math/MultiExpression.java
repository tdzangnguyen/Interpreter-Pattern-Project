package com.android.interpretercalc.math;

import com.android.interpretercalc.calculator.InterpreterEngineContext;
import com.android.interpretercalc.expression.Expression;

public class MultiExpression implements Expression {

    private String expression;

    public MultiExpression (String expression) {
        this.expression = expression;
    }

    @Override
    public int interpret(InterpreterEngineContext context) {
        return context.multi(expression);
    }
}
