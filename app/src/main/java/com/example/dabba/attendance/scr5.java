package com.example.dabba.attendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class scr5 extends Activity {

    Button b1;
    TextView t1,t2,t3,t4,t5,t6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scr5);
        b1 = (Button) findViewById(R.id.MM);
        t1 = (TextView) findViewById(R.id.percentage);
        t2 = (TextView) findViewById(R.id.totalLectures);
        t3 = (TextView) findViewById(R.id.lecturesAttended);
        t4 = (TextView) findViewById(R.id.lecturesMissed);
        t5 = (TextView) findViewById(R.id.subname);
        t6 = (TextView) findViewById(R.id.sub);
    }

    public void onClickMM(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void onClickSubject(View view){
        Intent i1 = new Intent(this,scr9.class);
        startActivity(i1);
    }

}
