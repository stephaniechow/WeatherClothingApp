package com.example.steph.weatherclothingapp;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by jinjinwu on 2017/12/2.
 */

@Entity(tableName = "weathers")
public class Weather {
    @PrimaryKey
    private int userID;

    @ColumnInfo(name = "temperature")
    private int temperature;

    @ColumnInfo(name = "ageSpans")
    private int ageSpan;

    @ColumnInfo(name = "genders")
    private int gender;

    @ColumnInfo(name = "styles")
    private int style;

    @ColumnInfo(name = "tops")
    private String tops;

    @ColumnInfo(name = "bottoms")
    private String bottoms;

    public Weather(int temp, int age, int g, int s, String r, String t){
        temperature = temp;
        ageSpan = age;
        gender = g;
        style = s;
        tops= r;
        bottoms = t;
    }

    public void setUserID(int id){
        userID = id;
    }

    public int getUserID(){
        return userID;
    }

    public void setTemperature(int temp){
        temperature = temp;
    }

    public int getTemperature(){
        return temperature;
    }

    public void setAgeSpan(int age){
        ageSpan = age;
    }

    public int getAgeSpan(){
        return ageSpan;
    }

    public void setGender(int g){
        gender = g;
    }

    public int getGender(){
        return gender;
    }

    public void setStyle(int s){
        style = s;
    }

    public int getStyle(){
        return style;
    }

    public void setTops(String r){
        tops = r;
    }

    public String getTops(){
        return tops;
    }

    public String getBottoms(){
        return bottoms;
    }
     public void setBottoms(String r){
        bottoms = r;
     }
}
