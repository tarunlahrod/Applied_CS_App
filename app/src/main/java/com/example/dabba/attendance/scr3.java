package com.example.dabba.attendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


public class scr3 extends Activity {

    TextView t1;
    Button b1,b2;
    CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scr3);
        b1 = (Button) findViewById(R.id.MM);
        b2 = (Button) findViewById(R.id.save);
        c1 = (CheckBox) findViewById(R.id.checkbox1);
        c2 = (CheckBox) findViewById(R.id.checkbox2);
        c3 = (CheckBox) findViewById(R.id.checkbox3);
        c4 = (CheckBox) findViewById(R.id.checkbox4);
        c5 = (CheckBox) findViewById(R.id.checkbox5);
        c6 = (CheckBox) findViewById(R.id.checkbox6);
        c7 = (CheckBox) findViewById(R.id.checkbox7);
        c8 = (CheckBox) findViewById(R.id.checkbox8);
        c9 = (CheckBox) findViewById(R.id.checkbox9);
        c10 = (CheckBox) findViewById(R.id.checkbox10);
        t1 = (TextView) findViewById(R.id.day);
    }


    public void onClickMM(View view) {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void onClickSave(View view){

        Intent i1 = new Intent(this,MainActivity.class);
        startActivity(i1);
    }

    public void onClickDay(View view){
        Intent i2 = new Intent(this, day.class);
        startActivity(i2);
    }

}

