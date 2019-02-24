package com.example.sqlite;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  DataBase a;
  EditText id,name;
  Button add,viewall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=new DataBase(this);
        id=(EditText)findViewById(R.id.textView3);
        name=(EditText)findViewById(R.id.textView4);
        add=(Button)findViewById(R.id.button);
        viewall=(Button)findViewById(R.id.button2);
        Add();
        viewAll();
    }

    public void Add()
    {
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Boolean val=  a.insertData(id.getText().toString(),name.getText().toString());
              if(val==true) Toast.makeText(MainActivity.this,"inserted",Toast.LENGTH_LONG).show();
              else Toast.makeText(MainActivity.this,"failed",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void viewAll()
    {
        viewall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res=a.getData();
                if(res.getCount() ==0) {
                    show("error", "nothing found");
                    return;
                }
                StringBuffer buffer=new StringBuffer();
                while(res.moveToNext()) {
                    buffer.append("id :"+res.getString(0)+"\n");
                    buffer.append("name :"+res.getString(1)+"\n");
                }
                show("data",buffer.toString());
                }



        });
    }
    public void show(String title,String mssg) {
        AlertDialog.Builder bld=new AlertDialog.Builder(this);
        bld.setCancelable(true);
        bld.setTitle(title);
        bld.setMessage(mssg);
        bld.show();
    }

}
