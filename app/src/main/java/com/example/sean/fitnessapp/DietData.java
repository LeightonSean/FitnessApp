package com.example.sean.fitnessapp;

import java.util.Date;

/**
 * Created by Sean on 10/1/2017.
 */

public class DietData {
    int _fatMacro;
    int _carbMacro;
    int _proteinMacro;
    int _calories;
    Date _date;

    public DietData(){
        _fatMacro = 91;
        _proteinMacro = 138;
        _carbMacro = 479;
        _calories = 3290;
        _date = new Date();
    }

}
