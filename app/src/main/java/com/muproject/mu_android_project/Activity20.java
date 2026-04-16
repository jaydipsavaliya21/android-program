package com.muproject.mu_android_project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Activity20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_20);

        final RatingBar ratingBar = findViewById(R.id.ratingBar);
        Button btnGetRating = findViewById(R.id.btnGetRating);

        btnGetRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float rating = ratingBar.getRating();
                Toast.makeText(Activity20.this, "Rating: " + rating, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
