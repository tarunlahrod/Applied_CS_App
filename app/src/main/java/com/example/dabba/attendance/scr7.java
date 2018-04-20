package com.example.dabba.attendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import java.util.ArrayList;


public class scr7 extends Activity {

    Button b1;
    ImageButton ib1;
    ListView lv;

    ArrayList<String> subList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scr7);
        b1 = (Button) findViewById(R.id.MM);
        ib1 = (ImageButton) findViewById(R.id.addButton);
        lv = (ListView) findViewById(R.id.list);

        Intent startingIntent = getIntent();
        String sub = startingIntent.getStringExtra("1");
        subList.add(sub);


        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this,R.layout.scr7);
        lv.setAdapter(itemsAdapter);
    }

    public void onClickMM(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void onClickAddButton(View view){
        Intent i1 = new Intent(this, scr8.class);
        startActivity(i1);
    }

}
