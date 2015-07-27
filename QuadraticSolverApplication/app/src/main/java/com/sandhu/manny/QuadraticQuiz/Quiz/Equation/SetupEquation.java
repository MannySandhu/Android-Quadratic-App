package com.sandhu.manny.QuadraticQuiz.Quiz.Equation;

import android.app.Activity;
import android.widget.TextView;

import com.sandhu.manny.QuadraticQuiz.Quiz.Equation.Equation;
import com.sandhu.manny.quadraticsolverapplication.R;

/**
 * Created by Manny S on 25/07/2015.
 */
public class SetupEquation extends Activity {

    public TextView[] equationContents = new TextView[5];

    public SetupEquation(){

        equationContents[0] = (TextView)findViewById(R.id.A);
        equationContents[1] = (TextView)findViewById(R.id.FirstOperation);
        equationContents[2] = (TextView)findViewById(R.id.B);
        equationContents[3] = (TextView)findViewById(R.id.SecondOperation);
        equationContents[4] = (TextView)findViewById(R.id.C);

        setEquation(e1);
    }



    public void setEquation(Equation e){
        equationContents[0].setText(e.a);
        equationContents[1].setText(e.operator1);
        equationContents[2].setText(e.b);
        equationContents[3].setText(e.operator2);
        equationContents[4].setText(e.c);


    }


    // equations
    public Equation e1 = new Equation("1", "4", "4", "+", "+", "-2.0", "-2.0");


}

