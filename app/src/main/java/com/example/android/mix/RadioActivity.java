package com.example.android.mix;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Lani on 7/12/2016.
 */
public class RadioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        setBottomMenu();
    }
    /**
     * Method to listen to Bottom Menu Clicks
     */
    public void setBottomMenu() {
        ImageView play = (ImageView) findViewById(R.id.min_play);

        // Set a click listener on that Layout
        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayActivity}
                Intent playIntent = new Intent(RadioActivity.this, PlayActivity.class);

                // Start the new activity
                startActivity(playIntent);
            }
        });

        // Find the Layout that shows the Mix category
        ImageView mixup = (ImageView) findViewById(R.id.min_mix);

        // Set a click listener on that View
        mixup.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Mix category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MixActivity}
                Intent mixIntent = new Intent(RadioActivity.this, MixActivity.class);

                // Start the new activity
                startActivity(mixIntent);
            }
        });

        // Find the Layout that shows the radio category
        ImageView radio = (ImageView) findViewById(R.id.min_radio);

        // Set a click listener on that View
        radio.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the radio category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RadioActivity}
                Intent radioIntent = new Intent(RadioActivity.this, RadioActivity.class);

                // Start the new activity
                startActivity(radioIntent);
            }
        });

        // Find the Layout that shows the smash category
        ImageView smash = (ImageView) findViewById(R.id.min_smash);

        // Set a click listener on that View
        smash.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the smash category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SmashActivity}
                Intent smashIntent = new Intent(RadioActivity.this, SmashActivity.class);

                // Start the new activity
                startActivity(smashIntent);
            }
        });
    }
}
