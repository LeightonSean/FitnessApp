package com.example.sean.fitnessapp;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import java.util.Random;
import java.util.Date;
/**
 * Created by seanleighton on 2/6/18.
 */

public class ExerciseListActivity extends ListActivity {

    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        int numExercises = new Random().nextInt(5) + 1;
        Exercise[] values = new Exercise[numExercises];
        for(int i = 0; i < numExercises; i++) {
            values[i] = CreateRandomExercise();
        }
        ArrayAdapter<Exercise> adapter = new ArrayAdapter<Exercise>(this,
                android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
    }

    private String[] _abExercises = new String[]{
      "Bycicle", "Plank", "V-Sit", "Crunch", "Russian Twist", "Mountain Climbers", "Side-Plank", "V-Sit Scissor"
    };
    private String[] _armExercises = new String[]{
      "Curls", "Lat-Pull down", "Pushup", "Dips", "Pull Ups", "Lat-Push Down", "Tricep Extension", "Bent Over Row"
    };
    private String[] _backExercises = new String[]{
      "Pull Down", "Yoga", "Reverse Fly", "KettleBell Swing", "Dead lift", "Bent over Row", "Pull Up"
    };
    private String[] _chestExercises = new String[]{
      "Bench Press", "Pushup", "Single Arm Press", "Fly", "Dumbbell Press", "Incline Bench Press",
            "Incline DumbBell Press"
    };
    private String[] _legExercises = new String[]{
      "Squat", "Single Leg Dip", "Goblet Squat", "Leg Press", "Resistance Band Exercise"
    };
    private String[] _shoulderExercises = new String[]{
      "Single Arm Press", "Pull Up"
    };
    private Exercise CreateRandomExercise(){
        ExerciseType type;
        String description = "Random Exercise";
        switch(new Random().nextInt(7)){
            case 0:
                description = "Run";
                type = ExerciseType.CARDIO;
                break;
            case 1:

                type = ExerciseType.ABS;
                break;
            case 2:
                type = ExerciseType.ARMS;
                break;
            case 3:
                type = ExerciseType.BACK;
                break;
            case 4:
                type = ExerciseType.CHEST;
                break;
            case 5:
                type = ExerciseType.LEGS;
                break;
            case 6:
                type = ExerciseType.SHOULDER;
                break;
            default:
                type = ExerciseType.ABS;
        }

        int numReps = new Random().nextInt(25);
        int numSets = new Random().nextInt(5);
        int weight = type == ExerciseType.ABS || type == ExerciseType.CARDIO ? -1 : new Random().nextInt(60);
        int time = new Random().nextInt(91);
        Date curDate =  new Date();





        return new Exercise(type,numReps, numSets, curDate, time, description, weight);
    }


}
