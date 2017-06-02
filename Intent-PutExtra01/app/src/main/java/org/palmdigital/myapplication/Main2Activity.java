package org.palmdigital.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity
{

    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if(savedInstanceState==null)
        {
            Bundle extras = getIntent().getExtras();

            if(extras==null)
            {
                newString=null;
            }
            else
            {
                newString =extras.getString("STORY_SO_FAR_01");
            }
        }
        else
        {
            newString =(String)savedInstanceState.getSerializable("STORY_SO_FAR_01");
        }



    }
    public void next02(View view)
    {
        EditText et_adj1= (EditText) findViewById(R.id.editText_adj1_screen2);
        EditText et_adj2= (EditText) findViewById(R.id.editText_adj2_screen2);
        EditText et_plrNoun= (EditText) findViewById(R.id.editText_plr_noun);
        EditText et_noun= (EditText) findViewById(R.id.editText_noun_2);

        String str_adj = et_adj1.getText().toString();
        String str_adj02 = et_adj2.getText().toString();
        String str_plr_N = et_plrNoun.getText().toString();
        String str_noun= et_noun.getText().toString();

        newString+=". Then you cover it with "+str_adj+" sauce, "+str_adj02+ " cheese and freshed chopped "+ str_plr_N;
        newString+= ". Next you have to bake it in a very hot "+ str_noun;

        Intent i =new Intent(this, Main3Activity.class);
        i.putExtra("STORY_SO_FAR_02", newString);
        startActivity(i);
    }
}
