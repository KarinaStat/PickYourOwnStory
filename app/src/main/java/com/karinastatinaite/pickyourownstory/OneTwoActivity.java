package com.karinastatinaite.pickyourownstory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class OneTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two_choices_layout);

        TextView story = findViewById(R.id.two_choices_text_view);
        story.setText("Maybe there is a bridge downstream? After several minutes of walking, you find a river bend where a stout log has been laid across the waterway. You cross it but slip on the last step, falling head first onto the far embankment. Everything goes dark. When you come to, you see a crowned maiden kneeling beside you. She smiles.\n -You are fully awake!\nHer laughter is like falling water. She holds forth a pewter thimble, upturned to hold an amber liquid.\n-This will set everything alright.\nShe glances shyly away.\n-Or you can stay here with me.");
        CardView firstChoice = findViewById(R.id.first_choice_card_view);
        firstChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oneTwoOneActivityIntent = new Intent (OneTwoActivity.this, OneTwoOne.class);
                startActivity(oneTwoOneActivityIntent);
            }
        });
        CardView secondChoice = findViewById(R.id.second_choice_card_view);
        secondChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oneTwoTwoActivityIntent = new Intent (OneTwoActivity.this, OneTwoTwoActivity.class);
                startActivity(oneTwoTwoActivityIntent);
            }
        });
        ImageView first = findViewById(R.id.first_choice_image_view);
        first.setImageResource(R.drawable.drink);
        ImageView second = findViewById(R.id.second_choice_image_view);
        second.setImageResource(R.drawable.refuse);
        TextView firstChoiceText = findViewById(R.id.first_choice_text_view);
        firstChoiceText.setText("              Drink");
        TextView secondChoiceText = findViewById(R.id.second_choice_text_view);
        secondChoiceText.setText(" Refuse the drink");
    }
    }
