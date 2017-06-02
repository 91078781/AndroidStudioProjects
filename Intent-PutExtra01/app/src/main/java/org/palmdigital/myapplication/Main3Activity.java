package org.palmdigital.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    String newString2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        if(savedInstanceState==null)
        {
            Bundle extras = getIntent().getExtras();

            if(extras==null)
            {
                newString2=null;
            }
            else
            {
                newString2 =extras.getString("STORY_SO_FAR_02");
            }
        }
        else
        {
            newString2 =(String)savedInstanceState.getSerializable("STORY_SO_FAR_02");
        }
    }
    public void next03(View v)
    {
        EditText et_num= (EditText) findViewById(R.id.editText_num1);
        EditText et_shape= (EditText) findViewById(R.id.editText_shape1);
        EditText et_food1= (EditText) findViewById(R.id.editText_food1);
        EditText et_food2= (EditText) findViewById(R.id.editText_food2);
        EditText et_num2= (EditText) findViewById(R.id.editText_num2);

        String str_num = et_num.getText().toString();
        String str_shape = et_shape.getText().toString();
        String str_food = et_food1.getText().toString();
        String str_food2= et_food2.getText().toString();
        String str_num2= et_num2.getText().toString();

        newString2+= ". When it is done, cut it into "+ str_num+" "+str_shape+". Some kids like "+str_food;
        newString2+=" pizza the best, but my favorite is the "+str_food2+ " pizza. If I could, I would eat pizza "+str_num2+" times a day!";

        Intent i =new Intent(this, Main4Activity.class);
        i.putExtra("STORY_SO_FAR_03", newString2);
        startActivity(i);
    }
}
