package com.sandhu.manny.QuadraticQuiz.Quiz.Equation;

/**
 * Created by Manny S on 25/07/2015.
 */
public class Equation {

    public String a, b, c, operator1, operator2, root1, root2;

    // create equation
    Equation(String a, String b, String c, String operator1, String operator2, String root1, String root2){

        this.a = a;
        this.b = b;
        this.c = c;
        this.operator1 = operator1;
        this.operator2 = operator2;

        this.root1 = root1;
        this.root2 = root2;

    }

}


