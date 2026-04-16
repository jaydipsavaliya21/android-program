package com.muproject.mu_android_project;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.appcompat.app.AppCompatActivity;

public class Activity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_11);

        ToggleButton toggleButton = findViewById(R.id.toggleButton);
        final TextView textView = findViewById(R.id.toggleStatus);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textView.setText("ToggleButton is ON");
                } else {
                    textView.setText("ToggleButton is OFF");
                }
            }
        });
    }
}
