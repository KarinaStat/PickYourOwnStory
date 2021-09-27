package com.karinastatinaite.pickyourownstory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class OneThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end_screen);

        ImageView endImage = findViewById(R.id.end_screen_image_view);
        endImage.setImageResource(R.drawable.the_end);
        TextView ending = findViewById(R.id.end_screen_text_view);
        ending.setText("You are a strong swimmer, and the river is narrow. You dive into the water and immediately the pain begins.\nPiranhas??! Here?!.. But how?\nYour last thought is confused wonder that a chance encounter with Amazonian fish would be your demise.");
        Button goBack = findViewById(R.id.end_screen_button_view);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goBackIntent = new Intent(OneThree.this, MainActivity.class);
                startActivity(goBackIntent);
            }
        });

    }}