package com.example.android.custommusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

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

        // Find the View that shows foo fighters
        TextView foofighters = findViewById(R.id.foo_fighters);

        // Set a click listener on that View
        foofighters.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent fooFightersIntent = new Intent(MainActivity.this, FooFightersActivity.class);

                // Start the new activity
                startActivity(fooFightersIntent);
            }
        });

        // Find the View that shows lana del rey
        TextView lanaDelRey = findViewById(R.id.lana_del_rey);

        // Set a click listener on that View
        lanaDelRey.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick (View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent lanaDelReyIntent = new Intent(MainActivity.this, LanaDelReyActivity.class);

                // Start the new activity
                startActivity(lanaDelReyIntent);
            }
        });
    }
}

