package com.example.sean.fitnessapp;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.CheckBox;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by seanleighton on 1/10/18.
 */

public class ExerciseArrayAdapter extends ArrayAdapter<Exercise> {

    private Exercise[] _data;
    private ArrayList<Exercise> _data2;
    private Context _context;


    public ExerciseArrayAdapter(Context context, Exercise[] values){
        super(context, -1, values);

        _context = context;
        _data = values;


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parentView){
        super.getView(position,convertView,parentView);


        LayoutInflater inflater = (LayoutInflater)_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.view_workout, parentView, false);

        ListView lv = (ListView)rowView.findViewById(R.id.lvDayExercise);

        Exercise e = _data[position];




        return rowView;
    }

}