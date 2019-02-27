package com.example.andlabb.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual;
    EditText txt;
    boolean addtxt,subtxt,divtxt,multxt;
    float num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.button6);
        button1 = (Button) findViewById(R.id.button7);
        button2 = (Button) findViewById(R.id.button8);
        button3 = (Button) findViewById(R.id.button9);
        button4 = (Button) findViewById(R.id.button10);
        button5 = (Button) findViewById(R.id.button11);
        button6 = (Button) findViewById(R.id.button12);
        button7 = (Button) findViewById(R.id.button13);
        button8 = (Button) findViewById(R.id.button14);
        button9 = (Button) findViewById(R.id.button15);
        button10= (Button) findViewById(R.id.button18);
        buttonC= (Button) findViewById(R.id.button);
        buttonAdd=(Button) findViewById(R.id.button4);
        buttonSub=(Button) findViewById(R.id.button5);
        buttonDivision=(Button) findViewById(R.id.button2);
        buttonMul=(Button) findViewById(R.id.button3);
        buttonEqual= (Button) findViewById(R.id.button17);
        txt=(EditText) findViewById(R.id.editText);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txt == null)
                {
                    txt.setText("");
                } else {
                   num1 = Float.parseFloat(txt.getText() + "");
                    addtxt= true;
                    txt.setText(null);
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txt == null)
                {
                    txt.setText("");
                } else {
                    num1 = Float.parseFloat(txt.getText() + "");
                    subtxt= true;
                    txt.setText(null);
                }
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txt == null)
                {
                    txt.setText("");
                } else {
                    num1 = Float.parseFloat(txt.getText() + "");
                    multxt= true;
                    txt.setText(null);
                }
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txt == null)
                {
                    txt.setText("");
                } else {
                    num1 = Float.parseFloat(txt.getText() + "");
                    divtxt= true;
                    txt.setText(null);
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Float.parseFloat(txt.getText() + "");

                if (addtxt == true) {
                    txt.setText(num1 + num2 + "");
                    addtxt = false;
                }

                if (subtxt == true) {
                    txt.setText(num1 - num2 + "");
                    subtxt = false;
                }
                if (multxt == true) {
                    txt.setText(num1 * num2 + "");
                    multxt = false;
                }
                if (divtxt == true) {
                    txt.setText(num1 / num2 + "");
                    divtxt = false;
                }


            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               txt.setText("");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               txt.setText(txt.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               txt.setText(txt.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               txt.setText(txt.getText() + "0");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               txt.setText(txt.getText() + ".");
            }
        });
    }
}
