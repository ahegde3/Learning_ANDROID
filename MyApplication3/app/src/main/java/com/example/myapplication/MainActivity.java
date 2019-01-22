package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     private EditText num1,num2,num3;
     private Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText) findViewById(R.id.editText);
        num2=(EditText) findViewById(R.id.editText2);
        num3=(EditText) findViewById(R.id.editText3);
        add.setOnClickListener(new OnClickListener() {
             @Override
            public void onClick(View view)
            {  int c=Integer.parseInt(num1.getText().toString())+Integer.parseInt(num2.getText().toString());
                num3.setText(c);
            }

        });
    }
}
