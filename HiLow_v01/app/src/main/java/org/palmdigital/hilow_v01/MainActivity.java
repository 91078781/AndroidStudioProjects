package org.palmdigital.hilow_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    int min=1,max=100;
    int guess;
    int answer;
    Random randomNum;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void checkNum(View view)
    {
    checkNumLogic();
    }

    public void again (View view)
    {
        EditText et_guess = (EditText) findViewById(R.id.editText_number);
        et_guess.setText("");
        TextView highLow = (TextView) findViewById(R.id.textView_highLow);
        highLow.setText(" ");
        checkNumLogic();
    }
    public void checkNumLogic()
    {
        randomNum = new Random(10);
        int numGuesses = 3;

        EditText et_guess = (EditText) findViewById(R.id.editText_number);
        String str_guess = et_guess.toString();
        if (!TextUtils.isEmpty(str_guess) && TextUtils.isDigitsOnly(str_guess))
        {
            guess = Integer.parseInt(str_guess);
        }

        TextView highLow = (TextView) findViewById(R.id.textView_highLow);
        for (int i = 0; i < numGuesses; i++)
        {

            if (guess == answer)
            {
                highLow.setText("You won!");
            }
            else if (guess > answer)
            {
                highLow.setText("Too high!");
                numGuesses-= 1;
            }
            else if(guess < answer)
            {
                highLow.setText("Too low!");
                numGuesses-= 1;
            }
        }
        if(numGuesses==0)
        {
            highLow.setText("You Lost");
        }


    }
}
