package com.example.palmdigital.addandswitchactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Wakeup extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wakeup);
        Button back= (Button)findViewById(R.id.button_back);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent m = new Intent(this,MainActivity.class);
        startActivity(m);
    }
}
