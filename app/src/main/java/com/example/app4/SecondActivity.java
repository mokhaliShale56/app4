package com.example.app4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView comView=findViewById(R.id.textView);
        String com=getIntent().getExtras().getString("textView");
        comView.setText(com);

        TextView conView=findViewById(R.id.textView1);
        String con=getIntent().getExtras().getString("textView1");
        conView.setText(con);

        TextView con2View=findViewById(R.id.textView2);
        String con2=getIntent().getExtras().getString("textView2");
        con2View.setText(con2);

        TextView con3View=findViewById(R.id.textView3);
        String con3=getIntent().getExtras().getString("textView3");
        con3View.setText(con3);



    }
}