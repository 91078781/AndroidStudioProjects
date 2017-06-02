package org.palmdigital.madlibpuppylove;

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
        EditText color1= (EditText) findViewById(R.id.editText_color1);
        TextView tv_story= (TextView) findViewById(R.id.textView_story);

        EditText bodyPart1= (EditText) findViewById(R.id.editText_bodyPart);
        EditText noun1= (EditText) findViewById(R.id.editText_noun1);
        EditText verb1= (EditText)findViewById(R.id.editText_verb);
        EditText adj1=(EditText) findViewById(R.id.editText_adjective1);
        EditText adj2 =(EditText) findViewById(R.id.editText_adjective2);
        EditText verb2 =(EditText) findViewById(R.id.editText_vb2);
        EditText noun2 =(EditText) findViewById(R.id.editText_noun2);
        EditText noun3 =(EditText) findViewById(R.id.editText_noun3);

        String story= "Today I saw him again. When he looks at me with those ";

        String str_bdy1= bodyPart1.getText().toString();
        String str_color1= color1.getText().toString();
        String str_noun= noun1.getText().toString();
        String str_verb= verb1.getText().toString();
        String str_adj1= adj1.getText().toString();
        String str_adj2= adj2.getText().toString();
        String str_verb2= verb2.getText().toString();
        String str_noun2= noun2.getText().toString();
        String str_noun3= noun3.getText().toString();

        story +=str_color1;
        story+= " eyes, it makes my "+str_bdy1;
        story+= " go pitterpat, and I feel as if I have "+ str_noun;
        story+=" in my stomach. When he scrunches his nose, I want to "+str_verb;
        story+=" him softly. He is so "+ str_adj1;
        story+=" and "+ str_adj2;
        story+=". Tomorrow he will be mine. For now he "+ str_verb2;
        story+=" in the store "+ str_noun2;
        story+= " looking at me. "+str_noun3+" love is hard to resist!";

        tv_story.setText(story);
    }
}
