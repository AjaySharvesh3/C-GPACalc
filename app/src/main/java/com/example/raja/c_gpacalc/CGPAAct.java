package com.example.raja.c_gpacalc;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CGPAAct extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa);

        TextView textView = (TextView) findViewById(R.id.gpamarks);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        TextView textView1 = (TextView) findViewById(R.id.sem);
        textView1.setPaintFlags(textView1.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);


    }
    public void onButtonClick(View v){
        EditText e1 = (EditText) findViewById(R.id.sem1num);
        EditText e2 = (EditText) findViewById(R.id.sem2num);
        EditText e3 = (EditText) findViewById(R.id.sem3num);
        EditText e4 = (EditText) findViewById(R.id.sem4num);
        EditText e5 = (EditText) findViewById(R.id.sem5num);
        EditText e6 = (EditText) findViewById(R.id.sem6num);
        EditText e7 = (EditText) findViewById(R.id.sem7num);
        EditText e8 = (EditText) findViewById(R.id.sem8num);
        TextView t1 = (TextView) findViewById(R.id.result);
        double num1 = Double.parseDouble(e1.getText().toString());
        double num2 = Double.parseDouble(e2.getText().toString());
        double num3 = Double.parseDouble(e3.getText().toString());
        double num4 = Double.parseDouble(e4.getText().toString());
        double num5 = Double.parseDouble(e5.getText().toString());
        double num6 = Double.parseDouble(e6.getText().toString());
        double num7 = Double.parseDouble(e7.getText().toString());
        double num8 = Double.parseDouble(e8.getText().toString());

        double ave = (num1+num2+num3+num4+num5+num6+num7+num8)/8;
        t1.setText(Double.toString(ave));

    }
}
