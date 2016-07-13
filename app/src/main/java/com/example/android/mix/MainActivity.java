package com.example.android.mix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the Layout that shows the play category
        LinearLayout play = (LinearLayout) findViewById(R.id.mix_play);

        // Set a click listener on that Layout
        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayActivity}
                Intent playIntent = new Intent(MainActivity.this, PlayActivity.class);

                // Start the new activity
                startActivity(playIntent);
            }
        });

        // Find the Layout that shows the Mix category
        LinearLayout mixup = (LinearLayout) findViewById(R.id.mix_mix);

        // Set a click listener on that View
        mixup.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Mix category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MixActivity}
                Intent mixIntent = new Intent(MainActivity.this, MixActivity.class);

                // Start the new activity
                startActivity(mixIntent);
            }
        });

        // Find the Layout that shows the radio category
        LinearLayout radio = (LinearLayout) findViewById(R.id.mix_radio);

        // Set a click listener on that View
        radio.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the radio category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RadioActivity}
                Intent radioIntent = new Intent(MainActivity.this, RadioActivity.class);

                // Start the new activity
                startActivity(radioIntent);
            }
        });

        // Find the Layout that shows the smash category
        LinearLayout smash = (LinearLayout) findViewById(R.id.mix_smash);

        // Set a click listener on that View
        smash.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the smash category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SmashActivity}
                Intent smashIntent = new Intent(MainActivity.this, SmashActivity.class);

                // Start the new activity
                startActivity(smashIntent);
            }
        });
    }
}

