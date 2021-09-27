package com.karinastatinaite.pickyourownstory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end_screen);

        ImageView endImage = findViewById(R.id.end_screen_image_view);
        endImage.setImageResource(R.drawable.the_end);
        TextView ending = findViewById(R.id.end_screen_text_view);
        ending.setText("You don`t remember how you got here, but it is lovely. The trees are a lush green, a gentle breeze blows, and the pine straw is soft beneath your feet... too soft? Suddenly a gaping pit opens beneath you! You plummet to instant doom!");
        Button goBack = findViewById(R.id.end_screen_button_view);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goBackIntent = new Intent(ThreeActivity.this, MainActivity.class);
                startActivity(goBackIntent);
            }
        });

    }
}