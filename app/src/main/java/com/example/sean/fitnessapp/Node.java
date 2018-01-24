package com.example.sean.fitnessapp;

/**
 * Created by seanleighton on 10/6/17.
 */

public class Node<T> {

    private T _task;

    private Node<T> nextTask;
    private Node<T> previousTask;


    public Node(){

    }

    public Node(T tsk){
        _task = tsk;
    }


    public void AddNextTask(T task){
        nextTask = new Node<>(task);
        nextTask.SetPreviousTask(this);
    }

    public void SetPreviousTask(Node<T> tsk){
        previousTask = tsk;
    }

    public void AssignTask(T tsk){ _task = tsk; }

    public Node<T> GetNextTask(){ return nextTask; }
    public Node<T> GetPreviousTask(){ return previousTask; }
    public T GetTask(){ return _task; }

    public String Print(){ return ""; }

}
