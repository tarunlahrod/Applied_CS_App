package com.example.dabba.attendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class scr6 extends Activity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scr6);
        b1 = (Button) findViewById(R.id.MM);
    }

    public void onClickMM(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
