package com.sandhu.manny.QuadraticQuiz.Quiz;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import com.sandhu.manny.QuadraticQuiz.Quiz.Equation.SetupEquation;
import com.sandhu.manny.quadraticsolverapplication.R;


public class QuizActivity extends Activity {

    // logging
    private final String TAG = "QuizActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        // inflate default quiz fragment
        quizFragment();
        SetupEquation equation = new SetupEquation();

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
