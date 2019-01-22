package com.example.ahegde3.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button,button2,button3,button4,add,sub,mul,divide,ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final Double a,b;
        final boolean addt,mult,divi,subt;
        addt=false;
        mult=false;
        divi=false;
        subt=false;
        button=(Button) findViewById(R.id.button);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        add=(Button) findViewById(R.id.button5);
        sub=(Button) findViewById(R.id.button6);
        mul=(Button) findViewById(R.id.button7);
        divide=(Button) findViewById(R.id.button8);
        ans=(Button) findViewById(R.id.button9);
        final EditText edt1 = (EditText) findViewById(R.id.edt1);;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "4");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "3");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "1");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "2");
            }
        });
     /*   add.setOnClickListener((new View.OnClickListener()   {
            public void onClick(View view) {
                if(edt1.getText().equals(null))
                    edt1.setText(" ");
                else
                {   a=edt1.getText();
                    addt=true;
            }
        }));
        sub.setOnClickListener((new View.OnClickListener()   {
                public void onClick(View view) {
                    if(edt1.getText().equals(null))
                        edt1.setText(" ");
                    else
                    {   a=edt1.getText();
                        subt=true;
                    }
                }));
                mul.setOnClickListener((new View.OnClickListener()   {
                    public void onClick(View view) {
                        if(edt1.getText().equals(null))
                            edt1.setText(" ");
                        else
                        {   a=edt1.getText();
                            mult=true;
                        }
                    }));
                divide.setOnClickListener((new View.OnClickListener()   {
                        public void onClick(View view) {
                            if(edt1.getText().equals(null))
                                edt1.setText(" ");
                            else
                            {   a=edt1.getText();
                                divi=true;
                            }
                        }));
                        mul.setOnClickListener((new View.OnClickListener()   {
                            public void onClick(View view) {
                                if(edt1.getText().equals(null))
                                    edt1.setText(" ");
                                else
                                {   a=edt1.getText();
                                    mult=true;
                                }
                            }));
    */

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }




}
