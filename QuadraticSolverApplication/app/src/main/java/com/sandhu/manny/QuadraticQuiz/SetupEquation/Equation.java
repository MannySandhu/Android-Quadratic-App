package com.sandhu.manny.QuadraticQuiz.SetupEquation;

import java.util.ArrayList;

/**
 * Created by Manny S on 25/07/2015.
 */
public class Equation extends SetupEquation {

    private String equation, root1, root2;

    Equation(String equation, String root1, String root2){

        this.equation = equation;
        this.root1 = root1;
        this.root2 = root2;

    }

    @Override
    public void get(Equation id){

    }

    @Override
    public void set(){

    }



    private class EquationBank {

        Equation e1 = new Equation
                ("1x^2 + 4x + 4 = 0", "-2.0", "-2.0");


    }


}


