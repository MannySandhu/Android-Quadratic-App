package com.sandhu.manny.quadraticsolverapplication;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class QuizActivity extends Activity implements View.OnClickListener {

    // logging
    private final String TAG = "QuizActivity";

    // default fragment buttons
    private Button noSolution;
    private Button oneSolution;
    private Button twoSolution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        // inflate default quiz fragment
        quizFragment();


    }



    // set up listeners for default quiz fragment
    private void setListeners(){
        noSolution.setOnClickListener(this);
        oneSolution.setOnClickListener(this);
        twoSolution.setOnClickListener(this);
    }


    // actions performed on click
    public void onClick(View view){

        //Depending on the button clicked..
        switch(view.getId())
        {
            case R.id.NoSolutionButton:
                Log.d(TAG, "No solution button pressed");
                // no solution action

                break;

            case R.id.OneSolutionButton:
                Log.d(TAG, "One solution button pressed");
                // inflate one solution fragment

                break;

            case R.id.TwoSolutionButton:
                Log.d(TAG, "Two solution button pressed");
                // inflate two solution fragment
                twoSolutionFragment();

                break;
        }

    }


    // create fragments

    // default fragment layout
    public void quizFragment(){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        QuizFragment quizFragment = new QuizFragment();

        ft.add(R.id.activity_quiz_fragment, quizFragment, "Quiz Default Fragment");
        ft.commit();

        // initialise variables on create for default fragment
        noSolution = (Button)findViewById(R.id.NoSolutionButton);
        oneSolution = (Button)findViewById(R.id.OneSolutionButton);
        twoSolution = (Button)findViewById(R.id.TwoSolutionButton);

    }

    // inflate fragment layout for one solution
    public void oneSolution(){

    }

    // inflate fragment layout for two solutions
    public void twoSolutionFragment(){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        QuizFragment quizFragment = new QuizFragment();

        ft.add(R.id.activity_quiz_fragment, quizFragment, "Quiz Two Solution Fragment");
        ft.commit();
    }

}
