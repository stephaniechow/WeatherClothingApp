package com.example.steph.weatherclothingapp;

import android.arch.persistence.room.Room;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView cityField, detailsField, currentTemperatureField;
    private Weather w;
    private AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        cityField = (TextView)findViewById(R.id.city_field);
        detailsField = (TextView)findViewById(R.id.details_field);
        currentTemperatureField = (TextView)findViewById(R.id.current_temperature_field);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "weathers").build();

        db.weatherDao().insert(new Weather(1,1,1,1, ));


        Function.placeIdTask asyncTask =new Function.placeIdTask(new Function.AsyncResponse() {
            public void processFinish(String weather_city, String weather_description, String weather_temperature) {

                cityField.setText(weather_city);
                detailsField.setText(weather_description);
                currentTemperatureField.setText(weather_temperature);

            }
        });
        asyncTask.execute("40.7128", "-74.0060"); //  asyncTask.execute("Latitude", "Longitude")




    }
}
