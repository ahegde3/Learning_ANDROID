package com.example.dual_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   private static Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onCLickButtonListner();
    }
    public void onCLickButtonListner()
    {
        submit=(Button)findViewById(R.id.button1);
        submit.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent a=new Intent(MainActivity.this,secondActivity.class);
                startActivity(a);
            }
        });
    }
}
