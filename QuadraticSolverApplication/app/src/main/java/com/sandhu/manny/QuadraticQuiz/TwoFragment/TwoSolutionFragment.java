package com.sandhu.manny.QuadraticQuiz.TwoFragment;

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

import com.sandhu.manny.QuadraticQuiz.QuizFragment;
import com.sandhu.manny.quadraticsolverapplication.R;

/**
 * Created by Manny S on 29/06/2015.
 */
public class TwoSolutionFragment extends Fragment implements View.OnClickListener {

    // logging
    private final String TAG = "TwoSolutionFragment";

    // buttons
    private Button[] solutionOption = new Button[2];


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.two_solution_fragment, container, false);

        // get buttons
        solutionOption[0] = (Button) v.findViewById(R.id.BackButton);
        solutionOption[1] = (Button) v.findViewById(R.id.FragmentSolveButton);

        setListeners();

        return v;
    }

    void setListeners(){
        solutionOption[0].setOnClickListener(this);
        solutionOption[1].setOnClickListener(this);
    }


    public void onClick(View view) {

        //Depending on the button clicked..
        switch (view.getId()) {
            case R.id.BackButton:
                Log.d(TAG, "Back button pressed");
                quizFragment();

                break;

            case R.id.FragmentSolveButton:
                Log.d(TAG, "Fragment two solution solve button pressed");


                break;

        }
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
