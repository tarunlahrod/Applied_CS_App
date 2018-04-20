package com.example.dabba.attendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class editprofile extends Activity {

    EditText name,branch,sem;
    Button b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editprofile);
        name = (EditText) findViewById(R.id.editName);
        branch = (EditText) findViewById(R.id.editBranch);
        sem = (EditText) findViewById(R.id.editSem);
        b1 = (Button) findViewById(R.id.cancelButton);
        b2 = (Button) findViewById(R.id.save);
    }

    public void onClickCancel(View view){
        Intent i1 = new Intent(this,Profile.class);
        startActivity(i1);
    }

    String key1="1", key2="2", key3="3";


    public void onClickSave(View view){

        String SendName = name.getText().toString();
        String SendBranch = branch.getText().toString();
        String SendSem = sem.getText().toString();

        Intent intent = new Intent(this, Profile.class);
        intent.putExtra(key1,SendName);
        intent.putExtra(key2,SendBranch);
        intent.putExtra(key3,SendSem);
        startActivity(intent);
    }

}
