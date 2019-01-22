package com.example.ahegde3.name;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;

public class Name extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Creates a container
        RelativeLayout first=new RelativeLayout(this);

        //Button and its property
        Button a=new Button(this);
        a.setText("CLick me to know my name");
        a.setBackgroundColor(Color.LTGRAY);
        a.setId(1);
        //Create a edittext
        EditText b=new EditText(this);
        b.setId(2);

         // USe to tell positions the contents in the page
        RelativeLayout.LayoutParams buttondetails=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        buttondetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttondetails.addRule(RelativeLayout.CENTER_VERTICAL);
        //IT will be place at exact center

        // USe to tell positions the contents in the page
        RelativeLayout.LayoutParams nm=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        nm.addRule(RelativeLayout.CENTER_HORIZONTAL);
        nm.addRule(RelativeLayout.ABOVE,a.getId());
        nm.setMargins(0,0,0,500);

        first.setBackgroundColor(Color.CYAN);

        //Button and its property

        //Button is added inside the container
        first.addView(a,buttondetails);
        first.addView(b,nm);
        //Container is linked to the activity.
        setContentView(first);


    }
}
