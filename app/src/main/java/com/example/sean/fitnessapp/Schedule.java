package com.example.sean.fitnessapp;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;



/**
 * Created by seanleighton on 10/6/17.
 */

public class Schedule {

    private Date curDate;
    private Node<List<Exercise>> exerciseSchedule;

    public Schedule() {
        curDate = new Date();
        curDate.setTime(0);
        CreateExerciseSchedule();
    }

    public Schedule(Date start){
        curDate = start;
        curDate.setTime(0);
        CreateExerciseSchedule();
    }

    public void LoadExerciseSchedule(Node<List<Exercise>> schedule){

    }

    public void CreateExerciseSchedule(){
        List<Exercise> thisWeeksExercises = new ArrayList<Exercise>();
        thisWeeksExercises.add(new Exercise());
        CreateExerciseSchedule(thisWeeksExercises);
    }

    public void CreateExerciseSchedule(List<Exercise> schedule) {

        if (exerciseSchedule == null) {
            exerciseSchedule = new Node<>();
        }

        // Connect to DB, get all exercises for current date


        for (int i = 0; i < schedule.size(); i++) {

            Exercise e = schedule.get(i);
            Date exD = e.GetDate();
            exD.setTime(0);
            if (exD.compareTo(curDate) == 0) {
                List<Exercise> tmp = exerciseSchedule.GetTask();
                if(tmp == null) tmp = new ArrayList<Exercise>();
                tmp.add(e);
                exerciseSchedule.AssignTask(tmp);
            } else {
                ScheduleExercise(e, exerciseSchedule.GetNextTask() );
            }
        }

    }


    private void ScheduleExercise(Exercise e, Node<List<Exercise>> curDay){

        if(curDay != null) {
            List<Exercise> tmp = curDay.GetTask();
            if (tmp.size() > 0) {
                Exercise ex = tmp.get(0);
                if (ex.GetDate() == e.GetDate()) {
                    tmp.add(ex);
                    curDay.AssignTask(tmp);
                } else {
                    ScheduleExercise(e, curDay.GetNextTask());
                }
            }
        }

    }

    public Date GetStartDate(){ return curDate; }
    public void SetStartDate(Date d){ curDate = d; }
    public List<Exercise> GetCurrentExercises(){ return exerciseSchedule.GetTask(); }


    public List<Exercise> GetExercisesForDate(Date d){
        return FindExercises(d, exerciseSchedule);
    }

    private List<Exercise> FindExercises(Date d, Node<List<Exercise>> curDay ){

        if(curDay != null){
            List<Exercise> tmp = curDay.GetTask();
            if(tmp.size() > 0){
                Exercise e = tmp.get(0);
                if(e.GetDate() == d){
                    return tmp;
                }
            }
            return FindExercises(d, curDay.GetNextTask());
        }
        else{
            // End of schedule, couldn't find the schedule for this date
            return new ArrayList<>();
        }

    }

    public String Print(){

        String display = "";
        Node<List<Exercise>> n = exerciseSchedule;
        do{
            List<Exercise> day = n.GetTask();
            if(day != null) {
                for (int i = 0; i < day.size(); i++) {
                    Exercise e = day.get(i);
                    display += e._numberOfSets + " sets of " + e._numberOfReps + " reps with " + e._weight + " lbs\n";

                }
            }
        }while(n.GetNextTask() != null);

        return display;
    }


}
