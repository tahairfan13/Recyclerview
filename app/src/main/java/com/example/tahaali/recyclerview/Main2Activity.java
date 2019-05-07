package com.example.tahaali.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    ImageView imageView;
    TextView Name,Age,Dob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fullscreen_cardview);
        Bundle intent=getIntent().getExtras();
        String name=intent.getString("Name");
        int age=Integer.parseInt(intent.getString("Age"));
        String dob=intent.getString("Dob");
        Name= (TextView) findViewById(R.id.headinTextViewFullScreen);
        Name.setText(name);
        Age= (TextView) findViewById(R.id.paraTextviewFullScreen);
        Age.setText(String.valueOf(age));
        Dob= (TextView) findViewById(R.id.para2TextviewFullScreen);
        Dob.setText(dob);
    }
}
