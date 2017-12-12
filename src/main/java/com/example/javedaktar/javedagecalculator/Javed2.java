package com.example.javedaktar.javedagecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import static java.lang.Integer.parseInt;

public class Javed2 extends AppCompatActivity{
    public static final String EXTRA_MESSAGEcy="com.example.javedaktar.javedagecalculator.keyMessagecy";
    public static final String EXTRA_MESSAGEcm="com.example.javedaktar.javedagecalculator.keyMessagecm";
    public static final String EXTRA_MESSAGEcd="com.example.javedaktar.javedagecalculator.keyMessagecd";
    EditText editTextpd,editTextpm,editTextpy;
    int ipy,ipm,ipd;
    Age age=new Age();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javed2);



        editTextpd=(EditText)findViewById(R.id.pd);
        editTextpm=(EditText)findViewById(R.id.pm);
        editTextpy=(EditText)findViewById(R.id.py);
    }
    public void calculateMethod(View view)
    {
        try{
        ipy = parseInt(editTextpy.getText().toString());
        ipm =parseInt(editTextpm.getText().toString());
        ipd =parseInt(editTextpd.getText().toString());

        Bundle extras = getIntent().getExtras();
        int by = extras.getInt("com.example.javedaktar.javedagecalculator.keyMessagey");
        int bm = extras.getInt("com.example.javedaktar.javedagecalculator.keyMessagem");
        int bd = extras.getInt("com.example.javedaktar.javedagecalculator.keyMessaged");
        Log.d("javed2 bday ","y:" +by+"m:" +bm+"d:"+bd);
        Log.d("javed2 present day ","y:" +ipy+"m:" +ipm+"d:"+ipd);
        age.set(by,bm,bd,ipy,ipm,ipd);
        age.math();

       /* editTextpy.setText(String.valueOf(age.getYear()));//
        editTextpm.setText(String.valueOf(age.getMonth()));//
        editTextpd.setText(String.valueOf(age.getDay()));//*/


        Intent intent2=new Intent(this,Javed3.class);
        intent2.putExtra(EXTRA_MESSAGEcy,age.getYear());
        intent2.putExtra(EXTRA_MESSAGEcm,age.getMonth());
        intent2.putExtra(EXTRA_MESSAGEcd,age.getDay());

        startActivity(intent2);}
        catch(Exception e)
        {

        }
    }

}
