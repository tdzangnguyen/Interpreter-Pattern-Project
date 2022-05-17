package com.android.interpretercalc.math;

import android.util.Log;

import com.android.interpretercalc.calculator.InterpreterEngineContext;
import com.android.interpretercalc.expression.Expression;

public class DivideExpression implements Expression {

    private String expression;

    public DivideExpression (String expression) {
        this.expression = expression;
    }

    @Override
    public int interpret(InterpreterEngineContext context) {
        return context.divide(expression);
    }
}
