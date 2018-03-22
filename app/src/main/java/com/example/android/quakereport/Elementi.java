package com.example.android.quakereport;


public class Elementi {

    private String mCity, mDate;
    private double mMagnitude;

    public Elementi(String City, String Date, double Magnitude) {

        mDate = Date;
        mCity = City;
        mMagnitude = Magnitude;

    }


    public String getmCity() {
        return mCity;
    }

    public String getmDate() {
        return mDate;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }
}
