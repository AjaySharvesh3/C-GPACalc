package com.example.raja.c_gpacalc;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.raja.c_gpacalc.R.id.civil;
import static com.example.raja.c_gpacalc.R.id.civsem1;

public class Civil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil);

        Button civilSem1 = (Button) findViewById(civsem1);

        // Set a click listener on that View
        civilSem1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent civilsemester = new Intent(Civil.this, CivSem1.class);

                // Start the new activity
                startActivity(civilsemester);
            }
        });
    }
}
