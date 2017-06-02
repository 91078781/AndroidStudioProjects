package com.example.palmdigital.scope02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int myInt;
    double myDouble1;
    String myString1;
    TextView textView_1;
    ImageView imageView_1;
    Button _myButton;

    int myInt2;
    double myDouble2;
    String myString2;
    TextView textView_2;
    ImageView imageView_2;
    Button myButton2;

    int myInt3;
    double myDouble3;
    String myString3;
    TextView textView_3;
    ImageView imageView_3;
    Button myButton3;

    int myInt4;
    double myDouble4;
    String myString4;
    TextView textView_4;
    ImageView imageView_4;
    Button myButton4;

    int myInt5;
    double myDouble5;
    String myString5;
    TextView textView_5;
    ImageView imageView_5;
    Button myButton5;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void myAwesomeMethod01()
    {
        int myInt;
        double myDouble;
        String myString;
        TextView textView_1;
        ImageView imageView_1;
        Button myButton;
         textView_1= (TextView) findViewById(R.id.textView01);
         imageView_1= (ImageView) findViewById(R.id.imageView_android);
        myButton =(Button) findViewById(R.id.mybutton);
        myInt= 1 ;
        myDouble= 1.1;
        myString= "This is a string";

    }
    public void myAwesomeMethod02()
    {
        int myInt2;
        double myDouble2;
        String myString2;
        TextView textView_2;
        ImageView imageView_2;
        Button myButton2;

    }
    public void myAwesomeMethod03()
    {
        int myInt3;
        double myDouble3;
        String myString3;
        TextView textView_3;
        ImageView imageView_3;
        Button myButton3;

    }
    public void myAwesomeMethod04()
    {
        int myInt4;
        double myDouble4;
        String myString4;
        TextView textView_4;
        ImageView imageView_4;
        Button myButton4;
    }
    public void myAwesomeMethod05()
    {
        int myInt5;
        double myDouble5;
        String myString5;
        TextView textView_5;
        ImageView imageView_5;
        Button myButton5;

    }
}
