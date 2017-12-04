package com.example.steph.weatherclothingapp;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by jinjinwu on 2017/12/2.
 */

@Database(entities = {Weather.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase{
    public abstract WeatherDao weatherDao();
}