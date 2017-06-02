package com.example.palmdigital.imagebutton01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

//import static com.example.palmdigital.imagebutton01.R.id.imageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton imageButton01 = (ImageButton)findViewById(R.id.imageButton01);
        imageButton01.setOnClickListener(this);
        ImageButton imageButton02= (ImageButton) findViewById(R.id.imageButton02);
        imageButton02.setOnClickListener(this);

    }

    public void onClick(View view)
    {
        if (view.getId()== R.id.imageButton01)
        {
            Toast.makeText(MainActivity.this, "You clicked the colorful flower", Toast.LENGTH_SHORT).show();
            Log.i("info", "Opening colorful flower");
        }
        else if(view.getId()==R.id.imageButton02)
    {
        Toast.makeText(MainActivity.this, "You clicked the black flower", Toast.LENGTH_SHORT).show();
        Log.i("info", "Opening black flower");
    }
    }
}
