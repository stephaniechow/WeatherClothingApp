package com.example.steph.weatherclothingapp;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

/**
 * Created by jinjinwu on 2017/12/2.
 */

@Dao
public interface WeatherDao {
    @Query("SELECT tops FROM weather WHERE temperatures LIKE :t AND genders LIKE :g AND ageSpans LIKE :a AND styles LIKE :s")
    String getTopsNeed (int t, int g, int a, int s);

    @Query("SELECT bottoms FROM weather WHERE temperatures LIKE :t AND genders LIKE :g AND ageSpans LIKE :a AND styles LIKE :s")
    String getBottomsNeed (int t, int g, int a, int s);

    @Insert
    void insert(Weather w);
}
