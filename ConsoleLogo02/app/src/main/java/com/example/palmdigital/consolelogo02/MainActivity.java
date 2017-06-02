package com.example.palmdigital.consolelogo02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity
{
    //fields- class  level variables
    private int myInt;
    private double myDouble;
    private String myString;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myInt= setIntValue();
        Log.i("info", "myInt = " + myInt);
        double myDouble= setDoubleValue();
        Log.i("info", "myDouble = " + myDouble);
        boolean myBoolean = setBooleanValue();
        Log.i("info", "myBoolean = " + myBoolean);
        float myFloat = setfloatValue();
        Log.i("info", "myFloat = " + myFloat);

    }
    
    public float setfloatValue()
    {
        return (4.5f + 2.3f);
    }
 public boolean setBooleanValue()
 {
     return true;
 }
    public double setDoubleValue()
    {
        return 10.987;
    }
    public int setIntValue()
    {
        return 10;
    }
}
