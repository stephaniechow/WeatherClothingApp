package com.example.steph.weatherclothingapp;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * Created by jinjinwu on 2017/12/2.
 */

@Entity(tableName = "weathers")
public class Weather {
    public static int pk = 0;
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
    private int tops;

    @ColumnInfo(name = "bottoms")
    private int bottoms;

    public Weather(int temp, int age, int g, int s, int r, int t){
        userID = pk++;
        temperature = temp;
        ageSpan = age;
        gender = g;
        style = s;
        tops= r;
        bottoms = t;
    }

    public Weather(){}

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

    public void setTops(int r){
        tops = r;
    }

    public int getTops(){
        return tops;
    }

    public int getBottoms(){
        return bottoms;
    }

    public void setBottoms(int r){
        bottoms = r;
     }

}
