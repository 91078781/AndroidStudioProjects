package com.example.palmdigital.calculator01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageObject01=(ImageView) findViewById(R.id.imageView01);
        ImageView imageObject02=(ImageView) findViewById(R.id.imageView02);
        ImageView imageObject03=(ImageView) findViewById(R.id.imageView03);
        ImageView imageObject04=(ImageView) findViewById(R.id.imageView04);
    }
}
