package com.example.javedaktar.javedagecalculator;

import android.util.Log;
import android.widget.EditText;

/**
 * Created by JAVED AKTAR on 12-12-2016.
 */

public class Age {
    int by,bm,bd,py,pm,pd,y,m,d,tempm,tempd;

    public void set(int ay,int am,int ad,int by,int bm,int bd)
    {
        this.by=ay;
        this.bm=am;
        this.bd=ad;
        this.py=by;
        this.pm=bm;//call kr wait man bhai rukja calling
        this.pd=bd;
    }
    public void math( )
    {
        y=(py-1)-by;/*excluding present year and birth year for month*/
        m=12-bm+(pm-1);/*excluding present month and birth month for days*/
        if(m==4||m==6||m==9||m==11)
        {
            d=(30-bd)+(pd-1);/*excluding present day and birth day*/
        }
        else if(m==2)
        {
            if((by%4==0 && by%100!=0)||(by%400==0))
            {
                d=(29-bd)+(pd-1);
            }
            else
            {
                d=(28-bd)+(pd-1);
            }
        }
        else
            d=(31-bd)+(pd-1);
        tempm=m/12;
        y=y+tempm;
        m=m-(12*tempm);
        tempd=d/30;/*assuming each month of 30 days*/
        m=m+tempd;
        if(m==12)
        {
            y=y+1;
            m=0;
        }
        d=d-(30*tempd);
        Log.d("Age in Math ----->",(String)" "+y+" :"+m+" :"+d+" ");

    }
    public int getYear()
    {
        Log.d("year:",String.valueOf(y));
        return(y);
    }
    public int getMonth()
    {
        Log.d("month:",String.valueOf(m));
        return(m);
    }
    public int getDay()
    {
        Log.d("date:",String.valueOf(d));
        return(d);
    }
}
