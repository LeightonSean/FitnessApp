package com.example.sean.fitnessapp;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;


/**
 * Created by seanleighton on 12/14/17.
 */

public class ExerciseViewBrain extends AppCompatActivity implements View.OnClickListener {


    private ListView _exerciseData;

    @Override
    public void onClick(View view){

        _exerciseData = (ListView)findViewById(R.id.lvWeekExercise);

    }





}




