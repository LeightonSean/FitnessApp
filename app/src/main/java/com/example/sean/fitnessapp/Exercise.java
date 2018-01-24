package com.example.sean.fitnessapp;

import java.util.Date;

/**
 * Created by Sean on 10/1/2017.
 */

enum ExerciseType{
    CARDIO,
    ARMS,
    SHOULDER,
    CHEST,
    ABS,
    BACK,
    LEGS
}

public class Exercise {
    ExerciseType _exerciseType;
    int _numberOfReps;
    int _numberOfSets;
    Date _dateOfExercise;
    int _time;
    String _description;
    boolean hasChanged;
    int _weight;

    public Exercise(){
        _exerciseType = ExerciseType.CARDIO;
        _numberOfReps = 0;
        _numberOfSets = 0;
        _dateOfExercise = new Date();
        _time = 60;
        _description = "";
        _weight = 0;
        hasChanged = false;
    }

    public Exercise(ExerciseType exerciseType, int numberOfReps, int numberOfSets, Date date, int duration, String description, int weight){
        _exerciseType = exerciseType;
        _numberOfReps = numberOfReps;
        _numberOfSets = numberOfSets;
        _dateOfExercise = date;
        _time = duration;
        _description = description;
        _weight = weight;
        hasChanged = false;
    }

    public Date GetDate(){ return _dateOfExercise; }
    public ExerciseType GetExerciseType(){return _exerciseType; }
    public int GetNumberOfReps(){ return _numberOfReps; }
    public int GetNumberOfSets(){ return _numberOfSets; }
    public int GetDuration(){ return _time; }
    public String GetDescription(){ return  _description; }

}
