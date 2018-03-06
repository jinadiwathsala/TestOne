package com.example.jinadiwathsala.list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    int pos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        pos=intent.getExtras().getInt("Position");

        final CustomAdapter adpater = new CustomAdapter(this);
        final TextView name = (TextView)findViewById(R.id.txtSecond);

        //set Data
        name.setText(adpater.names[pos]);


    }
}
