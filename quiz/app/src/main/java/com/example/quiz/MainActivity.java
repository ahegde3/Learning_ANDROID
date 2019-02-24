package com.example.quiz;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  private RadioButton q1a,q1b,q2a,q2b;
  private Button submit;
  private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        q1a=findViewById(R.id.radioButton);
        q1b=findViewById(R.id.radioButton2);
        q2a=findViewById(R.id.radioButton3);
        q2b=findViewById(R.id.radioButton4);
        submit=findViewById(R.id.button);
        context=this;
        q1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q1b.setChecked(false);
            }
        });
        q1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q1a.setChecked(false);
            }
        });
        q2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q2b.setChecked(false);
            }
        });
        q2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q2a.setChecked(false);
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new

                        AlertDialog.Builder(

                        context);
// set title
                alertDialogBuilder.setTitle("Do you want to submit");
// set dialog message
                alertDialogBuilder
                        .setMessage("Click yes to submit!")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new

                                DialogInterface.OnClickListener() {

                                    public void onClick(DialogInterface dialog, int id) {

// if this button is clicked, close
// current activity
                                        if((q1a.isChecked() && !q1b.isChecked() || !q1a.isChecked() && q1b.isChecked()) && (q2a.isChecked() && !q2b.isChecked() || !q2a.isChecked() && q2b.isChecked()))
                                        { Intent a=new Intent(MainActivity.this,sol.class);
                                             int score=0;
                                             if(q1b.isChecked()) score++;
                                             if(q2a.isChecked()) score++;
                                             a.putExtra("score",Integer.toString(score));
                                            startActivity(a);}
                                            else
                                            Toast.makeText(context,"Attempt all questions",Toast.LENGTH_LONG).show();
                                    }
                                })
                        .setNegativeButton("No", new

                                DialogInterface.OnClickListener() {

                                    public void onClick(DialogInterface dialog, int id) {

// if this button is clicked, just close
// the dialog box and do nothing
                                        dialog.cancel();
                                    }
                                });
// create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();
// show it
                alertDialog.show();
            }
        });
    }
}
