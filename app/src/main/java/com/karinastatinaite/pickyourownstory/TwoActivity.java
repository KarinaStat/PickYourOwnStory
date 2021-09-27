package com.karinastatinaite.pickyourownstory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two_choices_layout);

        TextView story = findViewById(R.id.two_choices_text_view);
        story.setText("The path narrows as you walk, the trees closing in, the birds growing quieter... when did it get so cold?\nDo you:");
        CardView firstChoice = findViewById(R.id.first_choice_card_view);
        firstChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent twoOneActivityIntent = new Intent (TwoActivity.this, TwoOne.class);
                startActivity(twoOneActivityIntent);
            }
        });
        CardView secondChoice = findViewById(R.id.second_choice_card_view);
        secondChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent twoTwoActivityIntent = new Intent (TwoActivity.this, TwoTwoActivity.class);
                startActivity(twoTwoActivityIntent);
            }
        });
        ImageView first = findViewById(R.id.first_choice_image_view);
        first.setImageResource(R.drawable.stay_here1);
        ImageView second = findViewById(R.id.second_choice_image_view);
        second.setImageResource(R.drawable.keep_going);
        TextView firstChoiceHere = findViewById(R.id.first_choice_text_view);
        firstChoiceHere.setText("         Turn back");
        TextView secondChoiceHere = findViewById(R.id.second_choice_text_view);
        secondChoiceHere.setText("Keep going forward");

    }
}