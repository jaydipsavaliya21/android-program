package com.muproject.mu_android_project;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Activity7Result extends AppCompatActivity {

    TextView u,p;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity7result);

        u = findViewById(R.id.showUser);
        p = findViewById(R.id.showPass);

        String username = getIntent().getStringExtra("username");
        String password = getIntent().getStringExtra("password");

        u.setText("Username : " + username);
        p.setText("Password : " + password);
    }
}