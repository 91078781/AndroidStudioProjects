package org.palmdigital.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    String newString3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        if(savedInstanceState==null)
        {
            Bundle extras = getIntent().getExtras();

            if(extras==null)
            {
                newString3=null;
            }
            else
            {
                newString3 =extras.getString("STORY_SO_FAR_03");
            }
        }
        else
        {
            newString3 =(String)savedInstanceState.getSerializable("STORY_SO_FAR_03");
        }
    }
    public void story(View v)
    {
        TextView story= (TextView)findViewById(R.id.textView_story);
        story.setText(newString3);
    }
}
