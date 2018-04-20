package com.example.dabba.attendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class day extends Activity {

    TextView t1,t2,t3,t4,t5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day);
        t1 = (TextView) findViewById(R.id.monday);
        t2 = (TextView) findViewById(R.id.tuesday);
        t3 = (TextView) findViewById(R.id.wednesday);
        t4 = (TextView) findViewById(R.id.thursday);
        t5 = (TextView) findViewById(R.id.friday);

    }


    public void onClickMonday(View view){

        Intent i1 = new Intent(this,scr3.class);
        startActivity(i1);
    }

    public void onClickTuesday(View view){

        Intent i2 = new Intent(this,scr3.class);
        startActivity(i2);
    }

    public void onClickWednesday(View view){

        Intent i3 = new Intent(this,scr3.class);
        startActivity(i3);
    }

    public void onClickThursday(View view){

        Intent i4 = new Intent(this,scr3.class);
        startActivity(i4);
    }

    public void onClickFriday(View view){

        Intent i5 = new Intent(this,scr3.class);
        startActivity(i5);
    }

}
