package com.example.android.mix;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        //Display List of Music Files on Users Device
        displayMusic();

        //Display Bottom Menu
        setBottomMenu();
    }
    public void setBottomMenu() {
        ImageView play = (ImageView) findViewById(R.id.min_play);

        // Set a click listener on that Layout
        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayActivity}
                Intent playIntent = new Intent(PlayActivity.this, PlayActivity.class);

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
                Intent mixIntent = new Intent(PlayActivity.this, MixActivity.class);

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
                Intent radioIntent = new Intent(PlayActivity.this, RadioActivity.class);

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
                Intent smashIntent = new Intent(PlayActivity.this, SmashActivity.class);

                // Start the new activity
                startActivity(smashIntent);
            }
        });
    }

    /**
     * Psuedo Code to display music from users device
     */
    public void displayMusic() {
        //Get the table id
        TableLayout myTable = (TableLayout) findViewById(R.id.song_list_table);

        // Table Headers
        TableRow tbrow0 = new TableRow(this);
        TextView tv0 = new TextView(this);
        tv0.setText(R.string.table_song_name);
        tv0.setTypeface(null, Typeface.BOLD);
        tv0.setPadding(16, 16, 16, 16);
        tbrow0.addView(tv0);
        TextView tv1 = new TextView(this);
        tv1.setText(R.string.table_song_artist);
        tv1.setTypeface(null, Typeface.BOLD);
        tv1.setPadding(16, 16, 16, 16);
        tbrow0.addView(tv1);
        TextView tv2 = new TextView(this);
        tv2.setText(R.string.table_song_play);
        tv2.setTypeface(null, Typeface.BOLD);
        tv2.setPadding(16, 16, 16, 16);
        tv2.setGravity(Gravity.RIGHT);
        tbrow0.addView(tv2);
        myTable.addView(tbrow0);
        //display temporary layout for list
        for (int i = 0; i < 10; i++) {
            TableRow tbrow = new TableRow(this);
            TextView t1v = new TextView(this);
            t1v.setText(R.string.default_song);
            t1v.setPadding(16, 16, 16, 16);
            tbrow.addView(t1v);
            TextView t2v = new TextView(this);
            t2v.setText(R.string.default_artist);
            t2v.setPadding(16, 16, 16, 16);
            tbrow.addView(t2v);
            ImageView t3v = new ImageView(this);
            t3v.setImageResource(R.drawable.play_too);
            t3v.setMaxHeight(14);
            tbrow.addView(t3v);
            myTable.addView(tbrow);
        }
    }
}
