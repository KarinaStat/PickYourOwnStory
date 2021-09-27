package com.karinastatinaite.pickyourownstory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class OneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three_choices_layout);
            TextView story = findViewById(R.id.three_choices_text_view);
            story.setText("You walk for a time through a wild wood. You can hear the cry of wolves, and ravens; as well as noises you cannot so easily identify. Suddenly the path dead ends at a river. The current is swift and it looks cold. A cloaked figure stands near a small barge. \nDo you?");
            CardView firstChoice = findViewById(R.id.first_choice_card_view);
            firstChoice.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent oneOneActivityIntent = new Intent(OneActivity.this, OneOneActivity.class);
                    startActivity(oneOneActivityIntent);
                }
            });
            CardView secondChoice = findViewById(R.id.second_choice_card_view);
            secondChoice.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent oneTwoActivityIntent = new Intent (OneActivity.this, OneTwoActivity.class);
                    startActivity(oneTwoActivityIntent);
                }
            });
            CardView thirdChoice= findViewById(R.id.third_choice_card_view);
            thirdChoice.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent oneThreeActivityIntent = new Intent(OneActivity.this, OneThree.class);
                    startActivity(oneThreeActivityIntent);
                }
            });
            ImageView first = findViewById(R.id.first_choice_image_view);
            first.setImageResource(R.drawable.coins);
            ImageView second = findViewById(R.id.third_choice_image_view);
            second.setImageResource(R.drawable.swim);
            ImageView third = findViewById(R.id.second_choice_image_view);
            third.setImageResource(R.drawable.find_a_different_way);
            TextView firstText = findViewById(R.id.first_choice_text_view);
            firstText.setText("Offer the money in your pocket for a ride across");
            TextView secondText = findViewById(R.id.second_choice_text_view);
            secondText.setText("Look for another way across");
            TextView thirdText = findViewById(R.id.third_choice_text_view);
            thirdText.setText("Try to swim the river");
    }}

