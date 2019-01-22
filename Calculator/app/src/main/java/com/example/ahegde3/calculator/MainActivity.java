package com.example.ahegde3.calculator;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import junit.runner.BaseTestRunner;

public class MainActivity extends AppCompatActivity {
    Button one,two,three,four,five,six,seven,eight,nine;
    Button zero,a,b,c,d,e,f,eq,plus,minus,mult,div;
    RadioButton hex,bin,oct,dec;
    Double num1=new Double(0);
    String buf=new String();

    TextView text;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buf="";
        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.four);
        five=(Button)findViewById(R.id.five);
        six=(Button)findViewById(R.id.six);
        seven=(Button)findViewById(R.id.seven);
        eight=(Button)findViewById(R.id.eight);
        nine=(Button)findViewById(R.id.nine);
        zero=(Button)findViewById(R.id.zero);
        a=(Button)findViewById(R.id.a);
        b=(Button)findViewById(R.id.b);
        c=(Button)findViewById(R.id.c);
        d=(Button)findViewById(R.id.d);
        e=(Button)findViewById(R.id.e);
        f=(Button) findViewById(R.id.f);
        hex=(RadioButton)findViewById(R.id.hex);
        bin=(RadioButton)findViewById(R.id.bin);
        oct=(RadioButton)findViewById(R.id.octal);
        dec=(RadioButton)findViewById(R.id.decimal);
        text=(TextView)findViewById((R.id.editText));

        one.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {   switch(buf) {
                case "":
                    text.setText("1");
                    num1 = (double)1;
                    break;
                case "+":
                    text.setText(text.getText() + "1");
                    num1 = num1 + 1;
                    break;
                case "-":
                    text.setText(text.getText() + "1");
                    num1 = num1 - 1;
                    break;
                case "*":
                    text.setText(text.getText() + "1");
                    num1 = num1 * 1;
                    break;
                case "/":
                    text.setText(text.getText() + "1");
                    num1 = num1 / 1;
                    break;
            }
            }
        });
        two.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {   switch(buf) {
                case "":
                    text.setText("2");
                    num1 = (double)2;
                    break;
                case "+":
                    text.setText(text.getText() + "2");
                    num1 = num1 + 2;
                    break;
                case "-":
                    text.setText(text.getText() + "2");
                    num1 = num1 - 2;
                    break;
                case "*":
                    text.setText(text.getText() + "2");
                    num1 = num1 * 2;
                    break;
                case "/":
                    text.setText(text.getText() + "2");
                    num1 = num1 / 2;
                    break;
            }
            }
        });

        three.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {   switch(buf) {
                case "":
                    text.setText("3");
                    num1 = (double)3;
                    break;
                case "+":
                    text.setText(text.getText() + "3");
                    num1 = num1 + 3;
                    break;
                case "-":
                    text.setText(text.getText() + "3");
                    num1 = num1 - 3;
                    break;
                case "*":
                    text.setText(text.getText() + "3");
                    num1 = num1 * 3;
                    break;
                case "/":
                    text.setText(text.getText() + "3");
                    num1 = num1 / 3;
                    break;
            }
            }
        });

        four.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {   switch(buf) {
                case "":
                    text.setText("4");
                    num1 =(double) 4;
                    break;
                case "+":
                    text.setText(text.getText() + "4");
                    num1 = num1 + 4;
                    break;
                case "-":
                    text.setText(text.getText() + "4");
                    num1 = num1 - 4;
                    break;
                case "*":
                    text.setText(text.getText() + "4");
                    num1 = num1 * 4;
                    break;
                case "/":
                    text.setText(text.getText() + "4");
                    num1 = num1 / 4;
                    break;
            }
            }
        });

        five.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {   switch(buf) {
                case "":
                    text.setText("5");
                    num1 = (double)5;
                    break;
                case "+":
                    text.setText(text.getText() + "5");
                    num1 = num1 + 5;
                    break;
                case "-":
                    text.setText(text.getText() + "5");
                    num1 = num1 - 5;
                    break;
                case "*":
                    text.setText(text.getText() + "5");
                    num1 = num1 * 5;
                    break;
                case "/":
                    text.setText(text.getText() + "5");
                    num1 = num1 / 5;
                    break;
            }
            }
        });
        six.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {   switch(buf) {
                case "":
                    text.setText("6");
                    num1 = (double)6;
                    break;
                case "+":
                    text.setText(text.getText() + "6");
                    num1 = num1 + 6;
                    break;
                case "-":
                    text.setText(text.getText() + "6");
                    num1 = num1 - 6;
                    break;
                case "*":
                    text.setText(text.getText() + "6");
                    num1 = num1 * 6;
                    break;
                case "/":
                    text.setText(text.getText() + "6");
                    num1 = num1 / 6;
                    break;
            }
            }
        });

        seven.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {   switch(buf) {
                case "":
                    text.setText("7");
                    num1 = (double)7;
                    break;
                case "+":
                    text.setText(text.getText() + "7");
                    num1 = num1 + 7;
                    break;
                case "-":
                    text.setText(text.getText() + "7");
                    num1 = num1 - 7;
                    break;
                case "*":
                    text.setText(text.getText() + "7");
                    num1 = num1 * 7;
                    break;
                case "/":
                    text.setText(text.getText() + "7");
                    num1 = num1 / 7;
                    break;
            }
            }
        });

        eight.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {   switch(buf) {
                case "":
                    text.setText("8");
                    num1 = (double)8;
                    break;
                case "+":
                    text.setText(text.getText() + "8");
                    num1 = num1 + 8;
                    break;
                case "-":
                    text.setText(text.getText() + "8");
                    num1 = num1 - 8;
                    break;
                case "*":
                    text.setText(text.getText() + "8");
                    num1 = num1 * 8;
                    break;
                case "/":
                    text.setText(text.getText() + "8");
                    num1 = num1 / 8;
                    break;
            }
            }
        });
        nine.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {   switch(buf) {
                case "":
                    text.setText("9");
                    num1 = (double)9;
                    break;
                case "+":
                    text.setText(text.getText() + "9");
                    num1 = num1 + 9;
                    break;
                case "-":
                    text.setText(text.getText() + "9");
                    num1 = num1 - 9;
                    break;
                case "*":
                    text.setText(text.getText() + "9");
                    num1 = num1 * 9;
                    break;
                case "/":
                    text.setText(text.getText() + "9");
                    num1 = num1 / 9;
                    break;
            }
            }
        });
        a.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                text.setText("A");
                num1=(double)10;
            }
        });

        b.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                text.setText(text.getText()+"B");
                num1=num1+11;
            }
        });

/*        plus.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {   buf="+";
                text.setText(text.getText()+"+");

            }
        });

        minus.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {   buf="-";
                text.setText(text.getText()+"-");

            }
        });

        mult.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v) {
                buf = "*";
                text.setText(text.getText() + "*");
            }});
        div.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v) {
                buf = "/";
                text.setText(text.getText() + "/");
            }});


*/

    }

}
