package com.example.sean.fitnessapp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sean on 10/1/2017.
 */

public class UserData {
    public int _ID;
    public String _firstName;
    public String _lastName;
    public int _age;
    public String _email;
    public int _height;
    public double _weight;
    public List<String> _foodAllergies;
    public int _daysPerWeek;
    public double _hoursPerDay;


    public UserData(){
        _ID = 0;
        _firstName = new String("");
        _lastName = new String("");
        _email = new String("");
        _age = 20;
        _height = 10;
        _weight = 150;
        _foodAllergies = new ArrayList<>();
        _daysPerWeek = 7;
        _hoursPerDay = 1.5;
    }

    /*
        DaysPerWeek Bit for each day
        1111111 - 127 (Everyday)
        1111110 - 126 (Not Sunday)
        1111100 - 124 (Not weekends)

     */

    // Loads data for user from phone
    private void Load(){

    }


    public UserData Init(){

        return this;
    }

}
