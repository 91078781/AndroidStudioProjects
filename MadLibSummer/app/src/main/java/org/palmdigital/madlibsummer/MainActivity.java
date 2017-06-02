package org.palmdigital.madlibsummer;

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
    public void makeStory(View v)
    {
        String story ="Last summer, my mom and dad took me and ";

        TextView makeS = (TextView) findViewById(R.id.textView_story);

        EditText name01=(EditText)findViewById(R.id.editText_name01);
        EditText place01=(EditText)findViewById(R.id.editText_place01);
        EditText adj01=(EditText)findViewById(R.id.editText_adjective1);
        EditText plr_noun=(EditText)findViewById(R.id.editText_plr_noun1);
        EditText ad02=(EditText)findViewById(R.id.editText_adjective2);
        EditText plr_noun2=(EditText)findViewById(R.id.editText_plr_noun2);
        EditText place03=(EditText)findViewById(R.id.editText_place03);
        EditText actionV =(EditText) findViewById(R.id.editText_actionVerb);
        EditText plrN =(EditText) findViewById(R.id.editText_plr_noun3);

        String str_name= name01.getText().toString();
        String str_place= place01.getText().toString();
        String str_ad1= adj01.getText().toString();
        String str_noun= plr_noun.getText().toString();
        String str_ad2= ad02.getText().toString();
        String str_noun2= plr_noun2.getText().toString();
        String str_place03= place03.getText().toString();
        String actionVerb = actionV.getText().toString();
        String plr_Noun = plrN.getText().toString();

        story+= str_name+ " on a trip to "+ str_place+ ". The weather there is very "+ str_ad1+ "! Northern "+ str_place;
        story+= " has many "+ str_noun+ ", and they make "+str_ad2+ " "+ str_noun2;
        story+= " there. Many people also go to "+str_place03+ " to "+ actionVerb+ " or see the "+plr_Noun+".";
        makeS.setText(story);
    }
}
