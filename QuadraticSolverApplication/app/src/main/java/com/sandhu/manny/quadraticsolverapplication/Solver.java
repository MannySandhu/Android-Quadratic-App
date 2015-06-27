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


public class Solver extends Activity implements View.OnClickListener
{
    // logging
    private final String TAG = "SolverActivity";

    private EditText[] parameters;
    private TextView[] solutions; 

    private Button solveButton; 

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);

        Log.d(TAG, "Solver Activity called");

        setContentView(R.layout.activity_solver);

        parameters = new EditText[2];

        // wire up widgets to java variables
        parameters[0] = (EditText) findViewById(R.id.a_value);
        parameters[1] = (EditText) findViewById(R.id.b_value);
        parameters[2] = (EditText) findViewById(R.id.c_value);

        solutions = new TextView[2];
        
        // output final solutions
        solutions[0] = (TextView) findViewById(R.id.SolutionTextView);
        solutions[1] = (TextView) findViewById(R.id.SolutionTextView2);

        // solve button
        solveButton = (Button) findViewById(R.id.SolveEquationButton);
        solveButton.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if(view.getId == R.id.SolveEquationButton)
        {
             // take input from edit texts and parse
            double a = Double.parseDouble(aValue.getText().toString());
            double b = Double.parseDouble(bValue.getText().toString());
            double c = Double.parseDouble(cValue.getText().toString());

            double parameter_vals = new double[parameters.length];

            for(int i=0; i<parameter_vals.length; i++)
            {
                parameter_vals[i] = Double.parseDouble(parameters[i].getText().toString());
            }

            // compute solutions
            double[] sol = Formula.quadraticEquation(a, b, c);

            // output solutions
            solutions[0].setText(Formula.OutputSolution(sol, 0));
            solutions[1].setText(Formula.OutputSolution(sol, 1));
        }
    }
}



