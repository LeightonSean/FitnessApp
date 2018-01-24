package com.example.sean.fitnessapp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;
import java.util.Random;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    UserData _jerry;
    Schedule sched;
    public void SetupUser(){
        _jerry = new UserData();

        _jerry._age = 25;
        _jerry._firstName = "Jerry";
        _jerry._lastName = "Smith";
        _jerry._email = "jerrdogg@mail.com";
        _jerry._hoursPerDay = 1.5;
        _jerry._daysPerWeek = 126;



    }

    @Test
    public void SetupSchedule(){


        Random rand = new Random();
        sched = new Schedule();

        List<Exercise> thisWeeksExercises = new ArrayList<Exercise>();
        for(int i = 0; i < 8; i++) {
            Exercise e = new Exercise();
            e._description = i + "";
            e._numberOfSets = rand.nextInt(50) + 1;
            e._numberOfReps = rand.nextInt(50) + 1;
            int type = rand.nextInt(7);
            switch(type){
                case 0:
                    e._exerciseType = ExerciseType.ABS;
                    break;
                case 1:
                    e._exerciseType = ExerciseType.ARMS;
                    break;
                case 2:
                    e._exerciseType = ExerciseType.BACK;
                    break;
                case 3:
                    e._exerciseType = ExerciseType.CARDIO;
                    break;
                case 4:
                    e._exerciseType = ExerciseType.CHEST;
                    break;
                case 5:
                    e._exerciseType = ExerciseType.SHOULDER;
                    break;
                case 6:
                    e._exerciseType = ExerciseType.LEGS;
                    break;
                default:
                    e._exerciseType = ExerciseType.ABS;
                    break;
            }

            e._dateOfExercise = new Date();
            e._weight = rand.nextInt(200) + 5;
            thisWeeksExercises.add(e);
        }

        sched.CreateExerciseSchedule(thisWeeksExercises);

        System.out.println(sched.Print());

    }


    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
}