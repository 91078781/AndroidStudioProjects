package com.example.palmdigital.simplecalculator04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView_top;
    TextView textView_middle;
    TextView textView_bottom;

    ImageView imageView_top0;
    ImageView imageView_top1;
    ImageView imageView_top2;
    ImageView imageView_top3;
    ImageView imageView_top4;
    ImageView imageView_top5;
    ImageView imageView_top6;
    ImageView imageView_top7;
    ImageView imageView_top8;
    ImageView imageView_top9;

    ImageView clear;
    ImageView minus;
    ImageView plus;
    ImageView multiply;
    ImageView division;

    ImageView imageView_bottom0;
    ImageView imageView_bottom1;
    ImageView imageView_bottom2;
    ImageView imageView_bottom3;
    ImageView imageView_bottom4;
    ImageView imageView_bottom5;
    ImageView imageView_bottom6;
    ImageView imageView_bottom7;
    ImageView imageView_bottom8;
    ImageView imageView_bottom9;

    ImageView equal;
    int num1,num2;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView_top= (TextView) findViewById(R.id.textView_top);
        textView_middle= (TextView) findViewById(R.id.textView_middle);
        textView_bottom= (TextView) findViewById(R.id.textView_bottom);

        imageView_top0= (ImageView) findViewById(R.id.imageView_zero);
        imageView_top1= (ImageView) findViewById(R.id.imageView01);
        imageView_top2= (ImageView) findViewById(R.id.imageView02);
        imageView_top3= (ImageView) findViewById(R.id.imageView03);
        imageView_top4= (ImageView) findViewById(R.id.imageView04);
        imageView_top5= (ImageView) findViewById(R.id.imageView05);
        imageView_top6= (ImageView) findViewById(R.id.imageView06);
        imageView_top7= (ImageView) findViewById(R.id.imageView07);
        imageView_top8=  (ImageView) findViewById(R.id.imageView08);
        imageView_top9= (ImageView) findViewById(R.id.imageView09);

        clear= (ImageView) findViewById(R.id.imageViewClear);
        minus= (ImageView) findViewById(R.id.imageViewSub);
        plus= (ImageView) findViewById(R.id.imageViewAdd);
        multiply = (ImageView) findViewById(R.id.imageViewMultiplication);
        division= (ImageView) findViewById(R.id.imageViewDivision);
        equal=(ImageView) findViewById(R.id.imageViewEquals);

        imageView_bottom0=(ImageView) findViewById(R.id.imageViewBottom0);
        imageView_bottom1=(ImageView) findViewById(R.id.imageViewBottom1);
        imageView_bottom2=(ImageView) findViewById(R.id.imageViewBottom2);
        imageView_bottom3=(ImageView) findViewById(R.id.imageViewBottom3);
        imageView_bottom4=(ImageView) findViewById(R.id.imageViewBottom4);
        imageView_bottom5=(ImageView) findViewById(R.id.imageViewBottom5);
        imageView_bottom6=(ImageView) findViewById(R.id.imageViewBottom6);
        imageView_bottom7=(ImageView) findViewById(R.id.imageViewBottom7);
        imageView_bottom8=(ImageView) findViewById(R.id.imageViewBottom8);
        imageView_bottom9=(ImageView) findViewById(R.id.imageViewBottom9);

        imageView_top0.setOnClickListener(this);
        imageView_top1.setOnClickListener(this);
        imageView_top2.setOnClickListener(this);
        imageView_top3.setOnClickListener(this);
        imageView_top4.setOnClickListener(this);
        imageView_top5.setOnClickListener(this);
        imageView_top6.setOnClickListener(this);
        imageView_top7.setOnClickListener(this);
        imageView_top8.setOnClickListener(this);
        imageView_top9.setOnClickListener(this);

        clear.setOnClickListener(this);
        minus.setOnClickListener(this);
        plus.setOnClickListener(this);
        multiply.setOnClickListener(this);

        division.setOnClickListener(this);
        imageView_bottom0.setOnClickListener(this);
        imageView_bottom1.setOnClickListener(this);
        imageView_bottom2.setOnClickListener(this);
        imageView_bottom3.setOnClickListener(this);
        imageView_bottom4.setOnClickListener(this);
        imageView_bottom5.setOnClickListener(this);
        imageView_bottom6.setOnClickListener(this);
        imageView_bottom7.setOnClickListener(this);
        imageView_bottom8.setOnClickListener(this);
        imageView_bottom9.setOnClickListener(this);
        equal.setOnClickListener(this);
    }

    public void onClick(View view)
    {

        if(view.getId()==R.id.imageView_zero)
        {
           str= "0";
            textView_top.setText(str);
            num1=0;
            imageView_top0.setBackgroundColor(0xff888888);
            imageView_top1.setBackgroundColor(0xffffffff);
            imageView_top2.setBackgroundColor(0xffffffff);
            imageView_top3.setBackgroundColor(0xffffffff);
            imageView_top4.setBackgroundColor(0xffffffff);
            imageView_top5.setBackgroundColor(0xffffffff);
            imageView_top6.setBackgroundColor(0xffffffff);
            imageView_top3.setBackgroundColor(0xffffffff);
        }
        else if(view.getId()==R.id.imageView01)
        {
            str= textView_top.getText().toString();
            textView_top.setText(str);
            num1=1;
        }
        else if(view.getId()==R.id.imageView02)
        {
            str= "2";
            textView_top.setText(str);
            num1=2;
        }
    }
}
