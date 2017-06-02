package org.palmdigital.phonerepo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

     EditText name;
     EditText id;
     EditText phone;
    String str_name;

    String str_id;
    String str_phone;

    Button load;
    Button save;
    private SharedPreferences pref;
     SharedPreferences.Editor editor;


    String databaseName = "PhoneRepoInfo";
    String studentName = "studentName";
    String studentID = "studentID";
    String phoneDescription = "phoneDescription";
    String defaultString= "no info";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name= (EditText) findViewById(R.id.editText_name);
        id =(EditText)findViewById(R.id.editText_id);
        phone= (EditText) findViewById(R.id.editText_description);

        load=(Button)findViewById(R.id.button_load);
        save=(Button) findViewById(R.id.button_save);

         str_id = id.getText().toString();
         str_phone= phone.getText().toString();
          str_name = name.getText().toString();

        pref = getSharedPreferences(databaseName, MODE_PRIVATE);
        editor = pref.edit();
    }

    public void save(View v)
    {
        if (v.getId()==R.id.button_save)
        {
                editor.putString(studentName, str_name);
                editor.putString(studentID, str_id);
                editor.putString(phoneDescription, str_phone);
                editor.commit();

        }

    }
    public void load(View view)
    {
        if (view.getId()==R.id.button_load)
        {
                String nameString = pref.getString(studentName, defaultString);
                name.setText(nameString);

                String idString = pref.getString(studentID, defaultString);
                id.setText(idString);

                String phoneString = pref.getString(phoneDescription, defaultString);
                phone.setText(phoneString);

        }


    }

}
