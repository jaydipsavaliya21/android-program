package com.muproject.mu_android_project;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Activity6Success extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity6success);

        tv = findViewById(R.id.showUser);

        String uname = getIntent().getStringExtra("username");

        tv.setText("Welcome " + uname);
    }
}