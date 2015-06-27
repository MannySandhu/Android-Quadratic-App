package com.sandhu.manny.quadraticsolverapplication;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Solver extends Activity {

    // logging
    private static final String TAG = "SolverActivity";

    // hold solutions
    double sol[] = new double[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Solver Activity called");
        setContentView(R.layout.activity_solver);

        // wire up widgets to java variables
        final EditText aValue = (EditText) findViewById(R.id.a_value);
        final EditText bValue = (EditText) findViewById(R.id.b_value);
        final EditText cValue = (EditText) findViewById(R.id.c_value);

        // output final solutions
        final TextView sValue = (TextView) findViewById(R.id.SolutionTextView);
        final TextView sValue2 = (TextView) findViewById(R.id.SolutionTextView2);

        // solve button
        Button solveButton = (Button) findViewById(R.id.SolveEquationButton);


        // assign listener to solveButton
        solveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // take input from edit texts and parse
                double a = Double.parseDouble(aValue.getText().toString());
                double b = Double.parseDouble(bValue.getText().toString());
                double c = Double.parseDouble(cValue.getText().toString());

                // compute solutions
                sol = Formula.quadraticEquation(a, b, c);

                // output solutions
                sValue.setText(Formula.OutputSolution(sol, 0));
                sValue2.setText(Formula.OutputSolution(sol, 1));


            }
        });

    }

}



