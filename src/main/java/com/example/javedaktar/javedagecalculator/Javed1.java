package com.example.javedaktar.javedagecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static java.lang.Integer.parseInt;

public class Javed1 extends AppCompatActivity {
    public static final String EXTRA_MESSAGEy="com.example.javedaktar.javedagecalculator.keyMessagey";
    public static final String EXTRA_MESSAGEm="com.example.javedaktar.javedagecalculator.keyMessagem";
    public static final String EXTRA_MESSAGEd="com.example.javedaktar.javedagecalculator.keyMessaged";
    EditText editTextbd,editTextbm,editTextby;
    Button bt1;
    int iby,ibm,ibd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javed1);

        editTextbd=(EditText)findViewById(R.id.bd);
        editTextbm=(EditText)findViewById(R.id.bm);
        editTextby=(EditText)findViewById(R.id.by);
    }
    public void nextMethod(View view)
    {
        try{
        iby = parseInt(editTextby.getText().toString());
        ibm =parseInt(editTextbm.getText().toString());
        ibd =parseInt(editTextbd.getText().toString());
        Log.d("javed1","y:" +iby+"m:" +ibm+"d:"+ibd);
        Intent intent=new Intent(this,Javed2.class);
        intent.putExtra(EXTRA_MESSAGEy,iby);
        intent.putExtra(EXTRA_MESSAGEm,ibm);
        intent.putExtra(EXTRA_MESSAGEd,ibd);
        startActivity(intent);}
        catch(Exception e)
        {

        }

    }
}
