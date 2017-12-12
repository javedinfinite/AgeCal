package com.example.javedaktar.javedagecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Javed3 extends AppCompatActivity {
    TextView tv1,tv2,tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javed3);

        Bundle extras = getIntent().getExtras();
        int cy = extras.getInt("com.example.javedaktar.javedagecalculator.keyMessagecy");
        int cm = extras.getInt("com.example.javedaktar.javedagecalculator.keyMessagecm");
        int cd = extras.getInt("com.example.javedaktar.javedagecalculator.keyMessagecd");
        tv1=(TextView) findViewById(R.id.textView7);
        tv1.setText(String.valueOf(cy));
        tv2=(TextView) findViewById(R.id.textView10);
        tv2.setText(String.valueOf(cm));
        tv3=(TextView) findViewById(R.id.textView11);
        tv3.setText(String.valueOf(cd));
    }
}
