package org.palmdigital.madlibpizza;

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

        String story= "Today I saw him again. When he looks at me with those ";

        String str_bdy1= bodyPart1.getText().toString();
        String str_color1= color1.getText().toString();
        String str_noun= noun1.getText().toString();
        String str_verb= verb1.getText().toString();
        String str_adj1= adj1.getText().toString();

        story +=str_color1;
         story+= " eyes, it makes my "+str_bdy1;
        story+= " go pitterpat, and I feel as if I have "+ str_noun;
        story+=" in my stomach. When he scrunches his nose, I want to "+str_verb;

        tv_story.setText(story);
    }
}
