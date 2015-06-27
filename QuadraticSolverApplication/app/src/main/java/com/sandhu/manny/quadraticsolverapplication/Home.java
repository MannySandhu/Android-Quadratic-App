package com.sandhu.manny.quadraticsolverapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

// home screen activity
public class Home extends Activity implements View.OnClickListener {

    // logging
    private final String TAG = "HomeActivity";
    //Buttons
    private Button solverButton;
    private Button tutorialButton;
    private Button quizButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Home Activity called");
        setContentView(R.layout.activity_home);

        // Link object variables to view ids.
        solverButton = (Button)findViewById(quadraticSolverButton);
        tutorialButton = (Button)findViewById(quadraticTutorialButton);
        quizButton = (Button)findViewById(quadraticQuizButton);

        setListeners();
    }

    //Set onclick listeners for each button.
    public void setListeners()
    {
        solverButton.setOnClickListener(this);
        tutorialButton.setOnClickListener(this);
        quizButton.setOnClickListener(this);
    }

    //Reaction to clicks on screen.
    public void onClick(View view)
    {
        //Depending on the button clicked..
        switch(view.getId())
        {
            case R.id.quadraticQuizButton:
                Log.d(TAG, "Quadratic Quiz button pressed");
                //Start quiz activity
                break;
            case R.id.quadraticSolverButton:
                Log.d(TAG, "Quadratic Solver button pressed");
                // Start Solver activity
                startActivity(new Intent(Home.this, Solver.class));
                break;
            case R.id.quadraticTutorialButton:
                Log.d(TAG, "Quadratic Tutorial button pressed");
                //Start tutorial activity
                break;
        }

    }

}
