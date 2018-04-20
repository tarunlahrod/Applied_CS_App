package com.example.dabba.attendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class scr8 extends Activity {

    Button b1,b2,b3;
    EditText ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scr8);
        b1 = (Button) findViewById(R.id.MM);
        b2 = (Button) findViewById(R.id.cancelButton);
        b3 = (Button) findViewById(R.id.save);
    }

    public void onClickMM(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void onClickCancel(View view)
    {
        Intent i1 = new Intent(this,scr7.class);
        startActivity(i1);
    }

    public void onClicksave(View view){
        String subject = ed1.getText().toString();
        Intent i2 = new Intent(this,scr7.class);
        i2.putExtra("1",subject);
        startActivity(i2);
    }

}
