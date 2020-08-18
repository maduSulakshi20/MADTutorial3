package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText inputNumber1;
    EditText inputNumber2;
    String num1;
    String num2;

    int n1;
    int n2;
    TextView LblSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        inputNumber1 = findViewById(R.id.inputNumber1);
        inputNumber2 = findViewById(R.id.inputNumber2);
        LblSum = findViewById(R.id.LblSum);

        Intent intent1 = getIntent();
        num1 = intent1.getStringExtra("N1");
        num2 = intent1.getStringExtra("N2");

        inputNumber1.setText(num1);
        inputNumber2.setText(num2);

        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);

    }

    public void Add(View v){
        LblSum.setText(num1 +" + "+ num2 + " = " +(n1+n2));
    }
    public void Subtraction(View v){
        LblSum.setText(num1 +" - "+ num2 + " = " +(n1-n2));
    }
    public void Multiplication(View v){
        LblSum.setText(num1 +" * "+ num2 + " = " +(n1*n2));
    }
    public void Division(View v){
        LblSum.setText(num1 +" / "+ num2 + " = " +(n1/n2));
    }
}