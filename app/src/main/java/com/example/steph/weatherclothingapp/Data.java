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

        weathers.add(new Weather(1,1,1,1,R.drawable.puffy_coat,R.drawable.sweats));
        weathers.add(new Weather(1,1,1,2,R.drawable.moncler_jacket,R.drawable.black_jeans));
        weathers.add(new Weather(1,1,1,3,R.drawable.skater_jacket,R.drawable.dress_pants));
        weathers.add(new Weather(1,1,2,1,R.drawable.puffy_coat,R.drawable.sweats));
        weathers.add(new Weather(1,1,2,2,R.drawable.moncler_jacket,R.drawable.black_jeans));
        weathers.add(new Weather(1,1,2,3,R.drawable.skater_jacket,R.drawable.dress_pants));
        weathers.add(new Weather(1,1,3,1,R.drawable.puffy_coat,R.drawable.sweats));
        weathers.add(new Weather(1,1,3,2,R.drawable.moncler_jacket,R.drawable.black_jeans));
        weathers.add(new Weather(1,1,3,3,R.drawable.skater_jacket,R.drawable.dress_pants));
        weathers.add(new Weather(1,2,1,1,R.drawable.puffy_coat,R.drawable.sweats));
        weathers.add(new Weather(1,2,1,2,R.drawable.moncler_jacket,R.drawable.black_jeans));
        weathers.add(new Weather(1,2,1,3,R.drawable.skater_jacket,R.drawable.dress_pants));
        weathers.add(new Weather(1,2,2,1,R.drawable.puffy_coat,R.drawable.sweats));
        weathers.add(new Weather(1,2,2,2,R.drawable.moncler_jacket,R.drawable.black_jeans));
        weathers.add(new Weather(1,2,2,3,R.drawable.skater_jacket,R.drawable.dress_pants));
        weathers.add(new Weather(1,2,3,1,R.drawable.puffy_coat,R.drawable.sweats));
        weathers.add(new Weather(1,2,3,2,R.drawable.moncler_jacket,R.drawable.black_jeans));
        weathers.add(new Weather(1,2,3,3,R.drawable.skater_jacket,R.drawable.dress_pants));
        weathers.add(new Weather(2,1,1,1,R.drawable.denim_jacket,R.drawable.jeans));
        weathers.add(new Weather(2,1,1,2,R.drawable.cardigan,R.drawable.long_skirt));
        weathers.add(new Weather(2,1,1,3,R.drawable.blazer,R.drawable.dress_pants));
        weathers.add(new Weather(2,1,2,1,R.drawable.denim_jacket,R.drawable.jeans));
        weathers.add(new Weather(2,1,2,2,R.drawable.cardigan,R.drawable.long_skirt));
        weathers.add(new Weather(2,1,2,3,R.drawable.blazer,R.drawable.dress_pants));
        weathers.add(new Weather(2,1,3,1,R.drawable.denim_jacket,R.drawable.jeans));
        weathers.add(new Weather(2,1,3,2,R.drawable.cardigan,R.drawable.long_skirt));
        weathers.add(new Weather(2,1,3,3,R.drawable.blazer,R.drawable.dress_pants));
        weathers.add(new Weather(2,2,1,1,R.drawable.denim_jacket,R.drawable.jeans));
        weathers.add(new Weather(2,2,1,2,R.drawable.cardigan,R.drawable.khakis));
        weathers.add(new Weather(2,2,1,3,R.drawable.blazer,R.drawable.dress_pants));
        weathers.add(new Weather(2,2,2,1,R.drawable.denim_jacket,R.drawable.jeans));
        weathers.add(new Weather(2,2,2,2,R.drawable.cardigan,R.drawable.khakis));
        weathers.add(new Weather(2,2,2,3,R.drawable.blazer,R.drawable.dress_pants));
        weathers.add(new Weather(2,2,3,1,R.drawable.denim_jacket,R.drawable.jeans));
        weathers.add(new Weather(2,2,3,2,R.drawable.cardigan,R.drawable.khakis));
        weathers.add(new Weather(2,2,3,3,R.drawable.blazer,R.drawable.dress_pants));
        weathers.add(new Weather(3,1,1,1,R.drawable.flannel,R.drawable.shorts));
        weathers.add(new Weather(3,1,1,2,R.drawable.cardigan,R.drawable.short_skirt));
        weathers.add(new Weather(3,1,1,3,R.drawable.blazer,R.drawable.long_skirt));
        weathers.add(new Weather(3,1,2,1,R.drawable.flannel,R.drawable.shorts));
        weathers.add(new Weather(3,1,2,2,R.drawable.cardigan,R.drawable.short_skirt));
        weathers.add(new Weather(3,1,2,3,R.drawable.blazer,R.drawable.long_skirt));
        weathers.add(new Weather(3,1,3,1,R.drawable.flannel,R.drawable.shorts));
        weathers.add(new Weather(3,1,3,2,R.drawable.cardigan,R.drawable.short_skirt));
        weathers.add(new Weather(3,1,3,3,R.drawable.blazer,R.drawable.long_skirt));
        weathers.add(new Weather(3,2,1,1,R.drawable.flannel,R.drawable.shorts));
        weathers.add(new Weather(3,2,1,2,R.drawable.denim_jacket,R.drawable.khakis));
        weathers.add(new Weather(3,2,1,3,R.drawable.blazer,R.drawable.dress_pants));
        weathers.add(new Weather(3,2,2,1,R.drawable.flannel,R.drawable.shorts));
        weathers.add(new Weather(3,2,2,2,R.drawable.denim_jacket,R.drawable.khakis));
        weathers.add(new Weather(3,2,2,3,R.drawable.blazer,R.drawable.dress_pants));
        weathers.add(new Weather(3,2,3,1,R.drawable.flannel,R.drawable.shorts));
        weathers.add(new Weather(3,2,3,2,R.drawable.denim_jacket,R.drawable.khakis));
        weathers.add(new Weather(3,2,3,3,R.drawable.blazer,R.drawable.dress_pants));

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
