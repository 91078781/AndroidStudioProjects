package com.example.palmdigital.chooseyourownadventure_v02;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.R.color.background_light;
import static android.R.color.holo_green_light;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button leftButton;
    Button rightButton;
    TextView textView_story;
    TextView textView_question;
    String screen= "main";
    LinearLayout lL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_story =(TextView)findViewById(R.id.textView_story);
        textView_question = (TextView) findViewById(R.id.textView_question);

        leftButton= (Button) findViewById(R.id.button_left);
        rightButton=(Button) findViewById(R.id.button_right);
        lL= (LinearLayout) findViewById(R.id.activity_main);

        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);

        textView_story.setText("One morning the Tortoise woke up in a dream.");
        textView_question.setText("Do you want to wake up or explore the dream?");

        leftButton.setText("wake up");
        rightButton.setText("explore");

}

    public void onClick(View view)
    {
        if (screen=="main")
        {
            textView_story.setText("One morning the Tortoise woke up in a dream.");
            textView_question.setText("Do you want to wake up or explore the dream?");

            leftButton.setText("wake up");
            rightButton.setText("explore");
        }
            if (view.getId() == R.id.button_left)
            {
                if(screen.equalsIgnoreCase("main"))
                {
                    screen = "boring day";
                }
            }
            else if (view.getId() == R.id.button_right)
            {
               if(screen.equalsIgnoreCase("main"))
               {
                   screen="green ooze";
               }
            }
        if (screen.contentEquals("boring day"))
        {
            textView_story.setText("You wake up and have a boring day. The end.");
            textView_question.setText("");
            leftButton.setBackgroundColor(0x00000000);
            rightButton.setBackgroundColor(0x00000000);
            leftButton.setText("");
            rightButton.setText("");
            lL.setBackgroundColor(Color.GRAY);
        }
        else if (screen.contentEquals("green ooze"))
        {
            textView_story.setText("You approach a glowing, green bucket of ooze. Worried that you will get in trouble, you pick up the bucket.");
            textView_question.setText("Do you want to pour the ooze into the backyard or toilet?");
            textView_question.setTextSize(25);
            textView_story.setTextSize(25);
            leftButton.setText("backyard");
            rightButton.setText("toilet");
        }
        if(view.getId()==R.id.button_left)
        {
            if (leftButton.getText().equals("backyard"))
            {
                screen="backyard";
            }
        }
        if (screen=="backyard")
        {
            textView_story.setText("As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
            textView_question.setText("As the man starts to prepare you as soup, do you...Scream or Faint ?");
            lL.setBackgroundColor(Color.RED);
            leftButton.setText("Scream");
            rightButton.setText("Faint");

        }
        if (screen == "toilet")
        {
            textView_story.setText("As you pour the ooze into the toilet it backs up, gurgles, and explodes, covering you in radioactive waste.");
            textView_question.setText("Do you want to train to be a NINJA?  Yes or HECK YES?");
            lL.setBackgroundColor(Color.YELLOW);
            leftButton.setText("Yes");
            rightButton.setText("HECK YES");

        }
        if(screen=="toilet")
        {
            if (view.getId() == R.id.button_left||view.getId() == R.id.button_right)
            {
                screen = "ninja";
            }
        }

        if(screen=="soup")
        {
            textView_story.setText("You made a delicious soup! Yum! The end.");
            textView_question.setText("");
            leftButton.setText("");
            rightButton.setText("");
            leftButton.setBackgroundColor(0x00000000);
            rightButton.setBackgroundColor(0x00000000);
            lL.setBackgroundColor(Color.YELLOW);

        }
        /*if(screen==8)
        {
            textView_story.setText("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");
            textView_question.setText("");
            leftButton.setText("");
            rightButton.setText("");
            leftButton.setBackgroundColor(0x00000000);
            rightButton.setBackgroundColor(0x00000000);
            lL.setBackgroundColor(Color.BLACK);

        }*/
    }


}
