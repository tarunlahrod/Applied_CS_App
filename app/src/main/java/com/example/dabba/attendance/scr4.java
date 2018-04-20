package com.example.dabba.attendance;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class scr4 extends Activity {

    Button b1,b2;
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    TextView p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scr4);
        b1 = (Button) findViewById(R.id.MM);
        b2 = (Button) findViewById(R.id.expand);
        t1 = (TextView)findViewById(R.id.subject1);
        t2 = (TextView)findViewById(R.id.subject2);
        t3 = (TextView)findViewById(R.id.subject3);
        t4 = (TextView)findViewById(R.id.subject4);
        t5 = (TextView)findViewById(R.id.subject5);
        t6 = (TextView)findViewById(R.id.subject6);
        t7 = (TextView)findViewById(R.id.subject7);
        t8 = (TextView)findViewById(R.id.subject8);
        t9 = (TextView)findViewById(R.id.subject9);
        t10 = (TextView)findViewById(R.id.subject10);
        p1 = (TextView)findViewById(R.id.sub1Percent);
        p2 = (TextView)findViewById(R.id.sub2Percent);
        p3 = (TextView)findViewById(R.id.sub3Percent);
        p4 = (TextView)findViewById(R.id.sub4Percent);
        p5 = (TextView)findViewById(R.id.sub5Percent);
        p6 = (TextView)findViewById(R.id.sub6Percent);
        p7 = (TextView)findViewById(R.id.sub7Percent);
        p8 = (TextView)findViewById(R.id.sub8Percent);
        p9 = (TextView)findViewById(R.id.sub9Percent);
        p10 = (TextView)findViewById(R.id.sub10Percent);
    }


    public void onClickMM(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void onClickExpand(View view){

       /*
        p1.setTextColor(Color.RED);
        p2.setTextColor(Color.RED);
        */
       Intent i1 = new Intent(this,scr5.class);
       startActivity(i1);
    }

}
