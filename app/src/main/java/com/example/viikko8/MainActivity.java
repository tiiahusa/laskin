package com.example.viikko8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {

    private EditText firstNumber;
    private EditText secondNumber;
    private TextView answer;

    private float setter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = findViewById(R.id.tbFirstNumber);
        secondNumber = findViewById(R.id.tbSecondNumber);
        answer = findViewById(R.id.lblAnswer);

    }

    public void plus (View view) {
        setter = (Integer.parseInt(firstNumber.getText().toString()) + Integer.parseInt(secondNumber.getText().toString()));
        answer.setText(Float.toString(setter));
    }

    public void minus (View view) {
        setter = (Integer.parseInt(firstNumber.getText().toString()) - Integer.parseInt(secondNumber.getText().toString()));
        answer.setText(Float.toString(setter));
    }

    public void divide (View view) {
        setter = (Float.parseFloat(firstNumber.getText().toString()) / Float.parseFloat(secondNumber.getText().toString()));
        answer.setText(Float.toString(setter));
    }

    public void multiply (View view) {
        setter = (Integer.parseInt(firstNumber.getText().toString()) * Integer.parseInt(secondNumber.getText().toString()));
        answer.setText(Float.toString(setter));
    }
}