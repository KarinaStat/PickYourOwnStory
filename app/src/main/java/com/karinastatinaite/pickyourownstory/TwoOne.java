package com.karinastatinaite.pickyourownstory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TwoOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end_screen);

        ImageView endImage = findViewById(R.id.end_screen_image_view);
        endImage.setImageResource(R.drawable.the_end);
        TextView ending = findViewById(R.id.end_screen_text_view);
        ending.setText("As you retreat, you catch movement out of the corner of your eye. An animal?! The path back looks different than before somehow. Surely this clearing was not here before. And then... Out of the shadows, you see IT... no... OH NO! Your screams are mercifully brief.");
        Button goBack = findViewById(R.id.end_screen_button_view);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goBackIntent = new Intent(TwoOne.this, MainActivity.class);
                startActivity(goBackIntent);
            }
        });

    }}