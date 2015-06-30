package com.sandhu.manny.quadraticsolverapplication;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.sandhu.manny.quadraticsolverapplication.R;

/**
 * Created by Manny S on 29/06/2015.
 */
public class QuizFragment extends Fragment implements View.OnClickListener {

    // logging
    private final String TAG = "QuizDefaultFragment";

    // array holds fragment buttons
    private Button [] solutionOptions = new Button[3];

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.quiz_fragment_layout, container, false);

        solutionOptions[0] = (Button)v.findViewById(R.id.NoSolutionButton);
        solutionOptions[1] = (Button)v.findViewById(R.id.OneSolutionButton);
        solutionOptions[2] = (Button)v.findViewById(R.id.TwoSolutionButton);

        setListeners(); //- this causes problems

        return v;
    }


    // set up listeners for default quiz fragment
    private void setListeners(){
        solutionOptions[0].setOnClickListener(this);
        solutionOptions[1].setOnClickListener(this);
        solutionOptions[2].setOnClickListener(this);
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


                break;
        }

    }




}
