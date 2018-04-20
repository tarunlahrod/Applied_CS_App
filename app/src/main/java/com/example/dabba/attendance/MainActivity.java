package com.example.dabba.attendance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.pro);
        b2 = (Button)findViewById(R.id.b1);
        b3 = (Button)findViewById(R.id.b2);
        b4 = (Button)findViewById(R.id.b3);
        b5 = (Button)findViewById(R.id.b4);
    }

    public void onClickProfile(View View)
    {
        Intent i = new Intent(this,Profile.class);
        startActivity(i);
    }

    public void onClickShowTimetable(View View)
    {
        Intent i2 = new Intent(this,scr6.class);
        startActivity(i2);
    }


    public void onClickTodaysAttendance(View View)
    {

    }

    public void onClickMark(View View)
    {
        Intent i3 = new Intent(this,scr3.class);
        startActivity(i3);
    }

    public void onClickView(View View)
    {
        Intent i4 = new Intent(this,scr4.class);
        startActivity(i4);
    }


}
