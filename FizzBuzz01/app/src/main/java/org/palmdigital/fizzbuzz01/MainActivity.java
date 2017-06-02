package org.palmdigital.fizzbuzz01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void fizzBuzz(View v)
    {
        TextView make =(TextView)findViewById(R.id.textView_fizzbuzz);
        EditText num = (EditText) findViewById(R.id.editText);
        String num2 = num.getText().toString();
       int i = Integer.parseInt(num2);
        if (i % 3 == 0 && i % 5 == 0)
        {
            make.setText("Fizzbuzz");
        }
        else if (i % 3 == 0)
        {
            make.setText("Fizz");
        }
        else if (i % 5 == 0)
        {
            make.setText("Buzz");
        }
        else
        {
            make.setText(i + " ");
        }


    }
}
