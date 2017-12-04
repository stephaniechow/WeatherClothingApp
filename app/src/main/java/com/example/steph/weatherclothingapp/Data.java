package com.example.steph.weatherclothingapp;

import android.app.ActivityManager;
import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Data extends AppCompatActivity {

    public static AppDatabase db;
    private ArrayList<Weather> weathers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "weathers").build();

        weathers = new ArrayList<Weather>();

        weathers.add(new Weather(1,1,1,1,"puffy_coat","sweats"));
        weathers.add(new Weather(1,1,1,2,"moncler_jacket","black_jeans"));
        weathers.add(new Weather(1,1,1,3,"skater_coat","dress_pants"));
        weathers.add(new Weather(1,1,2,1,"puffy_coat","sweats"));
        weathers.add(new Weather(1,1,2,2,"moncler_jacket","black_jeans"));
        weathers.add(new Weather(1,1,2,3,"skater_coat","dress_pants"));
        weathers.add(new Weather(1,1,3,1,"puffy_coat","sweats"));
        weathers.add(new Weather(1,1,3,2,"moncler_jacket","black_jeans"));
        weathers.add(new Weather(1,1,3,3,"skater_coat","dress_pants"));
        weathers.add(new Weather(1,2,1,1,"puffy_coat","sweats"));
        weathers.add(new Weather(1,2,1,2,"moncler_jacket","black_jeans"));
        weathers.add(new Weather(1,2,1,3,"skater_coat","dress_pants"));
        weathers.add(new Weather(1,2,2,1,"puffy_coat","sweats"));
        weathers.add(new Weather(1,2,2,2,"moncler_jacket","black_jeans"));
        weathers.add(new Weather(1,2,2,3,"skater_coat","dress_pants"));
        weathers.add(new Weather(1,2,3,1,"puffy_coat","sweats"));
        weathers.add(new Weather(1,2,3,2,"moncler_jacket","black_jeans"));
        weathers.add(new Weather(1,2,3,3,"skater_coat","dress_pants"));
        weathers.add(new Weather(2,1,1,1,"denim_jacket","jeans"));
        weathers.add(new Weather(2,1,1,2,"cardigan","long_skirt"));
        weathers.add(new Weather(2,1,1,3,"blazer","dress_pants"));
        weathers.add(new Weather(2,1,2,1,"denim_jacket","jeans"));
        weathers.add(new Weather(2,1,2,2,"cardigan","long_skirt"));
        weathers.add(new Weather(2,1,2,3,"blazer","dress_pants"));
        weathers.add(new Weather(2,1,3,1,"denim_jacket","jeans"));
        weathers.add(new Weather(2,1,3,2,"cardigan","long_skirt"));
        weathers.add(new Weather(2,1,3,3,"blazer","dress_pants"));
        weathers.add(new Weather(2,2,1,1,"denim_jacket","jeans"));
        weathers.add(new Weather(2,2,1,2,"cardigan","khakis"));
        weathers.add(new Weather(2,2,1,3,"blazer","dress_pants"));
        weathers.add(new Weather(2,2,2,1,"denim_jacket","jeans"));
        weathers.add(new Weather(2,2,2,2,"cardigan","khakis"));
        weathers.add(new Weather(2,2,2,3,"blazer","dress_pants"));
        weathers.add(new Weather(2,2,3,1,"denim_jacket","jeans"));
        weathers.add(new Weather(2,2,3,2,"cardigan","khakis"));
        weathers.add(new Weather(2,2,3,3,"blazer","dress_pants"));
        weathers.add(new Weather(3,1,1,1,"flannel","shorts"));
        weathers.add(new Weather(3,1,1,2,"cardigan","short_skirt"));
        weathers.add(new Weather(3,1,1,3,"blazer","long_skirt"));
        weathers.add(new Weather(3,1,2,1,"flannel","shorts"));
        weathers.add(new Weather(3,1,2,2,"cardigan","short_skirt"));
        weathers.add(new Weather(3,1,2,3,"blazer","long_skirt"));
        weathers.add(new Weather(3,1,3,1,"flannel","shorts"));
        weathers.add(new Weather(3,1,3,2,"cardigan","short_skirt"));
        weathers.add(new Weather(3,1,3,3,"blazer","long_skirt"));
        weathers.add(new Weather(3,2,1,1,"flannel","shorts"));
        weathers.add(new Weather(3,2,1,2,"denim_jacket","khakis"));
        weathers.add(new Weather(3,2,1,3,"blazer","dress_pants"));
        weathers.add(new Weather(3,2,2,1,"flannel","shorts"));
        weathers.add(new Weather(3,2,2,2,"denim_jacket","khakis"));
        weathers.add(new Weather(3,2,2,3,"blazer","dress_pants"));
        weathers.add(new Weather(3,2,3,1,"flannel","shorts"));
        weathers.add(new Weather(3,2,3,2,"denim_jacket","khakis"));
        weathers.add(new Weather(3,2,3,3,"blazer","dress_pants"));

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                db.weatherDao().insertAll(weathers);
            }
        };

        Thread addQuestions = new Thread(r1);
        addQuestions.start();

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
