package org.palmdigital.fizzbuzz02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calculator(View v)
    {
        EditText eInput =(EditText) findViewById(R.id.input);
        TextView tOutput=(TextView)findViewById(R.id.output);
        String strInput = eInput.getText().toString();

        int input= Integer.parseInt(strInput);
        if(input%5==0)
        {
            if ( input%3==0)
            {
                tOutput.setText("FizzBuzz");
            }
            else
            {
                tOutput.setText("Buzz");
            }
        }
        else if(input%3==0)
        {
            tOutput.setText("Fizz");
        }

        else
        {
            tOutput.setText(strInput);
        }
        if (strInput==null)
        {
            tOutput.setText("Please enter a number.");
        }
    }
}
