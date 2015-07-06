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


public class QuizActivity extends Activity  {

    // logging
    private final String TAG = "QuizActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        // inflate default quiz fragment
        quizFragment();

    }


    // default fragment layout
    public void quizFragment(){

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        QuizFragment quizFragment = new QuizFragment();
        ft.add(R.id.activity_quiz_fragment, quizFragment, "Quiz Default Fragment");
        ft.commit();
    }


}
