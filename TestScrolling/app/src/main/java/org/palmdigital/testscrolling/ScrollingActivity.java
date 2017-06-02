package org.palmdigital.testscrolling;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);

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
