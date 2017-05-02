package com.example.manuel.ezcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText firstNumberEdit;
    private EditText secondNumberEdit;
    private TextView result;
    private Button addButton;
    private Button subButton;
    private Button devideButton;
    private Button multButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.firstNumberEdit = (EditText) findViewById(R.id.firstNumber);
        this.secondNumberEdit = (EditText) findViewById(R.id.secondNumber);
        this.result = (TextView) findViewById(R.id.resultNumber);
        this.addButton = (Button) findViewById(R.id.addButton);
        this.subButton = (Button) findViewById(R.id.subButton);
        this.multButton = (Button) findViewById(R.id.multButton);
        this.devideButton = (Button) findViewById(R.id.divButton);
    }

    public void addButtonPressed(View view){
        if (!this.firstNumberEdit.getText().toString().equals("") && !this.secondNumberEdit.getText().toString().equals("")) {
            Float first = Float.parseFloat(String.valueOf(this.firstNumberEdit.getText()));
            Float second = Float.parseFloat(String.valueOf(this.secondNumberEdit.getText()));
            Float resultval = first + second;
            this.result.setText(resultval.toString());
        }
    }

    public void subButtonPressed(View view){
        if (!this.firstNumberEdit.getText().toString().equals("") && !this.secondNumberEdit.getText().toString().equals("")) {
            Float first = Float.parseFloat(String.valueOf(this.firstNumberEdit.getText()));
            Float second = Float.parseFloat(String.valueOf(this.secondNumberEdit.getText()));
            Float resultval = first - second;
            this.result.setText(resultval.toString());
        }
    }

    public void multButtonPressed(View view){
        if (!this.firstNumberEdit.getText().toString().equals("") && !this.secondNumberEdit.getText().toString().equals("")) {
            Float first = Float.parseFloat(String.valueOf(this.firstNumberEdit.getText()));
            Float second = Float.parseFloat(String.valueOf(this.secondNumberEdit.getText()));
            Float resultval = first * second;
            this.result.setText(resultval.toString());
        }
    }

    public void divButtonPressed(View view){
        if (!this.firstNumberEdit.getText().toString().equals("") && !this.secondNumberEdit.getText().toString().equals("")) {
            Float first = Float.parseFloat(String.valueOf(this.firstNumberEdit.getText()));
            Float second = Float.parseFloat(String.valueOf(this.secondNumberEdit.getText()));
            Float resultval = first / second;
            this.result.setText(resultval.toString());
        }
    }

    public void upButtonPressed(View view){
        Float resultval = Float.parseFloat(String.valueOf(this.result.getText()));
        this.firstNumberEdit.setText(resultval.toString());
        this.result.setText("0");
    }
}
