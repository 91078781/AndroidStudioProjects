package com.example.palmdigital.imageviewclick01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView01= (ImageView) findViewById(R.id.imageView01);
        ImageView imageView02= (ImageView) findViewById(R.id.imageView02);
        ImageView imageView03= (ImageView) findViewById(R.id.imageView03);
        imageView01.setOnClickListener(this);
        imageView02.setOnClickListener(this);
        imageView03.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if(view.getId()==R.id.imageView01)
        {
            Toast.makeText(MainActivity.this, "Opening Contacts", Toast.LENGTH_SHORT).show();
            Log.i("info", "Opening Contacts");
        }
        else if(view.getId()==R.id.imageView02)
        {
            Toast.makeText(MainActivity.this, "Opening Email", Toast.LENGTH_SHORT).show();
            Log.i("info", "Opening Email");
        }
        else if(view.getId()==R.id.imageView03)
        {
            Toast.makeText(MainActivity.this, "Opening Messaqges", Toast.LENGTH_SHORT).show();
            Log.i("info", "Opening Messages");
        }
    }
}
