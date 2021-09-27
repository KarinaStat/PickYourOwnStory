package com.karinastatinaite.pickyourownstory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();

    }

    private void findViews() {
        TextView story = findViewById(R.id.three_choices_text_view);
        story.setText("You find yourself in a dark wood. An earthen path diverges before you. \nDo you:");
        CardView goLeftCard = findViewById(R.id.first_choice_card_view);
        goLeftCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oneActivityIntent = new Intent(MainActivity.this, OneActivity.class);
                startActivity(oneActivityIntent);
            }
        });
        CardView stayCard = findViewById(R.id.second_choice_card_view);
        stayCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent threeActivityIntent = new Intent(MainActivity.this, ThreeActivity.class);
                startActivity(threeActivityIntent);
            }
        });
        CardView goRightCard = findViewById(R.id.third_choice_card_view);
        goRightCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent twoActivityIntent = new Intent(MainActivity.this, TwoActivity.class);
                startActivity(twoActivityIntent);
            }
        });
        ImageView left = findViewById(R.id.first_choice_image_view);
        left.setImageResource(R.drawable.go_left_image);
        ImageView right = findViewById(R.id.third_choice_image_view);
        right.setImageResource(R.drawable.go_right);
        ImageView staying = findViewById(R.id.second_choice_image_view);
        staying.setImageResource(R.drawable.stay_here1);
        TextView goLeft = findViewById(R.id.first_choice_text_view);
        goLeft.setText("   Take the left fork");
        TextView stayHere = findViewById(R.id.second_choice_text_view);
        stayHere.setText("Stand still and examine your surrounds");
        TextView goRight = findViewById(R.id.third_choice_text_view);
        goRight.setText("Take the right fork");

    }


}