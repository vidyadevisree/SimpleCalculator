package com.example.simplecalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView t1;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean getNumbers()
    {
        e1 = (EditText)findViewById(R.id.num1);
        e2 = (EditText)findViewById(R.id.num2);
        t1 = (TextView)findViewById(R.id.result);
        String s1 = e1.getText().toString();
         String s2 = e2.getText().toString();
            num1 = Integer.parseInt(e1.getText().toString());
            num2 = Integer.parseInt(e2.getText().toString());
            return true;
    }
    public void doSum(View v) {
        if (getNumbers()) {
            int result = num1 + num2;
            t1.setText(Integer.toString(result));
        }
        }

    public void doMul(View v) {
            if (getNumbers()) {
                int result = num1 * num2;
                t1.setText(Integer.toString(result));
        }
    }

    public void doSub(View v) {
        if (getNumbers()) {
            int result = num1 - num2;
            t1.setText(Integer.toString(result));
        }

    }


    public void doDivide(View view) {
        if (getNumbers()) {
            double result = num1 / (num2 * 1.0);
            t1.setText(Double.toString(result));
        }
    }

    public void doMod(View view) {
        if (getNumbers()) {
            double result = num1 % num2;
            t1.setText(Double.toString(result));
        }
        }
}
