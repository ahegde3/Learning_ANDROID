package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText eid,pwd;
    private Button signin,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eid=(EditText)findViewById(R.id.editText);
        pwd=(EditText)findViewById(R.id.editText2);
        signin=(Button)findViewById(R.id.button1);
        signup=(Button)findViewById(R.id.button2);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"COMING SOON",Toast.LENGTH_LONG).show();
            }
        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emai_pattern="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                String e=eid.getText().toString();
                /*if(e.matches(emai_pattern) && pwd.length()>0) */

                 if(eid.getText().toString().equals("admin"))
                { Intent a=new Intent(MainActivity.this,user_page.class);
                startActivity(a);
                }
                else Toast.makeText(getApplicationContext(),"Email or psswrd invalid",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
