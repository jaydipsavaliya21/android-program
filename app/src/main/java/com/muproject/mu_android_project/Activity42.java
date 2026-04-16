package com.muproject.mu_android_project;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Activity42 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_42);

        Button startBtn = findViewById(R.id.startServiceBtn);
        Button stopBtn = findViewById(R.id.stopServiceBtn);

        startBtn.setOnClickListener(v -> startService(new Intent(this, MyDemoService.class)));
        stopBtn.setOnClickListener(v -> stopService(new Intent(this, MyDemoService.class)));
    }
}
