package com.muproject.mu_android_project;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.view.animation.RotateAnimation;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class Activity30 extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_30);

        imageView = findViewById(R.id.imageViewAnim);

        Button btnAlpha = findViewById(R.id.btnAlpha);
        Button btnScale = findViewById(R.id.btnScale);
        Button btnTranslate = findViewById(R.id.btnTranslate);
        Button btnRotate = findViewById(R.id.btnRotate);

        btnAlpha.setOnClickListener(v -> {
            Animation alpha = new AlphaAnimation(0.0f, 1.0f);
            alpha.setDuration(1000);
            imageView.startAnimation(alpha);
        });

        btnScale.setOnClickListener(v -> {
            Animation scale = new ScaleAnimation(1.0f, 2.0f, 1.0f, 2.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
            scale.setDuration(1000);
            imageView.startAnimation(scale);
        });

        btnTranslate.setOnClickListener(v -> {
            Animation translate = new TranslateAnimation(0, 200, 0, 0);
            translate.setDuration(1000);
            imageView.startAnimation(translate);
        });

        btnRotate.setOnClickListener(v -> {
            Animation rotate = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
            rotate.setDuration(1000);
            imageView.startAnimation(rotate);
        });
    }
}
