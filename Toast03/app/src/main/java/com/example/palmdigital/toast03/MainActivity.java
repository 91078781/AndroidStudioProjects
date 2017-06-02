package com.example.palmdigital.toast03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "Hi my name is Jaqueline", Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this, "I am 13 years old.", Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this, "My favorite color is pink", Toast.LENGTH_LONG).show();
    }
}
