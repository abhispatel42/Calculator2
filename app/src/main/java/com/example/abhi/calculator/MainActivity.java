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

        operands();
    }

    //Add click listeners for all the operation buttons
    public void operators() {
        btnsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag == 1){
                    float Number = Float.parseFloat(tv.getText().toString());
                    Number = Number * (-1);
                    tv.setText(String.valueOf(Number));
                }
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag == 1){
                    ValueOne = Float.parseFloat(tv.getText() + "");
                    Addition = true;
                    tv.setText(null);
                    flag=0;
                }

            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag == 1) {
                    ValueOne = Float.parseFloat(tv.getText() + "");
                    Subtract = true;
                    tv.setText(null);
                    flag=0;
                }
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag == 1) {
                    ValueOne = Float.parseFloat(tv.getText() + "");
                    Multiplication = true;
                    tv.setText(null);
                    flag=0;
                }
            }
        });

        btnRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag == 1) {
                    double Number = Double.parseDouble(tv.getText().toString());
                    Number = Math.sqrt(Number);
                    tv.setText(String.valueOf(Number));
                    flag=0;
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag == 1) {
                    ValueOne = Float.parseFloat(tv.getText() + "");
                    Division = true;
                    tv.setText(null);
                    flag=0;
                }
            }
        });
//Cooresponding actions will be performed respective of which value is TRUE

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag == 1) {
                    ValueTwo = Float.parseFloat(tv.getText() + "");

                    if (Addition == true) {
                        tv.setText(ValueOne + ValueTwo + "");
                        Addition = false;
                        // We again set values to FALSE so that action can be performed again
                    }

                    if (Subtract == true) {
                        tv.setText(ValueOne - ValueTwo + "");
                        Subtract = false;
                    }


                    if (Multiplication == true) {
                        tv.setText(ValueOne * ValueTwo + "");
                        Multiplication = false;
                    }

                    if (Division == true) {
                    }
                    tv.setText(ValueOne / ValueTwo + "");
                    Division = false;
                }
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag == 1) {
                    tv.setText(tv.getText() + ".");
                    flag = 0;
                }
            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //We clear the TextView with one character at a time, just like a backspace
                String str = tv.getText().toString();
                if (str.length() > 1) {
                    str = str.substring(0, str.length() - 1);
                    tv.setText(str);
                } else if (str.length() <= 1) {
                    tv.setText("0");
                }
            }
        });
    }

    //Add click listeners for all the buttons
    public void operands() {
        if (flag == 0) {
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tv.setText(tv.getText() + "1");
                    flag = 1;
                    operators();
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tv.setText(tv.getText() + "2");
                    flag = 1;
                    operators();
                }
            });

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tv.setText(tv.getText() + "3");
                    flag = 1;
                    operators();
                }
            });

            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tv.setText(tv.getText() + "4");
                    flag = 1;
                    operators();
                }
            });

            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tv.setText(tv.getText() + "5");
                    flag = 1;
                    operators();
                }
            });

            btn6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tv.setText(tv.getText() + "6");
                    flag = 1;
                    operators();
                }
            });

            btn7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tv.setText(tv.getText() + "7");
                    flag = 1;
                    operators();
                }
            });

            btn8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tv.setText(tv.getText() + "8");
                    flag = 1;
                    operators();
                }
            });

            btn9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tv.setText(tv.getText() + "9");
                    flag = 1;
                    operators();
                }
            });

            btn0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tv.setText(tv.getText() + "0");
                    flag = 1;
                    operators();
                }
            });

        }

    }
}
//Reference :// http://hackpundit.com/android-tutorial-simple-calculator-app/
