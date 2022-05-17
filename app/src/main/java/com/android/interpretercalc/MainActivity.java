package com.android.interpretercalc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.android.interpretercalc.calculator.InterpreterEngineContext;
import com.android.interpretercalc.expression.Expression;
import com.android.interpretercalc.math.AddExpression;
import com.android.interpretercalc.math.DivideExpression;
import com.android.interpretercalc.math.MultiExpression;
import com.android.interpretercalc.math.SubtractExpression;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @SuppressLint("LongLogTag")
    public void takeEdit(View view) throws InterruptedException {
        EditText editText = findViewById(R.id.contentText);
        TextView textView = findViewById(R.id.result);
        String input = editText.getText().toString();
        Log.d("Nội dung Edit Text", input);
        textView.setText(interpret(input));
        Log.d("Nội dung Interpreter Text", interpret(input));
    }

    private static String interpret(String input) {
        Expression exp = null;
        if (input.contains("cộng") || input.contains("+")) {
            exp = new AddExpression(input);
        } else if (input.contains("trừ") || input.contains("-")) {
            exp = new SubtractExpression(input);
        } else if (input.contains("nhân") || input.contains("*")) {
            exp = new MultiExpression(input);
        } else if (input.contains("chia") || input.contains("/")) {
            exp = new DivideExpression(input);
        } else {
            return "Vui lòng nhập đúng cú pháp";
        }
        return String.valueOf(exp.interpret(new InterpreterEngineContext()));
    }

    public void clearEdit(View view) {
        EditText editText = findViewById(R.id.contentText);
        editText.setText("");
    }
}