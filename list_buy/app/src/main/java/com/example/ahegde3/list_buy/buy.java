package com.example.ahegde3.list_buy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class buy extends AppCompatActivity {


    RadioButton a,b,c;
    TextView edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        a=(RadioButton)findViewById(R.id.radioButton);
        b=(RadioButton)findViewById(R.id.radioButton2);
        c=(RadioButton)findViewById(R.id.radioButton3);
        edt=(TextView)findViewById(R.id.edt);
        a.setVisibility(View.VISIBLE);
        b.setVisibility(View.VISIBLE);
        c.setVisibility(View.VISIBLE);



    }
    public void calculate(View v)
    {
        if(a.equals(true))
            edt.setText("20");
        if(a.equals(true)&& b.equals(true))
            edt.setText("60");
    }
}
