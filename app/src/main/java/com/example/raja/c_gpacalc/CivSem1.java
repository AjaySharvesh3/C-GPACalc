package com.example.raja.c_gpacalc;

import android.graphics.Paint;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CivSem1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civ_sem1);

        TextView textView3 = (TextView) findViewById(R.id.Code);
        textView3.setPaintFlags(textView3.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        TextView textView4 = (TextView) findViewById(R.id.title);
        textView4.setPaintFlags(textView4.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        TextView textView5 = (TextView) findViewById(R.id.credits);
        textView5.setPaintFlags(textView5.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        TextView textView6 = (TextView) findViewById(R.id.grades);
        textView6.setPaintFlags(textView6.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        EditText e1 = (EditText) findViewById(R.id.g1);
        EditText e2 = (EditText) findViewById(R.id.g2);
        EditText e3 = (EditText) findViewById(R.id.g3);
        EditText e4 = (EditText) findViewById(R.id.g4);
        EditText e5 = (EditText) findViewById(R.id.g5);
        EditText e6 = (EditText) findViewById(R.id.g6);
        EditText e7 = (EditText) findViewById(R.id.g7);
        EditText e8 = (EditText) findViewById(R.id.g8);
        EditText e9 = (EditText) findViewById(R.id.g9);
        TextView tv = (TextView) findViewById(R.id.ResultSem1);
        double credit1 = 4;
        double credit2 = 4;
        double credit3 = 3;
        double credit4 = 3;
        double credit5 = 3;
        double credit6 = 4;
        double credit7 = 2;
        double credit8 = 2;
        double credit9 = 1;


        double totalCredits = credit1+credit2+credit3+credit4+credit5+credit6+credit7+credit8+credit9;

        double number1=0;
        if(R.id.g1 == 'S'){
            number1 = 10;
        } else if (R.id.g1 == 'A') {
            number1 = 9;
        } else if (R.id.g1 == 'B') {
            number1 = 8;
        } else if (R.id.g1 == 'C') {
            number1 = 7;
        } else if (R.id.g1 == 'D') {
             number1 = 6;
        } else if (R.id.g1 == 'E') {
            number1 = 5;
        } else if (R.id.g1 == 'U') {
            number1 = 0;
        }

        double num1 = number1 * credit1;

        double number2=0;
        if(R.id.g2 == 'S'){
            number2 = 10;
        } else if (R.id.g2 == 'A') {
            number2 = 9;
        } else if (R.id.g2 == 'B') {
            number2 = 8;
        } else if (R.id.g2 == 'C') {
            number2 = 7;
        } else if (R.id.g2 == 'D') {
            number2 = 6;
        } else if (R.id.g2 == 'E') {
            number2 = 5;
        } else if (R.id.g2 == 'U') {
            number2 = 0;
        }

        double num2 = number2 * credit2;

        double number3=0;
        if(R.id.g3 == 'S'){
            number3 = 10;
        } else if (R.id.g3 == 'A') {
            number3 = 9;
        } else if (R.id.g3 == 'B') {
            number3 = 8;
        } else if (R.id.g3 == 'C') {
            number3 = 7;
        } else if (R.id.g3 == 'D') {
            number3 = 6;
        } else if (R.id.g3 == 'E') {
            number3 = 5;
        } else if (R.id.g3 == 'U') {
            number3 = 0;
        }

        double num3 = number3 * credit3;

        double number4=0;
        if(R.id.g4 == 'S'){
            number4 = 10;
        } else if (R.id.g4 == 'A') {
            number4 = 9;
        } else if (R.id.g4 == 'B') {
            number4 = 8;
        } else if (R.id.g4 == 'C') {
            number4 = 7;
        } else if (R.id.g4 == 'D') {
            number4 = 6;
        } else if (R.id.g4 == 'E') {
            number4 = 5;
        } else if (R.id.g4 == 'U') {
            number4 = 0;
        }

        double num4 = number4 * credit4;

        double number5=0;
        if(R.id.g5 == 'S'){
            number5 = 10;
        } else if (R.id.g5 == 'A') {
            number5 = 9;
        } else if (R.id.g5 == 'B') {
            number5 = 8;
        } else if (R.id.g5 == 'C') {
            number5 = 7;
        } else if (R.id.g5 == 'D') {
            number5 = 6;
        } else if (R.id.g5 == 'E') {
            number5 = 5;
        } else if (R.id.g5 == 'U') {
            number5 = 0;
        }

        double num5 = number5 * credit5;

        double number6=0;
        if(R.id.g6 == 'S'){
            number6 = 10;
        } else if (R.id.g6 == 'A') {
            number6 = 9;
        } else if (R.id.g6 == 'B') {
            number6 = 8;
        } else if (R.id.g6 == 'C') {
            number6 = 7;
        } else if (R.id.g6 == 'D') {
            number6 = 6;
        } else if (R.id.g6 == 'E') {
            number6 = 5;
        } else if (R.id.g6 == 'U') {
            number6 = 0;
        }

        double num6 = number6 * credit6;

        double number7=0;
        if(R.id.g7 == 'S'){
            number7 = 10;
        } else if (R.id.g7 == 'A') {
            number7 = 9;
        } else if (R.id.g7 == 'B') {
            number7 = 8;
        } else if (R.id.g7 == 'C') {
            number7 = 7;
        } else if (R.id.g7 == 'D') {
            number7 = 6;
        } else if (R.id.g7 == 'E') {
            number7 = 5;
        } else if (R.id.g7 == 'U') {
            number7 = 0;
        }

        double  num7 = number7 * credit7;

        double number8=0;
        if(R.id.g8 == 'S'){
            number8 = 10;
        } else if (R.id.g1 == 'A') {
            number8 = 9;
        } else if (R.id.g8 == 'B') {
            number8 = 8;
        } else if (R.id.g8 == 'C') {
            number8 = 7;
        } else if (R.id.g8 == 'D') {
            number8 = 6;
        } else if (R.id.g8 == 'E') {
            number8 = 5;
        } else if (R.id.g8 == 'U') {
            number8 = 0;
        }

        double num8 = number8 * credit8;

        double number9=0;
        if(R.id.g9 == 'S'){
            number9 = 10;
        } else if (R.id.g9 == 'A') {
            number9 = 9;
        } else if (R.id.g9 == 'B') {
            number9 = 8;
        } else if (R.id.g9 == 'C') {
            number9 = 7;
        } else if (R.id.g9 == 'D') {
            number9 = 6;
        } else if (R.id.g9 == 'E') {
            number9 = 5;
        } else if (R.id.g9 == 'U') {
            number9 = 0;
        }

        double num9 = number9 * credit9;

        double gpaResult = (num1+num2+num3+num4+num5+num6+num7+num8+num9) / totalCredits;

        tv.getText(Double2.toString(gpaResult));
    }

}