package com.example.sean.fitnessapp;
import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;



/**
 * Created by seanleighton on 12/14/17.
 */

public class Brain extends AppCompatActivity implements View.OnClickListener {

    private ImageButton btnViewExercises;
    private ImageButton btnViewProgress;
    private ImageButton btnSettings;
    private ImageButton btnBack;

    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        setContentView(R.layout.home_screen);

        btnViewExercises = (ImageButton)findViewById(R.id.btnViewExercises);
        btnViewProgress = (ImageButton)findViewById(R.id.btnViewProgress);
        btnSettings = (ImageButton)findViewById(R.id.btnSettings);

        btnViewExercises.setOnClickListener(this);
        btnViewProgress.setOnClickListener(this);
        btnSettings.setOnClickListener(this);







    }

    private void InitHome(){
        btnViewExercises = (ImageButton)findViewById(R.id.btnViewExercises);
        btnViewProgress = (ImageButton)findViewById(R.id.btnViewProgress);
        btnSettings = (ImageButton)findViewById(R.id.btnSettings);

        btnViewExercises.setOnClickListener(this);
        btnViewProgress.setOnClickListener(this);
        btnSettings.setOnClickListener(this);
    }


    private void InitExercise(){
        btnBack = (ImageButton)findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){


        switch(view.getId()){
            case R.id.btnViewExercises:
                ViewExercises(view);
                break;
            case R.id.btnViewProgress:
                break;
            case R.id.btnSettings:
                break;
            case R.id.btnBack:
                ViewHome(view);
                break;
        }

    }

    private void ViewExercises(View view){

        //Intent nextScreen = new Intent(getApplicationContext(), ExerciseViewBrain.class);

        setContentView(R.layout.view_workout);

        InitExercise();
    }

    private void ViewHome(View view){
        setContentView(R.layout.home_screen);



        InitHome();

    }


}
