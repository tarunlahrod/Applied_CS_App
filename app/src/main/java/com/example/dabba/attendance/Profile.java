package com.example.dabba.attendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.jar.Attributes;

public class Profile extends Activity {

    Button b1, b2;
    TextView t1, t2, t3, t4;
    String key1="1", key2="2", key3="3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        b1 = (Button) findViewById(R.id.MM);
        b2 = (Button) findViewById(R.id.editDetails);
        t1 = (TextView) findViewById(R.id.userName);
        t2 = (TextView) findViewById(R.id.userBranch);
        t3 = (TextView) findViewById(R.id.userSem);
        t4 = (TextView) findViewById(R.id.entersub);



        Intent startingIntent = getIntent();
        String Name = startingIntent.getStringExtra(key1);
        String Branch = startingIntent.getStringExtra(key2);
        String Sem = startingIntent.getStringExtra(key3);

        t1.setText("" + Name);
        t2.setText("" + Branch);
        t3.setText("" + Sem);
    }

    public void onClickMM(View view) {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void onClickEditDetails(View view) {
        Intent i1 = new Intent(this,editprofile.class);
        startActivity(i1);
    }

    public void onClickEnterSub(View view) {
        Intent i2 = new Intent(this,scr7.class);
        startActivity(i2);
    }
}





