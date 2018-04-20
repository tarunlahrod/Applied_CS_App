package com.example.dabba.attendance;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


public class scr9 extends Activity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scr9);
        lv = (ListView) findViewById(R.id.subList);
    }

}
