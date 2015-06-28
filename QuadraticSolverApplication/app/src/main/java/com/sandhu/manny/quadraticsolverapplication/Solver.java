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

        parameters = new EditText[3];

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
        if(view.getId() == R.id.SolveEquationButton)
        {
            //Declare array for parameters
            double[] parameter_vals = new double[parameters.length];

            //For each parameter
            for(int i=0; i<parameter_vals.length; i++)
            {
                try
                {
                    //Get the text from the textfield and parse to double. 
                    parameter_vals[i] = Double.parseDouble(parameters[i].getText().toString());
                }
                catch(Exception e)
                {
                    Log.d(TAG, "Error text entered into field");
                    parameter_vals[i] = 0; 
                }
            }

            // compute solutions
            double[] sol = Formula.quadraticEquation(parameter_vals[0], parameter_vals[1], parameter_vals[2]);

            // output solutions
            solutions[0].setText(Formula.OutputSolution(sol, 0));
            solutions[1].setText(Formula.OutputSolution(sol, 1));
        }
    }
}



