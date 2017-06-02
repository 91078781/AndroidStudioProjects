package org.palmdigital.edittext01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        TextView result= (TextView) findViewById(R.id.textView_results);
        EditText first= (EditText) findViewById(R.id.editText);
        EditText last= (EditText) findViewById(R.id.editText_lastName);

        String name= "Your name is: ";
        name+= first.getText().toString()+ " "+last.getText().toString();;

        result.setText(name);
    }
}
