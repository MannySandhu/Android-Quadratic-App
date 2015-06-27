package com.sandhu.manny.quadraticsolverapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import static com.sandhu.manny.quadraticsolverapplication.R.id.quadraticQuizButton;
import static com.sandhu.manny.quadraticsolverapplication.R.id.quadraticSolverButton;
import static com.sandhu.manny.quadraticsolverapplication.R.id.quadraticTutorialButton;

// home screen activity
public class Home extends Activity {

    // logging
    private static final String TAG = "HomeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Home Activity called");
        setContentView(R.layout.activity_home);


        // wire up widgets to java variables
        Button solverButton = (Button)findViewById(quadraticSolverButton);
        Button tutorialButton = (Button)findViewById(quadraticTutorialButton);
        Button quizButton = (Button)findViewById(quadraticQuizButton);

        // solver button listener
        solverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // start a new activity -- go to solver activity
                startActivity(new Intent(Home.this, Solver.class));
            }
        });

        // tutorial button listener
        tutorialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        // quiz button listener
        quizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

}
