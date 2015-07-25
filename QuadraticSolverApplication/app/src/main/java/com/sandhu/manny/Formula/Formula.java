package com.sandhu.manny.Formula;

import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Manny S on 21/06/2015.
 */


// class holds quadratic formula
public class Formula {

    // Quadratic equation formula
    // Take in three variables as parameters
    public static double[] quadraticEquation(double a, double b, double c) 
    {

        // changed this and return type to a 1D double array due to 2 outputs
        double[] solution = {-999, -999};
        double d = Math.pow(b, 2) - 4 * a * c;

        if (d == 0) {
            solution[0] = -b / 2 * a;
            solution[1] = solution[0];
        } else if (d > 0) {
            solution[0] = (-b + Math.sqrt(d)) / (2 * a);
            solution[1] = (-b - Math.sqrt(d)) / (2 * a);
        }
        // output values in array solution
        return solution;
    }

    // output parsed value
    public static String OutputSolution(double[] x, int pos)
    {
        String s = Double.toString(x[pos]);
        return s;
    }


}


