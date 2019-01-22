package com.example.ahegde3.distance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button miles2km=(Button)findViewById(R.id.button);
    Button km2miles=(Button)findViewById(R.id.button2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button miles2km=(Button)findViewById(R.id.button);
        Button km2miles=(Button)findViewById(R.id.button2);

        miles2km.setOnClickListener(new View.OnClickListener()
        {
        public void onClick(View v)
        {
            EditText km = (EditText) findViewById(R.id.editText);
            EditText mile = (EditText) findViewById(R.id.editText2);
            Double a = Double.valueOf(mile.getText().toString());
            Double b = a * 1.60934;
            mile.setText(b.toString());
        }
    } );
    km2miles.setOnClickListener( new View.OnClickListener() {
        public void onClick(View v)
        {   EditText km=(EditText) findViewById(R.id.editText);
            EditText mile=(EditText)  findViewById(R.id.editText2);
            Double b=Double.valueOf( km.getText().toString());
            Double a=b/1.60934;
            mile.setText(a.toString());

        } });
} }
