package com.sandhu.manny.QuadraticQuiz;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.sandhu.manny.QuadraticQuiz.TwoFragment.TwoSolutionFragment;
import com.sandhu.manny.quadraticsolverapplication.R;

/**
 * Created by Manny S on 29/06/2015.
 */
public class QuizFragment extends Fragment implements View.OnClickListener {

    // logging
    private final String TAG = "QuizDefaultFragment";

    // array holds fragment buttons
    private Button [] solutionOptions = new Button[4];

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.quiz_fragment_layout, container, false);

        solutionOptions[0] = (Button)v.findViewById(R.id.NoSolutionButton);
        solutionOptions[1] = (Button)v.findViewById(R.id.OneSolutionButton);
        solutionOptions[2] = (Button)v.findViewById(R.id.TwoSolutionButton);
        solutionOptions[3] = (Button)v.findViewById(R.id.NextEquationButton);

        setListeners(); //- this causes problems

        return v;
    }


    // set up listeners for default quiz fragment
    private void setListeners(){
        solutionOptions[0].setOnClickListener(this);
        solutionOptions[1].setOnClickListener(this);
        solutionOptions[2].setOnClickListener(this);
        solutionOptions[3].setOnClickListener(this);
    }


    // inflate fragment layout for one solution
    public void oneSolutionFragment(){

    }

    // inflate fragment layout for two solutions
    public void twoSolutionFragment(){

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        TwoSolutionFragment quizFragment = new TwoSolutionFragment();
        ft.add(R.id.activity_quiz_fragment, quizFragment, "Quiz Two Solution Fragment");
        ft.commit();
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
                oneSolutionFragment();

                break;

            case R.id.TwoSolutionButton:
                Log.d(TAG, "Two solution button pressed");
                // inflate two solution fragment
                twoSolutionFragment();

                break;

            case R.id.NextEquationButton:
                Log.d(TAG, "Next Equation button pressed");
                // set next equation on root view

                break;
        }

    }




}
