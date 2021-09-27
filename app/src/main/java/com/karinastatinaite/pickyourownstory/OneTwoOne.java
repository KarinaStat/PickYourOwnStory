package com.karinastatinaite.pickyourownstory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class OneTwoOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end_screen);

        ImageView endImage = findViewById(R.id.end_screen_image_view);
        endImage.setImageResource(R.drawable.the_end);
        endImage.setImageResource(R.drawable.b_end);
        TextView ending = findViewById(R.id.end_screen_text_view);
        ending.setText("You take the thimble and move it to your lips.\n-Yes, I understand. Be well.\nSays the maiden, a tear forms near one of her eyes but she keeps smiling.\nYou pour the thimble`s contents into your mouth, it tastes like...\nThe brightest light you have ever seen sears your vision, blinding you.\n-Let`s go! I`ve got coffee.\nAround you is a modern office. The computer in front of you hums. You turn to the voice and see a man in a suit.\n-The board meeting is about to start, make sure you have sent the files to the investors.\n It seems your journey is at an end. You are safe. Life is normal, you chose wisely... didn`t you?");
        Button goBack = findViewById(R.id.end_screen_button_view);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goBackIntent = new Intent(OneTwoOne.this, MainActivity.class);
                startActivity(goBackIntent);
            }
        });

        }}