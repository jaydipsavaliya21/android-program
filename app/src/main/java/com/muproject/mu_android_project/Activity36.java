package com.muproject.mu_android_project;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class Activity36 extends AppCompatActivity {

    private AnimationDrawable frameAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_36);

        ImageView animImg = findViewById(R.id.animImg);
        animImg.setBackgroundResource(R.drawable.custom_animation);
        frameAnimation = (AnimationDrawable) animImg.getBackground();

        Button btnStartAnim = findViewById(R.id.btnStartAnim);
        Button btnStopAnim = findViewById(R.id.btnStopAnim);

        btnStartAnim.setOnClickListener(v -> frameAnimation.start());
        btnStopAnim.setOnClickListener(v -> frameAnimation.stop());
    }
}
