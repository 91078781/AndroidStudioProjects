package com.example.palmdigital.simplecalculator02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.palmdigital.simplecalculator02.R.id.imageView1;
import static com.example.palmdigital.simplecalculator02.R.id.imageView2;
import static com.example.palmdigital.simplecalculator02.R.id.imageView3;
import static com.example.palmdigital.simplecalculator02.R.id.imageViewBottomZero;
import static com.example.palmdigital.simplecalculator02.R.id.imageViewSubSign;
import static com.example.palmdigital.simplecalculator02.R.id.imageView_add;
import static com.example.palmdigital.simplecalculator02.R.id.imageView_zero;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView_top;
    TextView textView_middle;
    TextView textView_bottom;
    ImageView imageView0;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;

    ImageView imageViewBottom0;
    ImageView imageViewBottom1;
    ImageView imageViewBottom2;
    ImageView imageViewBottom3;
    ImageView imageViewBottom4;
    ImageView imageViewBottom5;
    ImageView imageViewBottom6 ;
    ImageView imageViewBottom7 ;
    ImageView imageViewBottom8 ;
    ImageView imageViewBottom9;

    ImageView imageViewSub;
    ImageView imageViewAdd;
    ImageView imageViewEqualSign;
    int num1, num2;
    int operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView0= (ImageView) findViewById(R.id.imageView_zero);
        imageView1= (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3= (ImageView) findViewById(R.id.imageView3);
        imageView4= (ImageView) findViewById(R.id.imageView4);
        imageView5= (ImageView) findViewById(R.id.imageView5);
        imageView6= (ImageView) findViewById(R.id.imageView6);
        imageView7= (ImageView) findViewById(R.id.imageView7);
        imageView8 = (ImageView) findViewById(R.id.imageView8);
        imageView9 = (ImageView) findViewById(R.id.imageView9);

        imageViewSub = (ImageView) findViewById(imageViewSubSign);
        imageViewAdd = (ImageView) findViewById(R.id.imageView_add);

        imageViewBottom0 = (ImageView) findViewById(R.id.imageViewBottomZero);
        imageViewBottom1 = (ImageView) findViewById(R.id.imageViewBottomOne);
        imageViewBottom2 = (ImageView) findViewById(R.id.imageViewBottomTwo);
        imageViewBottom3 = (ImageView) findViewById(R.id.imageViewBottomThree);
        imageViewBottom4 = (ImageView) findViewById(R.id.imageViewBottomFour);
        imageViewBottom5 = (ImageView) findViewById(R.id.imageViewBottomFive);
        imageViewBottom6 = (ImageView) findViewById(R.id.imageViewBottomSix);
        imageViewBottom7 = (ImageView) findViewById(R.id.imageViewBottomSeven);
        imageViewBottom8 = (ImageView) findViewById(R.id.imageViewBottomEight);
        imageViewBottom9 = (ImageView) findViewById(R.id.imageViewBottomNine);
        imageViewEqualSign = (ImageView) findViewById(R.id.imageViewEquals);

        textView_top=(TextView)findViewById(R.id.textView_top);
        textView_middle=(TextView)findViewById(R.id.textView_middle);
        textView_bottom=(TextView)findViewById(R.id.textViewAnswer);

        imageView0.setOnClickListener(this);
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageView7.setOnClickListener(this);
        imageView8.setOnClickListener(this);
        imageView9.setOnClickListener(this);

        imageViewSub.setOnClickListener(this);
        imageViewAdd.setOnClickListener(this);

        imageViewBottom0.setOnClickListener(this);
        imageViewBottom1.setOnClickListener(this);
        imageViewBottom2.setOnClickListener(this);
        imageViewBottom3.setOnClickListener(this);
        imageViewBottom4.setOnClickListener(this);
        imageViewBottom5.setOnClickListener(this);
        imageViewBottom6.setOnClickListener(this);
        imageViewBottom7.setOnClickListener(this);
        imageViewBottom8.setOnClickListener(this);
        imageViewBottom9.setOnClickListener(this);

        imageViewEqualSign.setOnClickListener(this);


    }

    public void onClick(View view)
    {
        if (view.getId()==R.id.imageView_zero)
        {
            textView_top.setText("0");
            num1=0;
            imageView0.setBackgroundColor(0xff888888);
            imageView1.setBackgroundColor(0xffffffff);
            imageView2.setBackgroundColor(0xffffffff);
            imageView3.setBackgroundColor(0xffffffff);
            imageView4.setBackgroundColor(0xffffffff);
            imageView5.setBackgroundColor(0xffffffff);
            imageView6.setBackgroundColor(0xffffffff);
            imageView7.setBackgroundColor(0xffffffff);
            imageView8.setBackgroundColor(0xffffffff);
            imageView9.setBackgroundColor(0xffffffff);
        }
       else if(view.getId()==R.id.imageView1)
       {
           textView_top.setText("1");
           num1=1;
           imageView0.setBackgroundColor(0xffffffff);
           imageView1.setBackgroundColor(0xff888888);
           imageView2.setBackgroundColor(0xffffffff);
           imageView3.setBackgroundColor(0xffffffff);
           imageView4.setBackgroundColor(0xffffffff);
           imageView5.setBackgroundColor(0xffffffff);
           imageView6.setBackgroundColor(0xffffffff);
           imageView7.setBackgroundColor(0xffffffff);
           imageView8.setBackgroundColor(0xffffffff);
           imageView9.setBackgroundColor(0xffffffff);
       }
        else if (view.getId()==R.id.imageView2)
        {
            textView_top.setText("2");
            num1=2;
            imageView0.setBackgroundColor(0xffffffff);
            imageView1.setBackgroundColor(0xffffffff);
            imageView2.setBackgroundColor(0xff888888);
            imageView3.setBackgroundColor(0xffffffff);
            imageView4.setBackgroundColor(0xffffffff);
            imageView5.setBackgroundColor(0xffffffff);
            imageView6.setBackgroundColor(0xffffffff);
            imageView7.setBackgroundColor(0xffffffff);
            imageView8.setBackgroundColor(0xffffffff);
            imageView9.setBackgroundColor(0xffffffff);
        }
        else if (view.getId()==R.id.imageView3)
        {
            textView_top.setText("3");
            num1=3;
            imageView0.setBackgroundColor(0xffffffff);
            imageView1.setBackgroundColor(0xffffffff);
            imageView2.setBackgroundColor(0xffffffff);
            imageView3.setBackgroundColor(0xff888888);
            imageView4.setBackgroundColor(0xffffffff);
            imageView5.setBackgroundColor(0xffffffff);
            imageView6.setBackgroundColor(0xffffffff);
            imageView7.setBackgroundColor(0xffffffff);
            imageView8.setBackgroundColor(0xffffffff);
            imageView9.setBackgroundColor(0xffffffff);
        }
        else if (view.getId()==R.id.imageView4)
        {
            textView_top.setText("4");
            num1=4;
            imageView0.setBackgroundColor(0xffffffff);
            imageView1.setBackgroundColor(0xffffffff);
            imageView2.setBackgroundColor(0xffffffff);
            imageView3.setBackgroundColor(0xffffffff);
            imageView4.setBackgroundColor(0xff888888);
            imageView5.setBackgroundColor(0xffffffff);
            imageView6.setBackgroundColor(0xffffffff);
            imageView7.setBackgroundColor(0xffffffff);
            imageView8.setBackgroundColor(0xffffffff);
            imageView9.setBackgroundColor(0xffffffff);    }
        else if (view.getId()==R.id.imageView5)
        {
            textView_top.setText("5");
            num1=5;
            imageView0.setBackgroundColor(0xffffffff);
            imageView1.setBackgroundColor(0xffffffff);
            imageView2.setBackgroundColor(0xffffffff);
            imageView3.setBackgroundColor(0xffffffff);
            imageView4.setBackgroundColor(0xffffffff);
            imageView5.setBackgroundColor(0xff888888);
            imageView6.setBackgroundColor(0xffffffff);
            imageView7.setBackgroundColor(0xffffffff);
            imageView8.setBackgroundColor(0xffffffff);
            imageView9.setBackgroundColor(0xffffffff);
        }
       else if (view.getId()==R.id.imageView6)
        {
            textView_top.setText("6");
            num1=6;
            imageView0.setBackgroundColor(0xffffffff);
            imageView1.setBackgroundColor(0xffffffff);
            imageView2.setBackgroundColor(0xffffffff);
            imageView3.setBackgroundColor(0xffffffff);
            imageView4.setBackgroundColor(0xffffffff);
            imageView5.setBackgroundColor(0xffffffff);
            imageView6.setBackgroundColor(0xff888888);
            imageView7.setBackgroundColor(0xffffffff);
            imageView8.setBackgroundColor(0xffffffff);
            imageView9.setBackgroundColor(0xffffffff);
        }
       else if (view.getId()==R.id.imageView7)
        {
            textView_top.setText("7");
            num1=7;
            imageView0.setBackgroundColor(0xffffffff);
            imageView1.setBackgroundColor(0xffffffff);
            imageView2.setBackgroundColor(0xffffffff);
            imageView3.setBackgroundColor(0xffffffff);
            imageView4.setBackgroundColor(0xffffffff);
            imageView5.setBackgroundColor(0xffffffff);
            imageView6.setBackgroundColor(0xffffffff);
            imageView7.setBackgroundColor(0xff888888);
            imageView8.setBackgroundColor(0xffffffff);
            imageView9.setBackgroundColor(0xffffffff);
        }
        else if (view.getId()==R.id.imageView8)
        {
            textView_top.setText("8");
            num1=8;
            imageView0.setBackgroundColor(0xffffffff);
            imageView1.setBackgroundColor(0xffffffff);
            imageView2.setBackgroundColor(0xffffffff);
            imageView3.setBackgroundColor(0xffffffff);
            imageView4.setBackgroundColor(0xffffffff);
            imageView5.setBackgroundColor(0xffffffff);
            imageView6.setBackgroundColor(0xffffffff);
            imageView7.setBackgroundColor(0xffffffff);
            imageView8.setBackgroundColor(0xff888888);
            imageView9.setBackgroundColor(0xffffffff);
        }
       else if (view.getId()==R.id.imageView9)
        {
            textView_top.setText("9");
            num1=9;
            imageView0.setBackgroundColor(0xffffffff);
            imageView1.setBackgroundColor(0xffffffff);
            imageView2.setBackgroundColor(0xffffffff);
            imageView3.setBackgroundColor(0xffffffff);
            imageView4.setBackgroundColor(0xffffffff);
            imageView5.setBackgroundColor(0xffffffff);
            imageView6.setBackgroundColor(0xffffffff);
            imageView7.setBackgroundColor(0xffffffff);
            imageView8.setBackgroundColor(0xffffffff);
            imageView9.setBackgroundColor(0xff888888);
        }


        if (view.getId()==R.id.imageViewBottomZero)
        {
            textView_middle.setText("0");
            num2=0;
            imageViewBottom0.setBackgroundColor(0xff888888);
            imageViewBottom1.setBackgroundColor(0xffffffff);
            imageViewBottom2.setBackgroundColor(0xffffffff);
            imageViewBottom3.setBackgroundColor(0xffffffff);
            imageViewBottom4.setBackgroundColor(0xffffffff);
            imageViewBottom5.setBackgroundColor(0xffffffff);
            imageViewBottom6.setBackgroundColor(0xffffffff);
            imageViewBottom7.setBackgroundColor(0xffffffff);
            imageViewBottom8.setBackgroundColor(0xffffffff);
            imageViewBottom9.setBackgroundColor(0xffffffff);
        }
        else if (view.getId()==R.id.imageViewBottomOne)
        {
            textView_middle.setText("1");
            num2=1;
            imageViewBottom0.setBackgroundColor(0xffffffff);
            imageViewBottom1.setBackgroundColor(0xff888888);
            imageViewBottom2.setBackgroundColor(0xffffffff);
            imageViewBottom3.setBackgroundColor(0xffffffff);
            imageViewBottom4.setBackgroundColor(0xffffffff);
            imageViewBottom5.setBackgroundColor(0xffffffff);
            imageViewBottom6.setBackgroundColor(0xffffffff);
            imageViewBottom7.setBackgroundColor(0xffffffff);
            imageViewBottom8.setBackgroundColor(0xffffffff);
            imageViewBottom9.setBackgroundColor(0xffffffff);
        }
       else if (view.getId()==R.id.imageViewBottomTwo)
        {
            textView_middle.setText("2");
            num2=2;
            imageViewBottom0.setBackgroundColor(0xffffffff);
            imageViewBottom1.setBackgroundColor(0xffffffff);
            imageViewBottom2.setBackgroundColor(0xff888888);
            imageViewBottom3.setBackgroundColor(0xffffffff);
            imageViewBottom4.setBackgroundColor(0xffffffff);
            imageViewBottom5.setBackgroundColor(0xffffffff);
            imageViewBottom6.setBackgroundColor(0xffffffff);
            imageViewBottom7.setBackgroundColor(0xffffffff);
            imageViewBottom8.setBackgroundColor(0xffffffff);
            imageViewBottom9.setBackgroundColor(0xffffffff);
        }
        else if (view.getId()==R.id.imageViewBottomThree)
        {
            textView_middle.setText("3");
            num2=3;
            imageViewBottom0.setBackgroundColor(0xffffffff);
            imageViewBottom1.setBackgroundColor(0xffffffff);
            imageViewBottom2.setBackgroundColor(0xffffffff);
            imageViewBottom3.setBackgroundColor(0xff888888);
            imageViewBottom4.setBackgroundColor(0xffffffff);
            imageViewBottom5.setBackgroundColor(0xffffffff);
            imageViewBottom6.setBackgroundColor(0xffffffff);
            imageViewBottom7.setBackgroundColor(0xffffffff);
            imageViewBottom8.setBackgroundColor(0xffffffff);
            imageViewBottom9.setBackgroundColor(0xffffffff);
        }
       else if (view.getId()==R.id.imageViewBottomFour)
        {
            textView_middle.setText("4");
            num2=4;
            imageViewBottom0.setBackgroundColor(0xffffffff);
            imageViewBottom1.setBackgroundColor(0xffffffff);
            imageViewBottom2.setBackgroundColor(0xffffffff);
            imageViewBottom3.setBackgroundColor(0xffffffff);
            imageViewBottom4.setBackgroundColor(0xff888888);
            imageViewBottom5.setBackgroundColor(0xffffffff);
            imageViewBottom6.setBackgroundColor(0xffffffff);
            imageViewBottom7.setBackgroundColor(0xffffffff);
            imageViewBottom8.setBackgroundColor(0xffffffff);
            imageViewBottom9.setBackgroundColor(0xffffffff);
        }
        else if (view.getId()==R.id.imageViewBottomFive)
        {
            textView_middle.setText("5");
            num2=5;
            imageViewBottom0.setBackgroundColor(0xffffffff);
            imageViewBottom1.setBackgroundColor(0xffffffff);
            imageViewBottom2.setBackgroundColor(0xffffffff);
            imageViewBottom3.setBackgroundColor(0xffffffff);
            imageViewBottom4.setBackgroundColor(0xffffffff);
            imageViewBottom5.setBackgroundColor(0xff888888);
            imageViewBottom6.setBackgroundColor(0xffffffff);
            imageViewBottom7.setBackgroundColor(0xffffffff);
            imageViewBottom8.setBackgroundColor(0xffffffff);
            imageViewBottom9.setBackgroundColor(0xffffffff);
        }
       else if (view.getId()==R.id.imageViewBottomSix)
        {
            textView_middle.setText("6");
            num2=6;
            imageViewBottom0.setBackgroundColor(0xffffffff);
            imageViewBottom1.setBackgroundColor(0xffffffff);
            imageViewBottom2.setBackgroundColor(0xffffffff);
            imageViewBottom3.setBackgroundColor(0xffffffff);
            imageViewBottom4.setBackgroundColor(0xffffffff);
            imageViewBottom5.setBackgroundColor(0xffffffff);
            imageViewBottom6.setBackgroundColor(0xff888888);
            imageViewBottom7.setBackgroundColor(0xffffffff);
            imageViewBottom8.setBackgroundColor(0xffffffff);
            imageViewBottom9.setBackgroundColor(0xffffffff);
        }
        else if (view.getId()==R.id.imageViewBottomSeven)
        {
            textView_middle.setText("7");
            num2=7;
            imageViewBottom0.setBackgroundColor(0xffffffff);
            imageViewBottom1.setBackgroundColor(0xffffffff);
            imageViewBottom2.setBackgroundColor(0xffffffff);
            imageViewBottom3.setBackgroundColor(0xffffffff);
            imageViewBottom4.setBackgroundColor(0xffffffff);
            imageViewBottom5.setBackgroundColor(0xffffffff);
            imageViewBottom6.setBackgroundColor(0xffffffff);
            imageViewBottom7.setBackgroundColor(0xff888888);
            imageViewBottom8.setBackgroundColor(0xffffffff);
            imageViewBottom9.setBackgroundColor(0xffffffff);
        }

        else if (view.getId()==R.id.imageViewBottomEight)
        {
            textView_middle.setText("8");
            num2=8;
            imageViewBottom0.setBackgroundColor(0xffffffff);
            imageViewBottom1.setBackgroundColor(0xffffffff);
            imageViewBottom2.setBackgroundColor(0xffffffff);
            imageViewBottom3.setBackgroundColor(0xffffffff);
            imageViewBottom4.setBackgroundColor(0xffffffff);
            imageViewBottom5.setBackgroundColor(0xffffffff);
            imageViewBottom6.setBackgroundColor(0xffffffff);
            imageViewBottom7.setBackgroundColor(0xffffffff);
            imageViewBottom8.setBackgroundColor(0xff888888);
            imageViewBottom9.setBackgroundColor(0xffffffff);
        }
        else if (view.getId()==R.id.imageViewBottomNine)
        {
            textView_middle.setText("9");
            num2=9;
            imageViewBottom0.setBackgroundColor(0xffffffff);
            imageViewBottom1.setBackgroundColor(0xffffffff);
            imageViewBottom2.setBackgroundColor(0xffffffff);
            imageViewBottom3.setBackgroundColor(0xffffffff);
            imageViewBottom4.setBackgroundColor(0xffffffff);
            imageViewBottom5.setBackgroundColor(0xffffffff);
            imageViewBottom6.setBackgroundColor(0xffffffff);
            imageViewBottom7.setBackgroundColor(0xffffffff);
            imageViewBottom8.setBackgroundColor(0xffffffff);
            imageViewBottom9.setBackgroundColor(0xff888888);
        }

        if (view.getId() == R.id.imageViewSubSign)
        {
            colorSub();
        }

        else if (view.getId() == R.id.imageView_add)
        {
            colorAdd();
        }
        if (view.getId()== R.id.imageViewEquals)
        {
           if(operator==1)
           {
               imageViewEqualSign.setBackgroundColor(0xff888888);
               textView_bottom.setText("" + (num1+num2));
           }
            else if (operator==0)
           {
               imageViewEqualSign.setBackgroundColor(0xff888888);
               textView_bottom.setText("" + (num1-num2));
           }
        }

    }
    public void colorAdd()
    {
        operator=1;
        imageViewAdd.setBackgroundColor(0xff888888);
        imageViewSub.setBackgroundColor(0xffffffff);
    }
    public void colorSub()
    {
        operator=0;
        imageViewSub.setBackgroundColor(0xff888888);
        imageViewAdd.setBackgroundColor(0xffffffff);
    }
}
