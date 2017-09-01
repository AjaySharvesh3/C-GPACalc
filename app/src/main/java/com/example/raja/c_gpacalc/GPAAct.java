package com.example.raja.c_gpacalc;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.raja.c_gpacalc.R.id.cgpaact;
import static com.example.raja.c_gpacalc.R.id.civil;

public class GPAAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa);

        TextView textView2 = (TextView) findViewById(R.id.departments);
        textView2.setPaintFlags(textView2.getPaintFlags()|Paint.UNDERLINE_TEXT_FLAG);

        Button civilAct = (Button) findViewById(civil);

        // Set a click listener on that View
        civilAct.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent civil1 = new Intent(GPAAct.this, Civil.class);

                // Start the new activity
                startActivity(civil1);
            }
        });
    }
}
