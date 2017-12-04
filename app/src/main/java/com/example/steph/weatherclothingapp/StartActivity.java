package com.example.steph.weatherclothingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class StartActivity extends AppCompatActivity {

    private RadioButton g1, g2, a1, a2, a3, s1, s2, s3;
    private Button s;
    public static int genderResponse;
    public static int styleResponse;
    public static int ageResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        g1 = (RadioButton) findViewById(R.id.button1);
        g2 = (RadioButton) findViewById(R.id.button2);
        a1 = (RadioButton) findViewById(R.id.radioButton1);
        a2 = (RadioButton) findViewById(R.id.radioButton2);
        a3 = (RadioButton) findViewById(R.id.radioButton3);
        s1 = (RadioButton) findViewById(R.id.styleButton1);
        s2 = (RadioButton) findViewById(R.id.styleButton2);
        s3 = (RadioButton) findViewById(R.id.styleButton3);
        s = (Button) findViewById(R.id.submit);

    }

    public void setValues(View v){
        int id = v.getId();
        switch(id){
            case R.id.button1:
                genderResponse = 1;
                break;
            case R.id.button2:
                genderResponse = 2;
                break;
            case R.id.radioButton1:
                ageResponse = 1;
                break;
            case R.id.radioButton2:
                ageResponse = 2;
                break;
            case R.id.radioButton3:
                ageResponse = 3;
                break;
            case R.id.styleButton1:
                styleResponse = 1;
                break;
            case R.id.styleButton2:
                styleResponse = 2;
                break;
            case R.id.styleButton3:
                styleResponse = 3;
                break;
        }
    }

    public void submit(View view) {
        Intent i = new Intent(this, Data.class);
        startActivity(i);
    }


}