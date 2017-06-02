package org.palmdigital.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void next01(View view)
    {
        EditText et_adj01= (EditText) findViewById(R.id.edit_text_adj01);
        EditText et_nationality01 =(EditText) findViewById(R.id.editText_nationality01);
        EditText et_name01 =(EditText) findViewById(R.id.editText_name01);
        EditText et_noun01 =(EditText) findViewById(R.id.editText_noun01);
        EditText et_adj02 =(EditText) findViewById(R.id.editText_adj02);
        EditText et_noun02 =(EditText) findViewById(R.id.editText_noun2);

        String str_nationality01 = et_nationality01.getText().toString();
        String str_adj01 = et_adj01.getText().toString();
        String str_name01 = et_name01.getText().toString();
        String str_noun01 = et_noun01.getText().toString();
        String str_adj02 = et_adj02.getText().toString();
        String str_noun02 = et_noun02.getText().toString();

        String story= "Pizza was invented by a "+str_adj01+ " "+ str_nationality01+ "chef named " +str_name01+". To make pizza, you need a lump of "+ str_noun01+", and make a thin, round "+ str_adj02+ " "+ str_noun02;

        Intent i =new Intent(this, Main2Activity.class);
        i.putExtra("STORY_SO_FAR_01", story);
        startActivity(i);
    }
}
