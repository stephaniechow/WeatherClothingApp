package com.example.steph.weatherclothingapp;

import android.arch.persistence.room.Room;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.steph.weatherclothingapp.StartActivity.ageResponse;
import static com.example.steph.weatherclothingapp.StartActivity.genderResponse;
import static com.example.steph.weatherclothingapp.StartActivity.styleResponse;

public class MainActivity extends AppCompatActivity {

    TextView cityField, detailsField, currentTemperatureField;
    ImageView topImage, bottomImage;
    private Weather w;
    private AppDatabase db;
    private double temp;
    private int tempResponse;
    private int topResponse, bottomResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        cityField = (TextView)findViewById(R.id.city_field);
        detailsField = (TextView)findViewById(R.id.details_field);
        currentTemperatureField = (TextView)findViewById(R.id.current_temperature_field);
        topImage= (ImageView) findViewById(R.id.imageView1);
        bottomImage= (ImageView) findViewById(R.id.imageView2);

        db = Data.db;

        Function.placeIdTask asyncTask = new Function.placeIdTask(new Function.AsyncResponse() {
            public void processFinish(String weather_city, String weather_description, String weather_temperature) {

                cityField.setText(weather_city);
                detailsField.setText(weather_description);
                currentTemperatureField.setText(weather_temperature);
                temp = Double.parseDouble(weather_temperature);

            }
        });
        asyncTask.execute("40.7128", "-74.0060"); //  asyncTask.execute("Latitude", "Longitude")

        if (temp<=0){
            tempResponse = 1;
        }
        else if (temp>0 && temp<20){
            tempResponse = 2;
        }
        else if(temp>=20){
            tempResponse = 3;
        }

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                topResponse = db.weatherDao().getTopsNeed(tempResponse, genderResponse, ageResponse, styleResponse);
                bottomResponse = db.weatherDao().getBottomsNeed(tempResponse, genderResponse, ageResponse, styleResponse);

                topImage.setImageResource(topResponse);

                bottomImage.setImageResource(bottomResponse);
            }
        };

        Thread t = new Thread(r2);
        t.start();

    }
}
