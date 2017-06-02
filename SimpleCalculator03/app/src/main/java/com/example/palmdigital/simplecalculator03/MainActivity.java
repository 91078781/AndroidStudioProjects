package com.example.palmdigital.simplecalculator03;

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

    ImageView plus;
    ImageView minus;
    ImageView multiply;
    ImageView divide;
    ImageView equals;

    int num1;
    float num2;
int operator;

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
        imageView_top8= (ImageView) findViewById(R.id.imageView08);
        imageView_top9= (ImageView) findViewById(R.id.imageView09);

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

        minus= (ImageView) findViewById(R.id.imageViewSub);
        plus= (ImageView) findViewById(R.id.imageViewAdd);
        multiply= (ImageView) findViewById(R.id.imageViewMultiplication);
        divide= (ImageView) findViewById(R.id.imageViewDivision);
        equals= (ImageView) findViewById(R.id.imageViewEquals);

        minus.setOnClickListener(this);
        plus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        equals.setOnClickListener(this);

        imageView_bottom0= (ImageView) findViewById(R.id.imageViewBottom0);
        imageView_bottom1= (ImageView) findViewById(R.id.imageViewBottom1);
        imageView_bottom2= (ImageView) findViewById(R.id.imageViewBottom2);
        imageView_bottom3= (ImageView) findViewById(R.id.imageViewBottom3);
        imageView_bottom4= (ImageView) findViewById(R.id.imageViewBottom4);
        imageView_bottom5= (ImageView) findViewById(R.id.imageViewBottom5);
        imageView_bottom6= (ImageView) findViewById(R.id.imageViewBottom6);
        imageView_bottom7= (ImageView) findViewById(R.id.imageViewBottom7);
        imageView_bottom8= (ImageView) findViewById(R.id.imageViewBottom8);
        imageView_bottom9= (ImageView) findViewById(R.id.imageViewBottom9);

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
    }

    public void onClick(View view)
    {
        if (view.getId()== R.id.imageView_zero)
        {
            num1=0;
            textView_top.setText("0");
            imageView_top0.setBackgroundColor(0xff888888);
            imageView_top1.setBackgroundColor(0xffffffff);
            imageView_top2.setBackgroundColor(0xffffffff);
            imageView_top3.setBackgroundColor(0xffffffff);
            imageView_top4.setBackgroundColor(0xffffffff);
            imageView_top5.setBackgroundColor(0xffffffff);
            imageView_top6.setBackgroundColor(0xffffffff);
            imageView_top7.setBackgroundColor(0xffffffff);
            imageView_top8.setBackgroundColor(0xffffffff);
            imageView_top9.setBackgroundColor(0xffffffff);
        }
        else if(view.getId()== R.id.imageView01)
        {
            num1=1;
            textView_top.setText("1");
            imageView_top0.setBackgroundColor(0xffffffff);
            imageView_top1.setBackgroundColor(0xff888888);
            imageView_top2.setBackgroundColor(0xffffffff);
            imageView_top3.setBackgroundColor(0xffffffff);
            imageView_top4.setBackgroundColor(0xffffffff);
            imageView_top5.setBackgroundColor(0xffffffff);
            imageView_top6.setBackgroundColor(0xffffffff);
            imageView_top7.setBackgroundColor(0xffffffff);
            imageView_top8.setBackgroundColor(0xffffffff);
            imageView_top9.setBackgroundColor(0xffffffff);
        }
        else if(view.getId()== R.id.imageView02)
        {
            num1=2;
            textView_top.setText("2");
            imageView_top0.setBackgroundColor(0xffffffff);
            imageView_top1.setBackgroundColor(0xffffffff);
            imageView_top2.setBackgroundColor(0xff888888);
            imageView_top3.setBackgroundColor(0xffffffff);
            imageView_top4.setBackgroundColor(0xffffffff);
            imageView_top5.setBackgroundColor(0xffffffff);
            imageView_top6.setBackgroundColor(0xffffffff);
            imageView_top7.setBackgroundColor(0xffffffff);
            imageView_top8.setBackgroundColor(0xffffffff);
            imageView_top9.setBackgroundColor(0xffffffff);
        }
        else if(view.getId()== R.id.imageView03)
        {
            num1=3;
            textView_top.setText("3");
            imageView_top0.setBackgroundColor(0xffffffff);
            imageView_top1.setBackgroundColor(0xffffffff);
            imageView_top2.setBackgroundColor(0xffffffff);
            imageView_top3.setBackgroundColor(0xff888888);
            imageView_top4.setBackgroundColor(0xffffffff);
            imageView_top5.setBackgroundColor(0xffffffff);
            imageView_top6.setBackgroundColor(0xffffffff);
            imageView_top7.setBackgroundColor(0xffffffff);
            imageView_top8.setBackgroundColor(0xffffffff);
            imageView_top9.setBackgroundColor(0xffffffff);
        }
        else if(view.getId()== R.id.imageView04)
        {
            num1=4;
            textView_top.setText("4");
            imageView_top0.setBackgroundColor(0xffffffff);
            imageView_top1.setBackgroundColor(0xffffffff);
            imageView_top2.setBackgroundColor(0xffffffff);
            imageView_top3.setBackgroundColor(0xffffffff);
            imageView_top4.setBackgroundColor(0xff888888);
            imageView_top5.setBackgroundColor(0xffffffff);
            imageView_top6.setBackgroundColor(0xffffffff);
            imageView_top7.setBackgroundColor(0xffffffff);
            imageView_top8.setBackgroundColor(0xffffffff);
            imageView_top9.setBackgroundColor(0xffffffff);
        }
        else if(view.getId()== R.id.imageView05)
        {
            num1=5;
            textView_top.setText("5");
            imageView_top0.setBackgroundColor(0xffffffff);
            imageView_top1.setBackgroundColor(0xffffffff);
            imageView_top2.setBackgroundColor(0xffffffff);
            imageView_top4.setBackgroundColor(0xffffffff);
            imageView_top5.setBackgroundColor(0xff888888);
            imageView_top6.setBackgroundColor(0xffffffff);
            imageView_top6.setBackgroundColor(0xffffffff);
            imageView_top7.setBackgroundColor(0xffffffff);
            imageView_top8.setBackgroundColor(0xffffffff);
            imageView_top9.setBackgroundColor(0xffffffff);
        }
        else if(view.getId()==R.id.imageView06)
        {
            num1=6;
            textView_top.setText("6");
            imageView_top0.setBackgroundColor(0xffffffff);
            imageView_top1.setBackgroundColor(0xffffffff);
            imageView_top2.setBackgroundColor(0xffffffff);
            imageView_top3.setBackgroundColor(0xffffffff);
            imageView_top4.setBackgroundColor(0xffffffff);
            imageView_top5.setBackgroundColor(0xffffffff);
            imageView_top6.setBackgroundColor(0xff888888);
            imageView_top7.setBackgroundColor(0xffffffff);
            imageView_top8.setBackgroundColor(0xffffffff);
            imageView_top9.setBackgroundColor(0xffffffff);
        }
        else if(view.getId()==R.id.imageView07)
        {
            num1=7;
            textView_top.setText("7");
            imageView_top0.setBackgroundColor(0xffffffff);
            imageView_top1.setBackgroundColor(0xffffffff);
            imageView_top2.setBackgroundColor(0xffffffff);
            imageView_top3.setBackgroundColor(0xffffffff);
            imageView_top4.setBackgroundColor(0xffffffff);
            imageView_top5.setBackgroundColor(0xffffffff);
            imageView_top6.setBackgroundColor(0xffffffff);
            imageView_top7.setBackgroundColor(0xff888888);
            imageView_top8.setBackgroundColor(0xffffffff);
            imageView_top9.setBackgroundColor(0xffffffff);
        }
        else if(view.getId()==R.id.imageView08)
        {
            num1=8;
            textView_top.setText("8");
            imageView_top0.setBackgroundColor(0xffffffff);
            imageView_top1.setBackgroundColor(0xffffffff);
            imageView_top2.setBackgroundColor(0xffffffff);
            imageView_top3.setBackgroundColor(0xffffffff);
            imageView_top4.setBackgroundColor(0xffffffff);
            imageView_top5.setBackgroundColor(0xffffffff);
            imageView_top6.setBackgroundColor(0xffffffff);
            imageView_top7.setBackgroundColor(0xffffffff);
            imageView_top8.setBackgroundColor(0xff888888);
            imageView_top9.setBackgroundColor(0xffffffff);
        }
        else if(view.getId()==R.id.imageView09)
        {
            num1=9;
            textView_top.setText("9");
            imageView_top0.setBackgroundColor(0xffffffff);
            imageView_top1.setBackgroundColor(0xffffffff);
            imageView_top2.setBackgroundColor(0xffffffff);
            imageView_top3.setBackgroundColor(0xffffffff);
            imageView_top4.setBackgroundColor(0xffffffff);
            imageView_top5.setBackgroundColor(0xffffffff);
            imageView_top6.setBackgroundColor(0xffffffff);
            imageView_top7.setBackgroundColor(0xffffffff);
            imageView_top8.setBackgroundColor(0xffffffff);
            imageView_top9.setBackgroundColor(0xff888888);
        }
        if (view.getId()==R.id.imageViewBottom0)
        {
            num2= 0;
            textView_middle.setText("0");
            imageView_bottom0.setBackgroundColor(0xff888888);
            imageView_bottom1.setBackgroundColor(0xffffffff);
            imageView_bottom2.setBackgroundColor(0xffffffff);
            imageView_bottom3.setBackgroundColor(0xffffffff);
            imageView_bottom4.setBackgroundColor(0xffffffff);
            imageView_bottom5.setBackgroundColor(0xffffffff);
            imageView_bottom6.setBackgroundColor(0xffffffff);
            imageView_bottom7.setBackgroundColor(0xffffffff);
            imageView_bottom8.setBackgroundColor(0xffffffff);
            imageView_bottom9.setBackgroundColor(0xffffffff);
        }
        else if (view.getId()==R.id.imageViewBottom1)
        {
            num2=1;
            textView_middle.setText("1");
            imageView_bottom0.setBackgroundColor(0xffffffff);
            imageView_bottom1.setBackgroundColor(0xff888888);
            imageView_bottom2.setBackgroundColor(0xffffffff);
            imageView_bottom3.setBackgroundColor(0xffffffff);
            imageView_bottom4.setBackgroundColor(0xffffffff);
            imageView_bottom5.setBackgroundColor(0xffffffff);
            imageView_bottom6.setBackgroundColor(0xffffffff);
            imageView_bottom7.setBackgroundColor(0xffffffff);
            imageView_bottom8.setBackgroundColor(0xffffffff);
            imageView_bottom9.setBackgroundColor(0xffffffff);
        }
        else if (view.getId()==R.id.imageViewBottom2)
        {
            num2=2;
            textView_middle.setText("2");
            imageView_bottom0.setBackgroundColor(0xffffffff);
            imageView_bottom1.setBackgroundColor(0xffffffff);
            imageView_bottom2.setBackgroundColor(0xff888888);
            imageView_bottom3.setBackgroundColor(0xffffffff);
            imageView_bottom4.setBackgroundColor(0xffffffff);
            imageView_bottom5.setBackgroundColor(0xffffffff);
            imageView_bottom6.setBackgroundColor(0xffffffff);
            imageView_bottom7.setBackgroundColor(0xffffffff);
            imageView_bottom8.setBackgroundColor(0xffffffff);
            imageView_bottom9.setBackgroundColor(0xffffffff);
        }
        else if(view.getId()==R.id.imageViewBottom3)
        {
            num2=3;
            textView_middle.setText("3");
            imageView_bottom0.setBackgroundColor(0xffffffff);
            imageView_bottom1.setBackgroundColor(0xffffffff);
            imageView_bottom2.setBackgroundColor(0xffffffff);
            imageView_bottom3.setBackgroundColor(0xff888888);
            imageView_bottom4.setBackgroundColor(0xffffffff);
            imageView_bottom5.setBackgroundColor(0xffffffff);
            imageView_bottom6.setBackgroundColor(0xffffffff);
            imageView_bottom7.setBackgroundColor(0xffffffff);
            imageView_bottom8.setBackgroundColor(0xffffffff);
            imageView_bottom9.setBackgroundColor(0xffffffff);
        }
        else if(view.getId()==R.id.imageViewBottom4)
        {
            num2=4;
            textView_middle.setText("4");
            imageView_bottom0.setBackgroundColor(0xffffffff);
            imageView_bottom1.setBackgroundColor(0xffffffff);
            imageView_bottom2.setBackgroundColor(0xffffffff);
            imageView_bottom3.setBackgroundColor(0xffffffff);
            imageView_bottom4.setBackgroundColor(0xff888888);
            imageView_bottom5.setBackgroundColor(0xffffffff);
            imageView_bottom6.setBackgroundColor(0xffffffff);
            imageView_bottom7.setBackgroundColor(0xffffffff);
            imageView_bottom8.setBackgroundColor(0xffffffff);
            imageView_bottom9.setBackgroundColor(0xffffffff);
        }
        else if (view.getId()==R.id.imageViewBottom5)
        {
            num2=5;
            textView_middle.setText("5");
            imageView_bottom0.setBackgroundColor(0xffffffff);
            imageView_bottom1.setBackgroundColor(0xffffffff);
            imageView_bottom2.setBackgroundColor(0xffffffff);
            imageView_bottom3.setBackgroundColor(0xffffffff);
            imageView_bottom4.setBackgroundColor(0xffffffff);
            imageView_bottom5.setBackgroundColor(0xff888888);
            imageView_bottom6.setBackgroundColor(0xffffffff);
            imageView_bottom7.setBackgroundColor(0xffffffff);
            imageView_bottom8.setBackgroundColor(0xffffffff);
            imageView_bottom9.setBackgroundColor(0xffffffff);
        }
        else if(view.getId()==R.id.imageViewBottom6)
        {
            num2=6;
            textView_middle.setText("6");
            imageView_bottom0.setBackgroundColor(0xffffffff);
            imageView_bottom1.setBackgroundColor(0xffffffff);
            imageView_bottom2.setBackgroundColor(0xffffffff);
            imageView_bottom3.setBackgroundColor(0xffffffff);
            imageView_bottom4.setBackgroundColor(0xffffffff);
            imageView_bottom5.setBackgroundColor(0xffffffff);
            imageView_bottom6.setBackgroundColor(0xff888888);
            imageView_bottom7.setBackgroundColor(0xffffffff);
            imageView_bottom8.setBackgroundColor(0xffffffff);
            imageView_bottom9.setBackgroundColor(0xffffffff);
        }
        else if(view.getId()==R.id.imageViewBottom7)
        {
            num2=7;
            textView_middle.setText("7");
            imageView_bottom0.setBackgroundColor(0xffffffff);
            imageView_bottom1.setBackgroundColor(0xffffffff);
            imageView_bottom2.setBackgroundColor(0xffffffff);
            imageView_bottom3.setBackgroundColor(0xffffffff);
            imageView_bottom4.setBackgroundColor(0xffffffff);
            imageView_bottom5.setBackgroundColor(0xffffffff);
            imageView_bottom6.setBackgroundColor(0xffffffff);
            imageView_bottom7.setBackgroundColor(0xff888888);
            imageView_bottom8.setBackgroundColor(0xffffffff);
            imageView_bottom9.setBackgroundColor(0xffffffff);
        }
        else if(view.getId()==R.id.imageViewBottom8)
        {
            num2=8;
            textView_middle.setText("8");
            imageView_bottom0.setBackgroundColor(0xffffffff);
            imageView_bottom1.setBackgroundColor(0xffffffff);
            imageView_bottom2.setBackgroundColor(0xffffffff);
            imageView_bottom3.setBackgroundColor(0xffffffff);
            imageView_bottom4.setBackgroundColor(0xffffffff);
            imageView_bottom5.setBackgroundColor(0xffffffff);
            imageView_bottom6.setBackgroundColor(0xffffffff);
            imageView_bottom7.setBackgroundColor(0xffffffff);
            imageView_bottom8.setBackgroundColor(0xff888888);
            imageView_bottom9.setBackgroundColor(0xffffffff);
        }
        else if(view.getId()==R.id.imageViewBottom9)
        {
            num2=9;
            textView_middle.setText("9");
            imageView_bottom0.setBackgroundColor(0xffffffff);
            imageView_bottom1.setBackgroundColor(0xffffffff);
            imageView_bottom2.setBackgroundColor(0xffffffff);
            imageView_bottom3.setBackgroundColor(0xffffffff);
            imageView_bottom4.setBackgroundColor(0xffffffff);
            imageView_bottom5.setBackgroundColor(0xffffffff);
            imageView_bottom6.setBackgroundColor(0xffffffff);
            imageView_bottom7.setBackgroundColor(0xffffffff);
            imageView_bottom8.setBackgroundColor(0xffffffff);
            imageView_bottom9.setBackgroundColor(0xff888888);
        }
        if (view.getId()==R.id.imageViewSub)
        {
            minus.setBackgroundColor(0xff888888);
            plus.setBackgroundColor(0xffffffff);
            multiply.setBackgroundColor(0xffffffff);
            divide.setBackgroundColor(0xffffffff);
            operator= 0;
        }
        else if (view.getId()==R.id.imageViewAdd)
        {
            plus.setBackgroundColor(0xff888888);
            minus.setBackgroundColor(0xffffffff);
            multiply.setBackgroundColor(0xffffffff);
            divide.setBackgroundColor(0xffffffff);
            operator= 1;
        }
        else if (view.getId()==R.id.imageViewMultiplication)
        {
            minus.setBackgroundColor(0xffffffff);
            plus.setBackgroundColor(0xffffffff);
            multiply.setBackgroundColor(0xff888888);
            divide.setBackgroundColor(0xffffffff);
            operator= 2;
        }
        else if (view.getId()==R.id.imageViewDivision)
        {
            minus.setBackgroundColor(0xffffffff);
            multiply.setBackgroundColor(0xffffffff);
            plus.setBackgroundColor(0xffffffff);
            divide.setBackgroundColor(0xff888888);
            operator= 3;
        }
        if (view.getId()==R.id.imageViewEquals)
        {

            if (operator==0)
            {
                textView_bottom.setText(""+ (num1-num2));
            }
            else if(operator==1)
            {
                textView_bottom.setText(""+ (num1+num2));
            }
            else if(operator==2)
            {
                textView_bottom.setText(""+ (num1*num2));
            }
           else if(operator==3)
            {
                textView_bottom.setText(""+ (num1/num2));
                zero();
            }
        }
    }
    public void zero()
    {
        if (num1==0)
        {
            textView_bottom.setText("Error");

        }
        else if (num2==0)
        {
            textView_bottom.setText("Error");
        }
    }
}
