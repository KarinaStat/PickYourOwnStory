package com.karinastatinaite.pickyourownstory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class OneOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end_screen);

        ImageView endImage = findViewById(R.id.end_screen_image_view);
        endImage.setImageResource(R.drawable.the_end);
        TextView ending = findViewById(R.id.end_screen_text_view);
        ending.setText("You pull several copper coins from your pocket and offer them to the figure in an outstretched hand. \n-Can you get me across?\nBone scrapes your palm as the coins are snatched away.\n-You are years early, but if you insist.\nYou have made an early departure for the underworld!");
        Button goBack = findViewById(R.id.end_screen_button_view);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goBackIntent = new Intent(OneOneActivity.this, MainActivity.class);
                startActivity(goBackIntent);
            }
        });

    }
}