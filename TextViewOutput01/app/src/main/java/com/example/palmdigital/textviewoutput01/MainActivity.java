package com.example.palmdigital.textviewoutput01;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView textViewDisplayTop;
    TextView textViewDisplayTop02;
    TextView textViewDisplayTop03;
    int num, num02;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView01= (ImageView) findViewById(R.id.imageView);
        ImageView imageView02= (ImageView) findViewById(R.id.imageView2);
        ImageView imageView03=(ImageView) findViewById(R.id.imageView3);
        ImageView imageView04= (ImageView) findViewById(R.id.imageView4);
        ImageView imageView05= (ImageView) findViewById(R.id.imageView5);
        ImageView imageView06= (ImageView) findViewById(R.id.imageView6);
        ImageView imageView07= (ImageView) findViewById(R.id.imageView7);
        ImageView imageView08= (ImageView) findViewById(R.id.imageView8);

        textViewDisplayTop= (TextView) findViewById(R.id.textView);
        textViewDisplayTop02= (TextView) findViewById(R.id.textView3);
        textViewDisplayTop03= (TextView)findViewById(R.id.textView4);

        imageView01.setOnClickListener(this);
        imageView02.setOnClickListener(this);
        imageView03.setOnClickListener(this);
        imageView05.setOnClickListener(this);
        imageView06.setOnClickListener(this);
        imageView07.setOnClickListener(this);
        imageView08.setOnClickListener(this);
    }

    public void onClick(View view) {

        if (view.getId() == R.id.imageView) {
            textViewDisplayTop.setText("1");
            num = 1;
        } else if (view.getId() == R.id.imageView2) {
            textViewDisplayTop.setText("2");
            num = 2;
        } else if (view.getId() == R.id.imageView3) {
            textViewDisplayTop.setText("3");
            num = 3;
        }

        if (view.getId() == R.id.imageView5)
        {
            textViewDisplayTop02.setText("4");
            num02 = 4;
        }

        else if (view.getId() == R.id.imageView6) {
            textViewDisplayTop02.setText("5");
            num02 = 5;
        }
        else if (view.getId() == R.id.imageView7) {
            textViewDisplayTop02.setText("6");
            num02 = 6;
        }
       if(view.getId()==R.id.imageView8)
       {
           int sum= num+num02;
           textViewDisplayTop03.setText(""+ sum);
       }
    }
}
