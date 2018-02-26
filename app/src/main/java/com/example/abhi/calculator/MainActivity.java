package com.example.abhi.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    //Create reference of Buttons and TextView
    TextView tv;
    Button btnAC, btnsign, btnRoot, btnDivide, btn7, btn8, btn9, btnMultiply, btn6, btn5, btn4, btnMinus, btn3, btn2, btn1, btnPlus, btnC, btn0, btnDot, btnEquals;
    float ValueOne, ValueTwo;
    boolean Addition, Subtract, Multiplication, Division;
    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.editText);
        btnAC = (Button) findViewById(R.id.btnAC);
        btnsign = (Button) findViewById(R.id.btnsign);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btnMultiply = (Button) findViewById(R.id.button10);
        btn6 = (Button) findViewById(R.id.button12);
        btn5 = (Button) findViewById(R.id.button13);
        btn4 = (Button) findViewById(R.id.button14);
        btnMinus = (Button) findViewById(R.id.button15);
        btnRoot = (Button) findViewById(R.id.btnRoot);
        btn3 = (Button) findViewById(R.id.button17);
        btn2 = (Button) findViewById(R.id.button18);
        btn1 = (Button) findViewById(R.id.button19);
        btnPlus = (Button) findViewById(R.id.button20);
        btnC = (Button) findViewById(R.id.button21);
        btn0 = (Button) findViewById(R.id.button22);
        btnDot = (Button) findViewById(R.id.button23);
        btnEquals = (Button) findViewById(R.id.button24);


    }


}
//Reference :// http://hackpundit.com/android-tutorial-simple-calculator-app/
