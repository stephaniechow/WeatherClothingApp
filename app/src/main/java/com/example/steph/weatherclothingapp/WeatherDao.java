package com.example.steph.weatherclothingapp;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.ArrayList;

/**
 * Created by jinjinwu on 2017/12/2.
 */

@Dao
public interface WeatherDao {
    @Query("SELECT tops FROM weathers WHERE temperature = :t AND genders = :g AND ageSpans = :a AND styles = :s")
    int getTopsNeed (int t, int g, int a, int s);

    @Query("SELECT bottoms FROM weathers WHERE temperature = :t AND genders = :g AND ageSpans = :a AND styles = :s")
    int getBottomsNeed (int t, int g, int a, int s);

    @Insert
    void insertAll(ArrayList<Weather> w);
}
