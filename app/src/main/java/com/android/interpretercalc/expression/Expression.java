package com.android.interpretercalc.expression;

import com.android.interpretercalc.calculator.InterpreterEngineContext;

public interface Expression {
    int interpret(InterpreterEngineContext context);

}
