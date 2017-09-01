package com.example.raja.c_gpacalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.raja.c_gpacalc.R.id.cgpaact;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gpaact = (Button) findViewById(R.id.gpaact);

        // Set a click listener on that View
        gpaact.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent gpa = new Intent(MainActivity.this, GPAAct.class);

                // Start the new activity
                startActivity(gpa);
            }
        });

        Button cgpa = (Button) findViewById(cgpaact);

        // Set a click listener on that View
        cgpa.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent cgpa1 = new Intent(MainActivity.this, CGPAAct.class);

                // Start the new activity
                startActivity(cgpa1);
            }
        });
    }
}
