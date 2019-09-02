package com.example.android.custommusicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows lady gaga
        TextView ladyGaga = findViewById(R.id.lady_gaga);

        // Set a click listener on that View
        ladyGaga.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent ladyGagaIntent = new Intent(MainActivity.this, LadyGagaActivity.class);

                // Start the new activity
                startActivity(ladyGagaIntent);
            }
        });
    }
}
